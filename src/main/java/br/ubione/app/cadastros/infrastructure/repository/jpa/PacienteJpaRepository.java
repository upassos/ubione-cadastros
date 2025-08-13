package br.ubione.app.cadastros.infrastructure.repository.jpa;

import java.util.UUID;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.ubione.app.cadastros.infrastructure.entity.PacienteEntity;

public interface PacienteJpaRepository extends JpaRepository<PacienteEntity, UUID> {

	
	/*@Query("""
		    SELECT p FROM PacienteEntity p
		    WHERE (:nomeCompleto IS NULL OR LOWER(p.nomeCompleto) LIKE LOWER(CONCAT('%', :nomeCompleto, '%')))
		    AND (:cpf IS NULL OR p.cpf = :cpf)
		    AND (:dataNascimento IS NULL OR p.dataNascimento = :dataNascimento)
		    AND (:logradouro IS NULL OR LOWER(p.logradouro) LIKE LOWER(CONCAT('%', :logradouro, '%')))
		    AND (:bairro IS NULL OR LOWER(p.bairro) LIKE LOWER(CONCAT('%', :bairro, '%')))
		    AND (:email IS NULL OR LOWER(p.email) LIKE LOWER(CONCAT('%', :email, '%')))
		    AND (:telefone IS NULL OR LOWER(p.telefone) LIKE LOWER(CONCAT('%', :telefone, '%')))
		    AND (:celular IS NULL OR LOWER(p.celular) LIKE LOWER(CONCAT('%', :celular, '%')))
		    AND (:numeroCarteira IS NULL OR LOWER(p.numeroCarteira) LIKE LOWER(CONCAT('%', :numeroCarteira, '%')))
		""")
		Page<PacienteEntity> buscarComFiltros(
		    @Param("nomeCompleto") String nomeCompleto,
		    @Param("cpf") String cpf,
		    @Param("dataNascimento") LocalDate dataNascimento,
		    @Param("logradouro") String logradouro,
		    @Param("bairro") String bairro,
		    @Param("email") String email,
		    @Param("telefone") String telefone,
		    @Param("celular") String celular,
		    @Param("numeroCarteira") String numeroCarteira,
		    Pageable pageable
		);*/

	
	
	@Query("""
		    SELECT p FROM PacienteEntity p
		    
		""")
		Page<PacienteEntity> buscarComFiltros(
		    Pageable pageable
		);
	
}

