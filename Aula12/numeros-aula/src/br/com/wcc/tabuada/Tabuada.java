package br.com.wcc.tabuada;

import br.com.wcc.exception.TabuadaInvalidaException;

public class Tabuada {
    public String escreverTabuada(int n) throws TabuadaInvalidaException {
        if (n <= 0) {
            throw new TabuadaInvalidaException("n não pode ser menor ou igual a zero!");
        }

        StringBuilder builder = new StringBuilder();
        builder.append("Tabuada do ").append(n).append("\n");
        for (int i = 1; i <= 10; i++) {
            builder.append(n).append(" x ").append(i).append(" = ").append(n * i).append("\n");
        }

        return builder.toString();
    }
}
