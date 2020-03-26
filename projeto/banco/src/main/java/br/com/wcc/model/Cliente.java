package br.com.wcc.model;

import java.math.BigDecimal;

public class Cliente {

    private Integer id;
    private String nome;
    private Integer idConta;
    private BigDecimal salario;

    public Cliente(Integer id, String nome, Integer idConta, BigDecimal salario){
        this.id = id;
        this.nome = nome;
        this.idConta = idConta;
        this.salario = salario;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdConta() {
        return idConta;
    }

    public void setIdConta(Integer idConta) {
        this.idConta = idConta;
    }

    public BigDecimal getSalario() {
        return salario;
    }

    public void setSalario(BigDecimal salario) {
        this.salario = salario;
    }
}
