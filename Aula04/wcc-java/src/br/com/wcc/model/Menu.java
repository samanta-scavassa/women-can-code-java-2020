package br.com.wcc.model;

import java.util.List;

/**
 * Menu
 */
public class Menu {
    private List<Item> items;

    public Menu(List<Item> items) {
        this.items = items;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    @Override
    public String toString() {
        return "Menu [items=" + items + "]";
    }
}