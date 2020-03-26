package br.com.wcc.model;

import java.math.BigDecimal;

public class Conta{

    private Integer idConta;
    private String tipoConta;
    private BigDecimal valorSaldo;
    private BigDecimal valorDescontoSaque;
    private BigDecimal valorDescontoSaldo;

    public Conta(Integer idConta, String tipoConta, BigDecimal valorSaldo){
        this.idConta = idConta;
        this.tipoConta = tipoConta;
        this.valorSaldo = valorSaldo;
        defineTaxas(tipoConta);
    }

    public int getIdConta() {
        return idConta;
    }

    public void setIdConta(int idConta) {
        this.idConta = idConta;
    }

    public String getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }

    public BigDecimal getValorSaldo() {
        return valorSaldo;
    }

    public void setValorSaldo(BigDecimal valorSaldo) {
        this.valorSaldo = valorSaldo;
    }

    public void setValorDescontoSaque(BigDecimal valorDescontoSaque) {
        this.valorDescontoSaque = valorDescontoSaque;
    }

    public void setValorDescontoSaldo(BigDecimal valorDescontoSaldo) {
        this.valorDescontoSaldo = valorDescontoSaldo;
    }

    public BigDecimal getValorDescontoSaque(){
        return valorDescontoSaque;
    }

    public BigDecimal getValorDescontoSaldo(){
        return  valorDescontoSaldo;
    }

    public void defineTaxas(String tipoConta){
        if(tipoConta.equals("PRIME")){
            setValorDescontoSaldo(new BigDecimal("0.01"));
            setValorDescontoSaque(new BigDecimal("0.50"));
        }else if (tipoConta.equals("REGULAR")){
            setValorDescontoSaldo(new BigDecimal("0.05"));
            setValorDescontoSaque(new BigDecimal("2.00"));
        }

    }
}
