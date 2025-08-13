package br.ubione.app.cadastros.infrastructure.entity;

import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "cad_convenio", schema = "med_db")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ConveniosEntity {

	@Id
    @GeneratedValue
    private UUID id;
    
    @Column(name = "descricao", nullable = false)
    private String descricao;
    
    @Column(name = "sigla", nullable = false)
    private String sigla;   
    
    @Column(name = "site", nullable = false)
    private String site;
    
    @Column(name = "telefone_contato", nullable = false)
    private String telefoneContato;
    
}