package br.ubione.app.cadastros.infrastructure.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.UUID;

@Entity
@Table(name = "cad_paciente", schema = "med_db")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PacienteEntity {

    @Id
    @GeneratedValue
    private UUID id;

    @Column(name = "nome_completo", nullable = false)
    private String nomeCompleto;

    @Column(nullable = false, length = 11, unique = true)
    private String cpf;

    @Column(name = "data_nascimento", nullable = false)
    private LocalDate dataNascimento;

    @Column(nullable = false, length = 8)
    private String cep;
    private String logradouro;
    private String numero;
    private String complemento;
    private String bairro;

    @Column(name = "municipio_id", nullable = false)
    private UUID municipioId;

    @Column(name = "uf_id", nullable = false)
    private UUID ufId;

    @Column(nullable = false)
    private String email;
    private String telefone;
    private String celular;
    private byte[] foto;

    @Column(name = "convenio_id")
    private UUID convenioId;

    @Column(name = "numero_carteira")
    private String numeroCarteira;
}

