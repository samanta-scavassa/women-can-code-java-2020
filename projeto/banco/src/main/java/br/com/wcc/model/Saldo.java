package br.com.wcc.model;


import java.math.BigDecimal;

public class Saldo implements Operacao {

    private BigDecimal taxa;

    public Saldo(BigDecimal taxa){
        this.taxa = taxa;
    }

    @Override
    public BigDecimal executar(Conta conta) {

        conta.setValorSaldo(conta.getValorSaldo().subtract(taxa));

        return conta.getValorSaldo();
    }
}
