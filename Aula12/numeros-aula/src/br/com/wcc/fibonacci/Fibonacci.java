package br.com.wcc.fibonacci;

public class Fibonacci {
    public int mostrarProximoSequencia(int n) {
        if(n == 1 || n == 2) {
            return 1;
        }
        return mostrarProximoSequencia(n - 1) + mostrarProximoSequencia(n - 2);
    }
}
