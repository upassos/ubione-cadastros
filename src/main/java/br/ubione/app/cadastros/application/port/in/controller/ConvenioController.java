package br.ubione.app.cadastros.application.port.in.controller;

import java.util.List;
import java.util.UUID;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.ubione.app.cadastros.application.service.ConvenioService;
import br.ubione.app.cadastros.domain.model.Convenio;

@RestController
@RequestMapping("/convenios")
public class ConvenioController {

    private final ConvenioService convenioService;

    public ConvenioController(ConvenioService convenioService) {
        this.convenioService = convenioService;
    }

    @GetMapping
    public ResponseEntity<List<Convenio>> listarTodos() {
        return ResponseEntity.ok(convenioService.listarTodos());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Convenio> buscarPorId(@PathVariable UUID id) {
        Convenio convenio = convenioService.buscarPorId(id);
        return convenio != null ? ResponseEntity.ok(convenio) : ResponseEntity.notFound().build();
    }

    @GetMapping("/sigla/{sigla}")
    public ResponseEntity<List<Convenio>> buscarPorSigla(@PathVariable String sigla) {
        return ResponseEntity.ok(convenioService.buscarPorSigla(sigla));
    }

    @GetMapping("/descricao/{descricao}")
    public ResponseEntity<List<Convenio>> buscarPorDescricao(@PathVariable String descricao) {
        return ResponseEntity.ok(convenioService.buscarPorDescricao(descricao));
    }
}

