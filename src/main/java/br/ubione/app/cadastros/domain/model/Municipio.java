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
public class Municipio {
    private UUID id;
    private String codibge; 
    private String nome;
}
