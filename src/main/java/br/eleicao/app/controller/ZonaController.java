package br.eleicao.app.controller;

import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.eleicao.app.model.Zona;
import br.eleicao.app.repository.ZonaRepository;

@RestController
@RequestMapping("/zonas")
public class ZonaController {
	
	final ZonaRepository _zonaRepository; // Criando propriedade da interface Municipio

	// Construtor
	public ZonaController(ZonaRepository zonaRepository) {
		_zonaRepository = zonaRepository; // Alimentando a propriedade com a cosntrução da classe

	}
	
	// Criando os metodos POST e GET

		@PostMapping
		public ResponseEntity inserir(@RequestBody Zona zona) {
			_zonaRepository.save(zona); // Utilizando o metodo do objeto _municipioRepository para salvar o objeto
													// da classe 
			return ResponseEntity.status(HttpStatus.CREATED).body("Zona Eleitoral criado com sucesso!");
		}

		@GetMapping
		public ResponseEntity listar() {
			Iterable<Zona> zonas = _zonaRepository.findAll();
			return ResponseEntity.status(HttpStatus.OK).body(zonas);
		}
		
		@GetMapping(path = "/{id}")
	    public ResponseEntity obter(@PathVariable Long id) {    	  	    	
			Optional<Zona> zona = _zonaRepository.findById(id);    	
	        return ResponseEntity.status(HttpStatus.OK).body(zona);
	        
	    }
		@PutMapping(path = "/{id}")
		public ResponseEntity atualizar(@RequestBody Zona zona, @PathVariable Long id) {
			return ResponseEntity.status(HttpStatus.OK).body(zona);
		}
		


}
