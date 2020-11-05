package br.eleicao.app.controller;

import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import br.eleicao.app.model.Candidato;
import br.eleicao.app.model.Municipio;
import br.eleicao.app.repository.CandidatoRepository;

@RestController
@RequestMapping("/candidatos")
public class CandidatoController {

	final CandidatoRepository _candidatoRepository;

	// Construtor
	public CandidatoController(CandidatoRepository candidatoRepository) {
		_candidatoRepository = candidatoRepository;

	}
	
	//Metodos POST and GET
	
	@PostMapping
	public ResponseEntity inserir(@RequestBody Candidato candidato) {
		_candidatoRepository.save(candidato); // Utilizando o metodo do objeto _municipioRepository para salvar o objeto
												// da classe Municipio
		return ResponseEntity.status(HttpStatus.CREATED).body("Candidato criado com sucesso!");
	}
	
	@GetMapping
	public ResponseEntity listar() {
		Iterable<Candidato> candidatos = _candidatoRepository.findAll(); //Iterable <ListaDeCandidato> candidato = recebe (_candidatoRepository).findAll() << Metodo para retornar todas 
		return ResponseEntity.status(HttpStatus.OK).body(candidatos);
	}
	
	
	@GetMapping(path = "/{id}")
    public ResponseEntity obter(@PathVariable Long id) {    	  	    	
		Optional<Candidato> candidato = _candidatoRepository.findById(id);    	
        return ResponseEntity.status(HttpStatus.OK).body(candidato);
        
    }
	@PutMapping(path = "/{id}")
	public ResponseEntity atualizar(@RequestBody Candidato candidato, @PathVariable Long id) {
		return ResponseEntity.status(HttpStatus.OK).body(candidato);
	}
	

	@DeleteMapping(path = "/{id}")
	public ResponseEntity delete(@PathVariable Long id) {
		return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
	}
	
}
