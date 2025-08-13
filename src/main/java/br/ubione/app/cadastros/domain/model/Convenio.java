package br.ubione.app.cadastros.domain.model;

import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Convenio {
    private UUID id;
    private String descricao;
    private String sigla;
    private String site;
    private String telefoneContato; 
}

