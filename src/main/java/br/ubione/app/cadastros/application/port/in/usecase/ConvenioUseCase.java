package br.ubione.app.cadastros.application.port.in.usecase;

import java.util.List;
import java.util.UUID;

import br.ubione.app.cadastros.domain.model.Convenio;

public interface ConvenioUseCase {
    List<Convenio> listarTodos();
    Convenio buscarPorId(UUID id);
    List<Convenio> buscarPorSigla(String sigla);
    List<Convenio> buscarPorDescricao(String descricao);
}