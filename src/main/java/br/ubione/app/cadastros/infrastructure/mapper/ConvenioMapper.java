package br.ubione.app.cadastros.infrastructure.mapper;

import br.ubione.app.cadastros.domain.model.Convenio;
import br.ubione.app.cadastros.infrastructure.entity.ConveniosEntity;

public class ConvenioMapper {

    public static Convenio toDomain(ConveniosEntity e) {
        if (e == null) return null;

        return Convenio.builder()
                .id(e.getId())
                .descricao(e.getDescricao())
                .sigla(e.getSigla())
                .site(e.getSite())
                .telefoneContato(e.getTelefoneContato()) 
                .build();
    }

    public static ConveniosEntity toEntity(Convenio e) {
        if (e == null) return null;

        return ConveniosEntity.builder()
                .id(e.getId())
                .descricao(e.getDescricao())
                .sigla(e.getSigla())
                .site(e.getSite())
                .telefoneContato(e.getTelefoneContato()) 
                .build();
    }
}
