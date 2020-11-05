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

import br.eleicao.app.model.Voto;
import br.eleicao.app.repository.VotoRepository;

@RestController
@RequestMapping("/votos")
public class VotoController {
	
	final VotoRepository _votoRepository;

	// Construtor
		public VotoController(VotoRepository votoRepository) {
			_votoRepository = votoRepository;

		}
		
		//Metodos POST and GET
		
		@PostMapping
		public ResponseEntity inserir(@RequestBody Voto voto) {
			_votoRepository.save(voto); // Utilizando o metodo do objeto _municipioRepository para salvar o objeto
													// da classe Municipio
			return ResponseEntity.status(HttpStatus.CREATED).body("Voto criado com sucesso!");
		}
		
		@GetMapping
		public ResponseEntity listar() {
			Iterable<Voto> votos = _votoRepository.findAll(); //Iterable <ListaDeCandidato> candidato = recebe (_candidatoRepository).findAll() << Metodo para retornar todas 
			return ResponseEntity.status(HttpStatus.OK).body(votos);
		}
		
		@GetMapping(path = "/{id}")
	    public ResponseEntity obter(@PathVariable Long id) {    	  	    	
			Optional<Voto> voto = _votoRepository.findById(id);    	
	        return ResponseEntity.status(HttpStatus.OK).body(voto);
	        
	    }
		@PutMapping(path = "/{id}")
		public ResponseEntity atualizar(@RequestBody Voto voto, @PathVariable Long id) {
			return ResponseEntity.status(HttpStatus.OK).body(voto);
		}
		

		@DeleteMapping(path = "/{id}")
		public ResponseEntity delete(@PathVariable Long id) {
			return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
		}
		
		
}
