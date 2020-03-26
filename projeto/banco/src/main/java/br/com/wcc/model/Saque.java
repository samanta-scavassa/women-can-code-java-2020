package br.com.wcc.model;

import java.math.BigDecimal;

public class Saque implements Operacao {

    private BigDecimal valor;
    private BigDecimal taxa;

    public Saque(BigDecimal valor, BigDecimal taxa){
        this.valor = valor;
        this.taxa = taxa;
    }

    @Override
    public BigDecimal executar(Conta conta) {

        conta.setValorSaldo(conta.getValorSaldo().subtract(valor).subtract(taxa));

        return conta.getValorSaldo();
    }

}
