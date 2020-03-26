package br.com.wcc.model;

import java.math.BigDecimal;

public class Deposito implements Operacao {

    private BigDecimal valor;

    public Deposito(BigDecimal valor){
        this.valor = valor;
    }

    @Override
    public BigDecimal executar(Conta conta) {
        conta.setValorSaldo(conta.getValorSaldo().add(valor));

        return conta.getValorSaldo();

    }
}
