package br.eleicao.app.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import br.eleicao.app.model.Municipio;
import br.eleicao.app.repository.MunicipioRepository;

@RestController
@RequestMapping("/municipios")
public class MunicipioController {

	final MunicipioRepository _municipioRepository; // Criando propriedade da interface Municipio

	// Construtor
	public MunicipioController(MunicipioRepository municipioRepository) {
		_municipioRepository = municipioRepository; // Alimentando a propriedade com a cosntrução da classe

	}

	// Criando os metodos POST e GET

	@PostMapping
	public ResponseEntity inserir(@RequestBody Municipio municipio) {
		_municipioRepository.save(municipio); // Utilizando o metodo do objeto _municipioRepository para salvar o objeto
												// da classe Municipio
		return ResponseEntity.status(HttpStatus.CREATED).body("Municipio criado com sucesso!");
	}

	@GetMapping
	public ResponseEntity listar() {
		Iterable<Municipio> municipios = _municipioRepository.findAll();
		return ResponseEntity.status(HttpStatus.OK).body(municipios);
	}
	
	@GetMapping(path = "/{id}")
    public ResponseEntity obter(@PathVariable Long id) {    	  	    	
		Optional<Municipio> municipio = _municipioRepository.findById(id);    	
        return ResponseEntity.status(HttpStatus.OK).body(municipio);
        
    }
	@PutMapping(path = "/{id}")
	public ResponseEntity atualizar(@RequestBody Municipio municipio, @PathVariable Long id) {
		return ResponseEntity.status(HttpStatus.OK).body(municipio);
	}
	

	@DeleteMapping(path = "/{id}")
	public ResponseEntity delete(@PathVariable Long id) {
		return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
	}
}


