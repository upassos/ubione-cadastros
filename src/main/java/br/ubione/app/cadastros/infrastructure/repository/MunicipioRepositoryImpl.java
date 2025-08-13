package br.ubione.app.cadastros.infrastructure.repository;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

import org.springframework.stereotype.Repository;

import br.ubione.app.cadastros.application.port.out.MunicipioRepository;
import br.ubione.app.cadastros.domain.model.Municipio;
import br.ubione.app.cadastros.infrastructure.mapper.MunicipioMapper;
import br.ubione.app.cadastros.infrastructure.repository.jpa.MunicipioJpaRepository;
import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
public class MunicipioRepositoryImpl implements MunicipioRepository{
	
	private final MunicipioJpaRepository jpa;
	
	@Override
	public List<Municipio> findAll() {
		return jpa.findAll().stream().map(MunicipioMapper::toDomain).collect(Collectors.toList());
	}

	@Override
	public Municipio findByCodibge(String codigo) {
		return jpa.findByCodibge(codigo).map(MunicipioMapper::toDomain).orElse(null);
	}

	@Override
	public Municipio findById(UUID id) {
		return jpa.findById(id).map(MunicipioMapper::toDomain).orElse(null);
	}

	@Override
	public List<Municipio> findByUFId(UUID ufId) {
		return jpa.findByUf_Id(ufId).stream().map(MunicipioMapper::toDomain).collect(Collectors.toList());
	}

	@Override
	public List<Municipio> findByNomeContaining(String nome) {
		return jpa.findByNomeContaining(nome).stream().map(MunicipioMapper::toDomain).collect(Collectors.toList());
	}

}
