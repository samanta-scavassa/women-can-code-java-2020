package br.com.wcc.somador;

public class SomadorInteger implements Somador<Integer> {

    @Override
    public Integer somar(Integer num1, Integer num2) {
        return Integer.sum(num1, num2);
    }

    @Override
    public Integer somar(Integer... numeros) {
        Integer soma = 0;
        for (Integer numero : numeros) {
            soma += numero;
        }
        return soma;
    }
}
