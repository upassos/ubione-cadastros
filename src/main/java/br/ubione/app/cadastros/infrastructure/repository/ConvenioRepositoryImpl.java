package br.ubione.app.cadastros.infrastructure.repository;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

import org.springframework.stereotype.Repository;

import br.ubione.app.cadastros.application.port.out.ConvenioRepository;
import br.ubione.app.cadastros.domain.model.Convenio;
import br.ubione.app.cadastros.infrastructure.mapper.ConvenioMapper;
import br.ubione.app.cadastros.infrastructure.repository.jpa.ConvenioJpaRepository;
import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
public class ConvenioRepositoryImpl implements ConvenioRepository{
	
	private final ConvenioJpaRepository jpa;

	@Override
	public List<Convenio> findAll() {
		return jpa.findAll().stream().map(ConvenioMapper::toDomain).collect(Collectors.toList());
	}

	@Override
	public Convenio findById(UUID id) {
		return jpa.findById(id).map(ConvenioMapper::toDomain).orElse(null);
	}

	@Override
	public List<Convenio> findBySiglaContaining(String sigla) {
		return jpa.findBySiglaContaining(sigla).stream().map(ConvenioMapper::toDomain).collect(Collectors.toList());
	}

	@Override
	public List<Convenio> findByDescricaoContaining(String descricao) {
		return jpa.findByDescricaoContaining(descricao).stream().map(ConvenioMapper::toDomain).collect(Collectors.toList());
	}

}
