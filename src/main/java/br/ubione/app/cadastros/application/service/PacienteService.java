package br.ubione.app.cadastros.application.service;

import java.util.List;
import java.util.UUID;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import br.ubione.app.cadastros.application.dto.PacienteFiltroDTO;
import br.ubione.app.cadastros.application.port.in.usecase.PacienteUseCase;
import br.ubione.app.cadastros.application.port.out.PacienteRepository;
import br.ubione.app.cadastros.domain.model.Paciente;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class PacienteService implements PacienteUseCase {

    private final PacienteRepository repository;

    public Paciente salvar(Paciente paciente) {
        return repository.save(paciente);
    }

    public Paciente buscarPorId(UUID id) {
        return repository.findById(id);
    }

    public List<Paciente> listarTodos() {
        return repository.findAll();
    }

    public Paciente atualizar(UUID id, Paciente paciente) {
        paciente.setId(id);
        return repository.update(paciente);
    }

    public void deletar(UUID id) {
        repository.delete(id);
    }

	@Override
	public Page<Paciente> listarPaginado(PacienteFiltroDTO filtros, Pageable pageable) {
		return repository.listarPaginado(filtros, pageable);
	}
}
