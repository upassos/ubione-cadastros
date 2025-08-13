package br.ubione.app.cadastros.application.service;

import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import br.ubione.app.cadastros.application.port.in.usecase.ConvenioUseCase;
import br.ubione.app.cadastros.application.port.out.ConvenioRepository;
import br.ubione.app.cadastros.domain.model.Convenio;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ConvenioService implements ConvenioUseCase {
	
    private final ConvenioRepository repository;

    @Override
	public List<Convenio> listarTodos() {
		return repository.findAll();
	}

	@Override
	public Convenio buscarPorId(UUID id) {
		return repository.findById(id);
	}

	@Override
	public List<Convenio> buscarPorSigla(String sigla) {
		return repository.findBySiglaContaining(sigla);
	}

	@Override
	public List<Convenio> buscarPorDescricao(String descricao) {
		return repository.findByDescricaoContaining(descricao);
	}

}
