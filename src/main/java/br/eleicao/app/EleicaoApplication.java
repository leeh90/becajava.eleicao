package br.eleicao.app;

import java.util.Optional;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.eleicao.app.model.Candidato;
import br.eleicao.app.model.Eleitor;
import br.eleicao.app.model.Municipio;
import br.eleicao.app.model.Voto;
import br.eleicao.app.model.Zona;
import br.eleicao.app.repository.CandidatoRepository;
import br.eleicao.app.repository.EleitorRepository;
import br.eleicao.app.repository.MunicipioRepository;
import br.eleicao.app.repository.VotoRepository;
import br.eleicao.app.repository.ZonaRepository;

@SpringBootApplication
public class EleicaoApplication implements CommandLineRunner {

//	final MunicipioRepository _municipioRepository; //Criando propriedade da interface municipio
//	final EleitorRepository _eleitorRepository;
//	final CandidatoRepository _candidatoRepository;
//	final VotoRepository _votoRepository;
//	final ZonaRepository _zonaRepository;
//	

//	public EleicaoApplication(MunicipioRepository municipioRepository){
//		this._municipioRepository = municipioRepository; //Alimentando a propriedade com a construção da classe
//		
//	}
//	
//	public EleicaoApplication(EleitorRepository eleitorRepository) {
//		this._eleitorRepository = eleitorRepository;
//	}
//	public EleicaoApplication(CandidatoRepository candidatoRepository) {
//		this._candidatoRepository = candidatoRepository;
//	}
//	public EleicaoApplication(ZonaRepository zonaRepository) {
//		this._zonaRepository = zonaRepository;
//	}
//	public EleicaoApplication(VotoRepository votoRepository) {
//		this._votoRepository = votoRepository;
//	}

