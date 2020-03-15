package br.com.wcc.model;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * Item
 */
public class Item {
    private final Tipo tipo;
    private final Double preco;
    private final String descricao;

    public Item(Tipo tipo, Double preco, String descricao) {
       this.tipo = tipo;
       this.preco = preco;
       this.descricao = descricao; 
    }

    public Tipo getTipo() {
        return this.tipo;
    }

    public Double getPreco() {
        return preco;
    }

    public String getDescricao() {
        return descricao;
    }

    @Override
    public String toString() {
        return "Item [descricao=" + descricao + ", preco=" + preco + ", tipo=" + tipo + "]\n";
    }
    
    public enum Tipo {
        COMIDA,
        BEBIDA,
        SOBREMESA;

        public static Tipo randomTipo() {
            return Tipo.values()[new Random().nextInt(Tipo.values().length)];
        }
    }
}