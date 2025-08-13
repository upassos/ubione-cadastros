package br.ubione.app.cadastros.application.port.in.usecase;

import java.util.List;
import java.util.UUID;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import br.ubione.app.cadastros.application.dto.PacienteFiltroDTO;
import br.ubione.app.cadastros.domain.model.Paciente;

public interface PacienteUseCase {
    Paciente salvar(Paciente paciente);
    Paciente buscarPorId(UUID id);
    List<Paciente> listarTodos();
    Page<Paciente> listarPaginado(PacienteFiltroDTO filtros, Pageable pageable);
    Paciente atualizar(UUID id, Paciente paciente);
    void deletar(UUID id);
}
