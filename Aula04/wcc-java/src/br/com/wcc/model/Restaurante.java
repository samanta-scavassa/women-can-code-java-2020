package br.com.wcc.model;

/**
 * Restaurante
 */
public class Restaurante {
    private String nome;
    private Menu menu;

    public Restaurante(String nome, Menu menu) {
        this.nome = nome;
        this.menu = menu;
    }

    public String getNome() {
        return nome;
    }

    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }

    @Override
    public String toString() {
        return "Restaurante [nome=" + nome + ",\n menu=" + menu + "]";
    }
}