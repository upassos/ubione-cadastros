package br.ubione.app.cadastros.infrastructure.entity;

import java.util.List;
import java.util.UUID;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "cad_uf", schema = "med_db")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UFEntity {

    @Id
    @GeneratedValue
    private UUID id;
    
    @Column(name = "codibge", nullable = false)
    private String codibge;
    
    @Column(name = "nome", nullable = false)
    private String nome;
    
    @Column(name = "sigla", nullable = false)
    private String sigla;
    
    @OneToMany(mappedBy = "uf", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<MunicipioEntity> municipios;
    
}

