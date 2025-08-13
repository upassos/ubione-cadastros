package br.ubione.app.cadastros.application.port.in.controller;

import java.util.List;
import java.util.UUID;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.ubione.app.cadastros.application.port.in.usecase.UFUseCase;
import br.ubione.app.cadastros.domain.model.UF;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/ufs")
@RequiredArgsConstructor
public class UFController {
	
	private final UFUseCase service;

	@GetMapping
    public ResponseEntity<List<UF>> listar() {
        return ResponseEntity.ok(service.listarTodos());
    }
	
	@GetMapping("/{id}")
    public ResponseEntity<UF> buscarPorId(@PathVariable UUID id) {
        return ResponseEntity.ok(service.recuperaPorId(id));
    }
	
	@GetMapping("/{sigla}")
    public ResponseEntity<List<UF>> buscarPorSigla(@PathVariable String sigla) {
        return ResponseEntity.ok(service.recuperaPorSigla(sigla));
    }
	
	@GetMapping("/{codibge}")
    public ResponseEntity<UF> buscarPorCodIBGE(@PathVariable int codibge) {
        return ResponseEntity.ok(service.recuperaPorCodIbge(codibge));
    }
	
	@GetMapping("/{nome}")
    public ResponseEntity<List<UF>> buscarPorId(@PathVariable String nome) {
        return ResponseEntity.ok(service.recuperaPorNome(nome));
    }
}
