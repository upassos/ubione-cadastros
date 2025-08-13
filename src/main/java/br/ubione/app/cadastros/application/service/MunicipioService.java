package br.ubione.app.cadastros.application.service;

import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import br.ubione.app.cadastros.application.port.in.usecase.MunicipioUseCase;
import br.ubione.app.cadastros.application.port.out.MunicipioRepository;
import br.ubione.app.cadastros.domain.model.Municipio;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class MunicipioService implements MunicipioUseCase{
	
    private final MunicipioRepository repository;
	
	@Override
	public List<Municipio> listarTodos() {
		return repository.findAll();
	}

	@Override
	public Municipio buscarPorCodibge(String codigo) {
		return repository.findByCodibge(codigo);
	}

	@Override
	public Municipio buscarPorId(UUID id) {
		return repository.findById(id);
	}

	@Override
	public List<Municipio> buscarPorUfId(UUID ufId) {
		return repository.findByUFId(ufId);
	}

	@Override
	public List<Municipio> buscarPorNome(String nome) {
		return repository.findByNomeContaining(nome);
	}

}
