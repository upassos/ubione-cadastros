package br.ubione.app.cadastros.application.port.in.usecase;

import java.util.List;
import java.util.UUID;

import br.ubione.app.cadastros.domain.model.UF;

public interface UFUseCase {

	List<UF> listarTodos();
	UF recuperaPorCodIbge(String codigo);
	UF recuperaPorId(UUID id);
	List<UF> recuperaPorSigla(String sigla);
	List<UF> recuperaPorNome(String nome);
	
}
