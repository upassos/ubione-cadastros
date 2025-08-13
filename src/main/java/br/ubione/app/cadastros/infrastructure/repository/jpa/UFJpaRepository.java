package br.ubione.app.cadastros.infrastructure.repository.jpa;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import br.ubione.app.cadastros.infrastructure.entity.UFEntity;

public interface UFJpaRepository extends JpaRepository<UFEntity, UUID>{

	Optional <UFEntity> findByCodibge(String codigo);

	List<UFEntity> findBySiglaContaining(String sigla);
	
	List<UFEntity> findByNomeContaining(String nome);

}
