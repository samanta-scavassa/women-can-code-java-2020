package br.com.wcc;

import br.com.wcc.exception.TabuadaInvalidaException;
import br.com.wcc.fibonacci.Fibonacci;
import br.com.wcc.somador.Somador2;
import br.com.wcc.somador.SomadorDouble;
import br.com.wcc.somador.SomadorFloat;
import br.com.wcc.somador.SomadorInteger;
import br.com.wcc.tabuada.Tabuada;

public class Main {

    public static void main(String[] args) {
        imprimirSomas();
        imprimeTabuada();
        escreveFibonacci();
        System.out.println("Soma: " + Somador2.somar(1.1, 2.2, 3.3, 4.4));
    }

    private static void escreveFibonacci() {
        Fibonacci fibonacci = new Fibonacci();
        System.out.println(fibonacci.mostrarProximoSequencia(100));
    }

    private static void imprimeTabuada() {
        Tabuada tabuada = new Tabuada();
        try {
            System.out.println(tabuada.escreverTabuada(0));
        } catch (TabuadaInvalidaException ex) {
            System.out.println("Tabuada inválida:" + ex.getMessage());
        }
    }

    private static void imprimirSomas() {
        SomadorInteger somadorInteger = new SomadorInteger();
        SomadorDouble somadorDouble = new SomadorDouble();
        SomadorFloat somadorFloat = new SomadorFloat();

        System.out.println("Somadores");
        System.out.println("Somador Integer");
        System.out.println(somadorInteger.somar(1, 3, 4, 5, 1));

        System.out.println("-------");

        System.out.println("Somador Double");
        System.out.println(somadorDouble.somar(1.1, 3.1, 4.1, 5.1, 1.1));

        System.out.println("-------");

        System.out.println("Somador Float");
        System.out.println(somadorFloat.somar(1.2f, 3.2f, 4.2f, 5.2f, 1.2f));

        System.out.println("-------");
    }
}
