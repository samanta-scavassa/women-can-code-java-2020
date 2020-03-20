package br.com.wcc.somador;

public class Somador2 {
    public static <T extends Number> T somar(T... numeros) {
        if(numeros instanceof Integer[]) {
            Integer[] numerosInteiros = (Integer[]) numeros;
            Integer soma = 0;
            for (Integer numero : numerosInteiros) {
                soma += numero;
            }
            return (T) soma;
        }
        return null;
    }
}
