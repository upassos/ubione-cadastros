package br.ubione.app.cadastros.infrastructure.repository.jpa;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import br.ubione.app.cadastros.infrastructure.entity.MunicipioEntity;


public interface MunicipioJpaRepository extends JpaRepository<MunicipioEntity, UUID>{

	Optional <MunicipioEntity> findByCodibge(String codigo);

	List<MunicipioEntity> findByUf_Id(UUID ufId);
	
	List<MunicipioEntity> findByNomeContaining(String nome);
	
}