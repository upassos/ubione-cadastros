package br.ubione.app.cadastros.application.port.in.usecase;

import java.util.List;
import java.util.UUID;

import br.ubione.app.cadastros.domain.model.Municipio;

public interface MunicipioUseCase {

    List<Municipio> listarTodos();
    Municipio buscarPorCodibge(String codigo);
    Municipio buscarPorId(UUID id);
    List<Municipio> buscarPorUfId(UUID ufId);
    List<Municipio> buscarPorNome(String nome);
    
}