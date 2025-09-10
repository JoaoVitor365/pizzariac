package com.itb.inf2cm.pizzariac.model.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "Categoria")
public class Categoria {

    @Id // PK
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column (length = 100, nullable = false)
    private String nome;
    @Column (length = 250, nullable = false)
    private String descricao;
    private boolean codStatus;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean isCodStatus() {
        return codStatus;
    }

    public void setCodStatus(boolean codStatus) {
        this.codStatus = codStatus;
    }
}
