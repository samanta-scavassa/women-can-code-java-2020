package br.com.wcc.model;

public class Galinha implements Animal {
    private int numPatas;

    public Galinha(int numPatas) {
        this.numPatas = numPatas;
    }

    @Override
    public void andar() {
        System.out.println(String.format("A galinha andou com %d patas", numPatas));
    }

    @Override
    public void comer(String comida) {
        System.out.println(String.format("A galinha comeu %s", comida));
    }

    @Override
    public boolean temBoca() {
        return true;
    }
}
