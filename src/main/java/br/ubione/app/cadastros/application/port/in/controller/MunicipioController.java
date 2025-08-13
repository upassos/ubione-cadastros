package br.ubione.app.cadastros.application.port.in.controller;

import java.util.List;
import java.util.UUID;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.ubione.app.cadastros.application.service.MunicipioService;
import br.ubione.app.cadastros.domain.model.Municipio;

@RestController
@RequestMapping("/municipios")
public class MunicipioController {

    private final MunicipioService municipioService;

    public MunicipioController(MunicipioService municipioService) {
        this.municipioService = municipioService;
    }

    @GetMapping
    public ResponseEntity<List<Municipio>> listarTodos() {
        return ResponseEntity.ok(municipioService.listarTodos());
    }

    @GetMapping("/codibge/{codigo}")
    public ResponseEntity<Municipio> buscarPorCodibge(@PathVariable String codigo) {
        Municipio municipio = municipioService.buscarPorCodibge(codigo);
        return municipio != null ? ResponseEntity.ok(municipio) : ResponseEntity.notFound().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Municipio> buscarPorId(@PathVariable UUID id) {
        Municipio municipio = municipioService.buscarPorId(id);
        return municipio != null ? ResponseEntity.ok(municipio) : ResponseEntity.notFound().build();
    }

    @GetMapping("/uf/{ufId}")
    public ResponseEntity<List<Municipio>> buscarPorUfId(@PathVariable UUID ufId) {
        return ResponseEntity.ok(municipioService.buscarPorUfId(ufId));
    }

    @GetMapping("/nome/{nome}")
    public ResponseEntity<List<Municipio>> buscarPorNome(@PathVariable String nome) {
        return ResponseEntity.ok(municipioService.buscarPorNome(nome));
    }
}

