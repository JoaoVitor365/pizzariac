package com.itb.inf2cm.pizzariac.model.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "Produto") // Quando o nome da classe for o mesmo nome da tabela, o uso do @Table é "facultativo"

public class Produto {

    @Id //PK
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto- Incremento de 1 em 1
    private long id;

    @Column(length = 100, nullable = false) // length: qtde de máximo de caracteres, nullable: false (NOT NULL) true (NULL)
    private String nome;
    @Column(length = 45, nullable = false)
    private String tipo;
    @Column(length = 100, nullable = false)
    private String descricao;
    @Column(columnDefinition = "DECIMAL(5,2)", nullable = true) // DECIMAL(5,2); valor máx R$ 99.999,99
    private double valorCompra;
    @Column(columnDefinition = "DECIMAL(5,2)", nullable = true)
    private double valorVenda;
    @Column( nullable = true)
    private int quantidadeEstoque;
    private boolean codStatus;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValorCompra() {
        return valorCompra;
    }

    public void setValorCompra(double valorCompra) {
        this.valorCompra = valorCompra;
    }

    public double getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(double valorVenda) {
        this.valorVenda = valorVenda;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public boolean isCodStatus() {
        return codStatus;
    }

    public void setCodStatus(boolean codStatus) {
        this.codStatus = codStatus;
    }
}
