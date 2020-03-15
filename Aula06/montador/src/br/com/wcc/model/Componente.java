package br.com.wcc.model;

import java.util.Random;

/**
 * Componente
 */
public enum Componente {
    CONECTOR,
    CAPACITOR,
    SENSOR_DE_MOVIMENTO,
    RESISTOR,
    SEMICONDUTOR;

    public static Componente randomComponente() {
        return Componente.values()[new Random().nextInt(Componente.values().length)];
    }
}