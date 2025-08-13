package br.ubione.app.cadastros.infrastructure.repository;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

import br.ubione.app.cadastros.application.dto.PacienteFiltroDTO;
import br.ubione.app.cadastros.application.port.out.PacienteRepository;
import br.ubione.app.cadastros.domain.model.Paciente;
import br.ubione.app.cadastros.infrastructure.mapper.PacienteMapper;
import br.ubione.app.cadastros.infrastructure.repository.jpa.PacienteJpaRepository;
import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
public class PacienteRepositoryImpl implements PacienteRepository {

    private final PacienteJpaRepository jpa;

    public Paciente save(Paciente p) {
        return PacienteMapper.toDomain(jpa.save(PacienteMapper.toEntity(p)));
    }

    public Paciente findById(UUID id) {
        return jpa.findById(id).map(PacienteMapper::toDomain).orElse(null);
    }

    public List<Paciente> findAll() {
        return jpa.findAll().stream().map(PacienteMapper::toDomain).collect(Collectors.toList());
    }

    public Paciente update(Paciente p) {
        return save(p);
    }

    public void delete(UUID id) {
        jpa.deleteById(id);
    }

	@Override
	public Page<Paciente> listarPaginado(PacienteFiltroDTO filtros, Pageable pageable) {
		/*return jpa.buscarComFiltros(
		        filtros.getNomeCompleto(),
		        filtros.getCpf(),
		        filtros.getDataNascimento(),
		        filtros.getLogradouro(),
		        filtros.getBairro(),
		        filtros.getEmail(),
		        filtros.getTelefone(),
		        filtros.getCelular(),
		        filtros.getNumeroCarteira(),
		        pageable*/
		return jpa.buscarComFiltros(pageable
		).map(PacienteMapper::toDomain);

		
	}
}
