package br.com.wcc.model;

public class Coral implements Animal {

    @Override
    public void andar() {
        System.out.println("Coral não anda!");
    }

    @Override
    public void comer(String comida) {
        System.out.println(String.format("O coral comeu %s", comida));
    }

    @Override
    public boolean temBoca() {
        return false;
    }
}
