package br.ubione.app.cadastros.application.port.out;

import java.util.List;
import java.util.UUID;

import br.ubione.app.cadastros.domain.model.Convenio;

public interface ConvenioRepository {
	
	List<Convenio> findAll();
	Convenio findById(UUID id);
	List<Convenio> findBySiglaContaining(String sigla);
	List<Convenio> findByDescricaoContaining(String descricao);
	
}
