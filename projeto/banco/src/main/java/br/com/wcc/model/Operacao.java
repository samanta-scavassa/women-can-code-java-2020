package br.com.wcc.model;

import java.math.BigDecimal;

public interface Operacao {

    BigDecimal executar(Conta conta);
}
