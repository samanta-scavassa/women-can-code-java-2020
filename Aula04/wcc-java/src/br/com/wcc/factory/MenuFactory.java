package br.com.wcc.factory;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import br.com.wcc.model.Item;
import br.com.wcc.model.Menu;

public class MenuFactory {

	private MenuFactory() {
	}
    
    public static Menu createMenu() {
        List<Item> items = IntStream.rangeClosed(1, 10)
            .mapToObj(ItemFactory::createItem)
            .collect(Collectors.toList());
        return new Menu(items);
    }
}