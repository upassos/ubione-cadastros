package br.ubione.app.cadastros.application.port.out;

import java.util.List;
import java.util.UUID;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import br.ubione.app.cadastros.application.dto.PacienteFiltroDTO;
import br.ubione.app.cadastros.domain.model.Paciente;

public interface PacienteRepository {
    Paciente save(Paciente paciente);
    Paciente findById(UUID id);
    List<Paciente> findAll();
    Paciente update(Paciente paciente);
    Page<Paciente> listarPaginado(PacienteFiltroDTO filtros, Pageable pageable);
    void delete(UUID id);
}