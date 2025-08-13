package br.ubione.app.cadastros.application.service;

import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import br.ubione.app.cadastros.application.port.in.usecase.UFUseCase;
import br.ubione.app.cadastros.application.port.out.UFRepository;
import br.ubione.app.cadastros.domain.model.UF;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UFService implements UFUseCase{
	
    private final UFRepository repository;

    @Override
	public List<UF> listarTodos() {
    	return repository.findAll();
	}

	@Override
	public UF recuperaPorCodIbge(int codigo) {
		return repository.findByCodibge(codigo);
	}

	@Override
	public UF recuperaPorId(UUID id) {
		return repository.findById(id);
	}

	@Override
	public List<UF> recuperaPorSigla(String sigla) {
		return repository.findBySiglaContaining(sigla);
	}

	@Override
	public List<UF> recuperaPorNome(String nome) {
		return repository.findByNomeContaining(nome);
	}

}
