package br.ubione.app.cadastros.infrastructure.mapper;

import br.ubione.app.cadastros.domain.model.UF;
import br.ubione.app.cadastros.infrastructure.entity.UFEntity;

public class UFMapper {
    
    public static UF toDomain(UFEntity e) {
        if (e == null) return null;

        return UF.builder()
                .id(e.getId())
                .nome(e.getNome())
                .codibge(e.getCodibge())
                .sigla(e.getSigla())
                .municipios(
                    e.getMunicipios() != null
                        ? e.getMunicipios().stream()
                              .map(MunicipioMapper::toDomain) // precisa ter esse mapper também
                              .toList()
                        : null
                )
                .build();
    }
    
    public static UFEntity toEntity(UF e) {
        if (e == null) return null;

        return UFEntity.builder()
                .id(e.getId())
                .nome(e.getNome())
                .codibge(e.getCodibge())
                .sigla(e.getSigla())
                .municipios(
                    e.getMunicipios() != null
                        ? e.getMunicipios().stream()
                              .map(MunicipioMapper::toEntity) // precisa ter esse mapper também
                              .toList()
                        : null
                )
                .build();
    }
}
