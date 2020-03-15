package br.com.wcc.fibonacci;

public class Fibonacci {
    public static Long[] fibonacci(int n) {
        Long[] fib = new Long[n];
        for (int i = 0; i < n; i++) {
            if (i < 2) {
                fib[i] = 1L;
                continue;
            }
            fib[i] = fib[i - 1] + fib[i - 2];
        }
        return fib;
    }
}
