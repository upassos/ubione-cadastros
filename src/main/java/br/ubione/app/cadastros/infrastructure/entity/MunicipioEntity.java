package br.ubione.app.cadastros.infrastructure.entity;

import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "cad_municipio", schema = "med_db")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MunicipioEntity {

	@Id
    @GeneratedValue
    private UUID id;
    
    @Column(name = "codibge", nullable = false)
    private String codibge;
    
    @Column(name = "nome", nullable = false)
    private String nome;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "uf_id", nullable = false, referencedColumnName = "id")
    private UFEntity uf;
    
}
