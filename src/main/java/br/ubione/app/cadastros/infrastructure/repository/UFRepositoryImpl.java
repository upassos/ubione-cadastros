package br.ubione.app.cadastros.infrastructure.repository;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

import org.springframework.stereotype.Repository;

import br.ubione.app.cadastros.application.port.out.UFRepository;
import br.ubione.app.cadastros.domain.model.UF;
import br.ubione.app.cadastros.infrastructure.mapper.UFMapper;
import br.ubione.app.cadastros.infrastructure.repository.jpa.UFJpaRepository;
import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
public class UFRepositoryImpl implements UFRepository {
	
	private final UFJpaRepository jpa;
	
	@Override
	public List<UF> findAll() {
		return jpa.findAll().stream().map(UFMapper::toDomain).collect(Collectors.toList());
	}
	
	@Override
	public UF findByCodibge(String codigo) {
		return jpa.findByCodibge(codigo).map(UFMapper::toDomain).orElse(null);
	}
	
	@Override
	public UF findById(UUID id) {
		return jpa.findById(id).map(UFMapper::toDomain).orElse(null);
	}

	@Override
	public List<UF> findBySiglaContaining(String sigla) {
		return jpa.findBySiglaContaining(sigla).stream().map(UFMapper::toDomain).collect(Collectors.toList());
	}

	@Override
	public List<UF> findByNomeContaining(String nome) {
		return jpa.findByNomeContaining(nome).stream().map(UFMapper::toDomain).collect(Collectors.toList());
	}

}