	public static void main(String[] args) {
		SpringApplication.run(EleicaoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		// Salvar Município
//		Municipio municipio = new Municipio();
//		municipio.setNome("São Paulo");
//		municipio.setPopulacao(14000000);		
//		_municipioRepository.save(municipio);		
//		System.out.println("Município salvo com sucesso!");		
//		
//		municipio = new Municipio();
//		municipio.setNome("Sorocaba");
//		municipio.setPopulacao(140000);		
//		_municipioRepository.save(municipio);		
//		System.out.println("Município salvo com sucesso!");		
//		
//		municipio = new Municipio();
//		municipio.setNome("Guarulhos");
//		municipio.setPopulacao(1400000);		
//		_municipioRepository.save(municipio);		
//		System.out.println("Município salvo com sucesso!");		
//		

		/*
		 * SALVAR ___________________________________________________________________
		 * 
		 * Eleitor eleitor = new Eleitor();
		 * eleitor.setNome("Leandro Vinicius de Oliveira Nascimento");
		 * _eleitorRepository.save(eleitor);
		 * System.out.println("Eleitor salvo com sucesso!");
		 * 
		 * Candidato candidato = new Candidato(); candidato.setNome("Celso Russumano");
		 * candidato.getMunicipio(); candidato.setNumero("0007810");
		 * candidato.setTipoCandidato("Prefeito"); _candidatoRepository.save(candidato);
		 * System.out.println("Candidato salvo com sucesso!");
		 * 
		 * Zona zona = new Zona(); zona.setNome("240"); _zonaRepository.save(zona);
		 * System.out.println("Zona Eleitoral salva com sucesso!");
		 * 
		 * ________ TENTATIVA SALVAR VOTO___________ Voto voto = new Voto(); Candidato
		 * candidato = new Candidato(); Eleitor eleitor = new Eleitor(); Zona zona = new
		 * Zona(); //voto.setId(voto); voto.setId(candidato.getId());
		 * voto.setId(eleitor.getId()); voto.setId(zona.getId());
		 * _______________________________________________________________________________________
		 */

		// Deletando um município
//		Municipio municipio = new Municipio();		
//		municipio.setId(new Long(2));
//		_municipioRepository.delete(municipio);;
//		System.out.println("Município deletado com sucesso!");
//		

		/*
		 * DELETAR
		 * _______________________________________________________________________________
		 * 
		 * Eleitor eleitor = new Eleitor(); eleitor.setId(new Long(1));
		 * _eleitorRepository.delete(eleitor);;
		 * System.out.println("Eleitor deletado com sucesso!");
		 * 
		 * Candidato candidato = new Candidato(); candidato.setId(new Long(1));
		 * _candidatoRepository.delete(candidato);;
		 * System.out.println("Candidato deletado com sucesso!");
		 * 
		 * Zona zona = new Zona(); zona.setId(new Long(1));
		 * _zonaRepository.delete(zona);;
		 * System.out.println("Zona Eleitoral deletada com sucesso!");
		 * 
		 * Voto voto = new Voto(); voto.setId(new Long(1));
		 * _votoRepository.delete(voto);;
		 * System.out.println("Voto deletado com sucesso!");
		 * 
		 * _________________________________________________________________________________________
		 */
		
//		 Atualizando um município
//		Municipio municipio = new Municipio();
//		municipio.setId(new Long(2));
//		municipio.setNome("São Paulo");
//		municipio.setPopulacao(14000000);		
//		_municipioRepository.save(municipio);		
//		System.out.println("Município atualizado com sucesso!");	
//		

		/*
		 * ATUALIZAR
		 * _______________________________________________________________________________
		 * 
		 * 
		 * Eleitor eleitor = new Eleitor(); eleitor.setId(new Long(1));
		 * eleitor.setNome("Roberto Carlos"); _eleitorRepository.save(eleitor);
		 * System.out.println("Eleitor atualizado com sucesso!");
		 * 
		 * Candidato candidato = new Candidato(); candidato.setId(new Long(1));
		 * candidato.setNome("Roberto Carlos Neto"); candidato.setNumero("800000");
		 * candidato.setTipoCandidato("Presidente");
		 * _candidatoRepository.save(candidato);
		 * System.out.println("Candidato atualizado com sucesso!");
		 * 
		 * Zona zona = new Zona(); zona.setId(new Long(1)); zona.setNome("310");
		 * _zonaRepository.save(zona);
		 * System.out.println("Zona Eleitoral atualizado com sucesso!");
		 * 
		 * Voto voto = new Voto(); voto.setId(new Long(1)); _votoRepository.save(voto);
		 * System.out.println("Voto atualizado com sucesso!");
		 * _________________________________________________________________________________________
		 */

		// Selecionando apenas UM município
//		Optional<Municipio> municipio = _municipioRepository.findById(new Long(2));
//		System.out.println("Município: " + municipio.get().getNome());
//		

		/*
		 * SELECIONAR UM
		 * _______________________________________________________________________________
		 * 
		 * Optional<Eleitor> eleitor = _eleitorRepository.findById(new Long(1));
		 * System.out.println("Eleitor: " + eleitor.get().getNome());
		 * 
		 * Optional<Candidato> candidato = _candidatoRepository.findById(new Long(1));
		 * System.out.println("Candidato: " + candidato.get().getNome());
		 * 
		 * Optional<Zona> Zona = _zonaRepository.findById(new Long(1));
		 * System.out.println("Zona: " + zona.get().getNome());
		 * 
		 * Optional<Voto> voto = _votoRepository.findById(new Long(1));
		 * System.out.println("Voto: " + voto.get().getNome());
		 * _________________________________________________________________________________________
		 */

//		Selecionando todos os municípios
//		Iterable<Municipio> municipios = _municipioRepository.findAll();		
//		for(Municipio m : municipios) {
//			System.out.println("Município: " + m.getNome());
//		}

		/*
		 * SELECIONAR TODOS
		 * _________________________________________________________________________________________
		 * 
		 * 
		 * Iterable<Eleitor> eleitores = _eleitorRepository.findAll(); for(Eleitor e :
		 * eleitores) { System.out.println("Eleitores: " + e.getNome()); }
		 * 
		 * Iterable<Candidato> candidatos = _candidatoRepository.findAll();
		 * for(Candidato c : candidatos) { System.out.println("Candidatos: " +
		 * c.getNome()); }
		 * 
		 * Iterable<Zona> zonas = _zonaRepository.findAll(); for(Zona z : zonas) {
		 * System.out.println("Zonas Eleitorais: " + z.getNome()); }
		 * 
		 * Iterable<Voto> votos = _votosRepository.findAll(); for(Votos v : votos) {
		 * System.out.println("Votos: " + v.getNome()); }
		 */

	}

}
