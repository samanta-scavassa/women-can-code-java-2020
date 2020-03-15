package br.com.wcc;

import br.com.wcc.fibonacci.Fibonacci;
import br.com.wcc.soma.Somador;
import br.com.wcc.tabuada.Tabuada;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        System.out.println("Exercício Soma:");
        System.out.println(Somador.add(Integer.class, 1, 1, 2, 3, 5, 8));
        System.out.print("\n");

        System.out.println("Exercício Tabuada:");
        System.out.println(Tabuada.escreverTabuadaDo(4));
        System.out.print("\n");

        System.out.println("Exercício Fibonacci:");
        System.out.println(Arrays.toString(Fibonacci.fibonacci(10)));
        System.out.print("\n");
    }
}
