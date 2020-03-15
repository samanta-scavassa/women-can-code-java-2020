package br.com.wcc.factory;

import br.com.wcc.model.Restaurante;

/**
 * RestauranteFactory
 */
public class RestauranteFactory {

    private RestauranteFactory() {
    }

    public static Restaurante createRestaurante(String nome) {
        return new Restaurante(nome, MenuFactory.createMenu());
    }

}