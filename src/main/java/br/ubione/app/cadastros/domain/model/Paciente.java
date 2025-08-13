package br.ubione.app.cadastros.domain.model;

import java.time.LocalDate;
import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Paciente {
    private UUID id;
    private String nomeCompleto;
    private String cpf;
    private LocalDate dataNascimento;
    private String cep;
    private String logradouro;
    private String numero;
    private String complemento;
    private String bairro;
    private UUID municipioId;
    private UUID ufId;
    private String email;
    private String telefone;
    private String celular;
    private byte[] foto;
    private UUID convenioId;
    private String numeroCarteira;
}