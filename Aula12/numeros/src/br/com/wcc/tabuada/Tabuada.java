package br.com.wcc.tabuada;

public class Tabuada {
    public static String escreverTabuadaDo(int num) {
        StringBuilder builder = new StringBuilder();
        builder.append("Tabuada do ").append(num).append("\n");
        for (int i = 1; i <= 10; i++) {
            builder.append(num).append(" x ").append(i).append(" = ").append((num * i)).append("\n");
        }

        return builder.toString();
    }
}
