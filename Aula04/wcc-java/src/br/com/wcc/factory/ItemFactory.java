package br.com.wcc.factory;

import java.util.Random;

import br.com.wcc.model.Item;

/**
 * ItemFactory
 */
public class ItemFactory {
    private static Random RANDOM = new Random();

    private ItemFactory() {
    }

    public static Item createItem(int i) {
        return new Item(Item.Tipo.randomTipo(), generateRandomPrice(), generateRandomString(10));
    }

    private static Double generateRandomPrice() {
        return RANDOM.nextDouble() * 100;
    }

    private static String generateRandomString(int size) {
    int leftLimit = 97; // letter 'a'
    int rightLimit = 122; // letter 'z'
    int targetSize = (size > 10 || size <= 0) ? 10 : size;
 
    return RANDOM.ints(leftLimit, rightLimit + 1)
      .limit(targetSize)
      .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
      .toString();
    }
    
}