package br.com.wcc.model;

public class Cachorro implements Animal {
    private String nome;
    private int numPatas;

    public Cachorro(String nome, int numPatas) {
        this.nome = nome;
        this.numPatas = numPatas;
    }

    @Override
    public void andar() {
        System.out.println(String.format("O cachorro andou com %d patas", numPatas));
    }

    @Override
    public void comer(String comida) {
        System.out.println(String.format("O cachorro comeu %s", comida));
    }

    @Override
    public boolean temBoca() {
        return true;
    }
}
