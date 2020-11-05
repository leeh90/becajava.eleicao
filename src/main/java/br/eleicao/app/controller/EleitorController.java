package br.eleicao.app.controller;

import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.eleicao.app.model.Eleitor;
import br.eleicao.app.repository.EleitorRepository;

@RestController
@RequestMapping("/votos")
public class EleitorController {

	final EleitorRepository _eleitorRepository;

	public EleitorController(EleitorRepository eleitorRepository) {
		_eleitorRepository = eleitorRepository;
	}
	
	@PostMapping
	public ResponseEntity inserir(@RequestBody Eleitor eleitor) {
		_eleitorRepository.save(eleitor); // Utilizando o metodo do objeto _municipioRepository para salvar o objeto
												// da classe 
		return ResponseEntity.status(HttpStatus.CREATED).body("Eleitor criado com sucesso!");
	}
	
	@GetMapping
	public ResponseEntity listar() {
		Iterable<Eleitor> eleirores = _eleitorRepository.findAll(); //Iterable <ListaDeCandidato> candidato = recebe (_candidatoRepository).findAll() << Metodo para retornar todas 
		return ResponseEntity.status(HttpStatus.OK).body(eleirores);
	}
	
	
	@GetMapping(path = "/{id}")
    public ResponseEntity obter(@PathVariable Long id) {    	  	    	
		Optional<Eleitor> eleitor = _eleitorRepository.findById(id);    	
        return ResponseEntity.status(HttpStatus.OK).body(eleitor);
        
    }
	@PutMapping(path = "/{id}")
	public ResponseEntity atualizar(@RequestBody Eleitor eleitor, @PathVariable Long id) {
		return ResponseEntity.status(HttpStatus.OK).body(eleitor);
	}

	@DeleteMapping(path = "/{id}")
	public ResponseEntity delete(@PathVariable Long id) {
		return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
	}
}
