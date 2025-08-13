package br.ubione.app.cadastros.domain.model;

import java.util.List;
import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UF {
	private UUID id;
	private String codibge;
	private String nome;
	private String sigla;
	private List<Municipio> municipios;
}
