package br.ubione.app.cadastros.infrastructure.repository.jpa;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import br.ubione.app.cadastros.infrastructure.entity.ConveniosEntity;

public interface ConvenioJpaRepository extends JpaRepository<ConveniosEntity, UUID>{
	
	List<ConveniosEntity> findByDescricaoContaining(String descricao);
	
	List<ConveniosEntity> findBySiglaContaining(String sigla);
}

