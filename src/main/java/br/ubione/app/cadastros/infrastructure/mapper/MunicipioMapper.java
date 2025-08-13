package br.ubione.app.cadastros.infrastructure.mapper;

import br.ubione.app.cadastros.domain.model.Municipio;
import br.ubione.app.cadastros.infrastructure.entity.MunicipioEntity;

public class MunicipioMapper {

    public static Municipio toDomain(MunicipioEntity e) {
        if (e == null) return null;

        return Municipio.builder()
                .id(e.getId())
                .codibge(e.getCodibge())
                .nome(e.getNome())
                .build();
    }

    public static MunicipioEntity toEntity(Municipio e) {
        if (e == null) return null;

        return MunicipioEntity.builder()
                .id(e.getId())
                .codibge(e.getCodibge())
                .nome(e.getNome())
                .build();
    }
}
