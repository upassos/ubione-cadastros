package br.ubione.app.cadastros.infrastructure.mapper;

import br.ubione.app.cadastros.domain.model.Paciente;
import br.ubione.app.cadastros.infrastructure.entity.PacienteEntity;

public class PacienteMapper {
    public static Paciente toDomain(PacienteEntity e) {
    	if (e == null) return null;
        return Paciente.builder()
                .id(e.getId())
                .nomeCompleto(e.getNomeCompleto())
                .cpf(e.getCpf())
                .dataNascimento(e.getDataNascimento())
                .cep(e.getCep())
                .logradouro(e.getLogradouro())
                .numero(e.getNumero())
                .complemento(e.getComplemento())
                .bairro(e.getBairro())
                .municipioId(e.getMunicipioId())
                .ufId(e.getUfId())
                .email(e.getEmail())
                .telefone(e.getTelefone())
                .celular(e.getCelular())
                .foto(e.getFoto())
                .convenioId(e.getConvenioId())
                .numeroCarteira(e.getNumeroCarteira())
                .build();
    }

    public static PacienteEntity toEntity(Paciente p) {
    	if (p == null) return null;
        return PacienteEntity.builder()
                .id(p.getId())
                .nomeCompleto(p.getNomeCompleto())
                .cpf(p.getCpf())
                .dataNascimento(p.getDataNascimento())
                .cep(p.getCep())
                .logradouro(p.getLogradouro())
                .numero(p.getNumero())
                .complemento(p.getComplemento())
                .bairro(p.getBairro())
                .municipioId(p.getMunicipioId())
                .ufId(p.getUfId())
                .email(p.getEmail())
                .telefone(p.getTelefone())
                .celular(p.getCelular())
                .foto(p.getFoto())
                .convenioId(p.getConvenioId())
                .numeroCarteira(p.getNumeroCarteira())
                .build();
    }
}