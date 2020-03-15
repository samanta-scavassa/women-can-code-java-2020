package br.com.wcc;

import br.com.wcc.factory.RestauranteFactory;

public class App {
    public static void main(String[] args) {
        System.out.println(RestauranteFactory.createRestaurante("Comidas fantasmas"));
    }
}