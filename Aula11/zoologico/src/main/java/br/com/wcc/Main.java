package br.com.wcc;

import br.com.wcc.model.Animal;
import br.com.wcc.model.Cachorro;
import br.com.wcc.model.Coral;
import br.com.wcc.model.Galinha;
import br.com.wcc.model.Jaula;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
//        testaListaAnimais();

        Cachorro cachorro1 = new Cachorro("Lucky", 4);
        Cachorro cachorro2 = new Cachorro("Julie", 4);
        Jaula<Cachorro> jaula = new Jaula<>();
        jaula.adicionarAnimais(cachorro1, cachorro2);

        jaula.listarAnimais().forEach(Main::printAcoesAnimal);
    }

    private static void testaListaAnimais() {
        Cachorro cachorro1 = new Cachorro("Lucky", 4);
        Cachorro cachorro2 = new Cachorro("Julie", 4);
        Galinha galinha = new Galinha(2);
        Coral coral = new Coral();

        List<Animal> animals = new ArrayList<>() {{
            add(cachorro1);
            add(cachorro2);
            add(galinha);
            add(coral);
        }};

        animals.forEach(Main::printAcoesAnimal);
    }

    private static void printAcoesAnimal(Animal animal) {
        System.out.println("O animal " + animal.getClass().getSimpleName() + (animal.temBoca() ? " " : " não") + " tem boca");
        animal.andar();
        animal.comer("fungo");
        System.out.println("");
    }
}
