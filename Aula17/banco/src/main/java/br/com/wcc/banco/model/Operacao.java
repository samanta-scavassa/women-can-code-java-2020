package br.com.wcc.banco.model;

import java.math.BigDecimal;

public interface Operacao {
    BigDecimal executar(Conta conta);
}
