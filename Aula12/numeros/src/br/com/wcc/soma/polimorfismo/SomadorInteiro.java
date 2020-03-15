package br.com.wcc.soma.polimorfismo;

import java.util.Arrays;

public class SomadorInteiro implements Somador<Integer> {
    @Override
    public Integer add(Integer... numbers) {
        return Arrays.stream(numbers).reduce(0, Integer::sum);
    }
}
