package br.ubione.app.cadastros.application.port.out;

import java.util.List;
import java.util.UUID;

import br.ubione.app.cadastros.domain.model.UF;

public interface UFRepository {

	List<UF> findAll();
	UF findByCodibge(int codigo);
	UF findById(UUID id);
	List<UF> findBySiglaContaining(String sigla);
	List<UF> findByNomeContaining(String nome);
}