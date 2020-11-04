package br.eleicao.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Voto {
	@Id //Transforma o campo em chave primária
	@GeneratedValue(strategy = GenerationType.IDENTITY) //Cria um identity no campo = auto incremento
	private Long Id;

	@ManyToOne
	@JoinColumn(name = "CandidatoId")
	private Candidato Candidato;

	@ManyToOne
	@JoinColumn(name = "EleitorId")
	private Eleitor Eleitor;
	
	@ManyToOne
	@JoinColumn(name = "ZonaId")
	private Zona Zona;
	
	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}



}
