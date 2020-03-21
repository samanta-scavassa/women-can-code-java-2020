package br.com.wcc.somador;

public interface Somador<N extends Number> {
    /**
     * Retorna a soma de num1 e num2
     * @param num1
     * @param num2
     * @return
     */
    N somar(N num1, N num2);

    N somar(N... numeros);
}
