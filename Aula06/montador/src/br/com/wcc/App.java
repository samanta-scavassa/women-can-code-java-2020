package br.com.wcc;

import java.util.List;

import br.com.wcc.model.Montador;
import br.com.wcc.model.Placa;

public class App {
    public static void main(String[] args) {
        List<Placa> placas = Montador.montarPlacas(10);
        placas.forEach((placa) -> System.out.println(placa.toString() + "\n"));
    }
}