package br.ubione.app.cadastros.application.port.out;

import java.util.List;
import java.util.UUID;

import br.ubione.app.cadastros.domain.model.Municipio;

public interface MunicipioRepository {
	
	List<Municipio> findAll();
	Municipio findByCodibge(String codigo);
	Municipio findById(UUID id);
	List<Municipio> findByUFId(UUID ufId);
	List<Municipio> findByNomeContaining(String nome);
}
