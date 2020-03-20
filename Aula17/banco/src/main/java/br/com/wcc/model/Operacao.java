package br.com.wcc.model;

public enum  Operacao {
    SAQUE("Saque"),
    SALDO("Saldo"),
    DEPOSITO("Depósito");

    private String texto;
    Operacao(String texto) {
        this.texto = texto;
    }

    public String getTexto() {
        return texto;
    }
}
