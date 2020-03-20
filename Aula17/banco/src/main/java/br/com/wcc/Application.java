package br.com.wcc;

import br.com.wcc.model.Operacao;

import java.util.Scanner;

public class Application {

    private static final String FORMATO_OPCAO = "%d: %s";
    private static final Operacao[] OPERACOES = Operacao.values();

    public static void main(String[] args) {
        Operacao operacao = selecionarOperacao();

        System.out.println(operacao);
    }

    private static Operacao selecionarOperacao() {
        Operacao operacao;
        Scanner scanner = new Scanner((System.in));
        for (; ; ) {
            exibeOpcoes();

            if (!scanner.hasNextInt()) {
                System.out.println("Opção inválida: " + scanner.nextLine());
                continue;
            }

            final int opcao = scanner.nextInt();
            if (opcao <= 0 || opcao > OPERACOES.length + 1) {
                System.out.println("Opção inválida: " + scanner.nextLine());
                continue;
            }

            operacao = traduzirOpcaoOperacao(opcao);

            System.out.println("Operação escolhida: " + operacao.getTexto());
            break;
        }
        return operacao;
    }

    private static void exibeOpcoes() {
        System.out.println("Selecione uma operação:");
        for (int i = 0; i < Operacao.values().length; i++) {
            Operacao operacao = OPERACOES[i];
            System.out.println(String.format(FORMATO_OPCAO, i + 1, operacao.getTexto()));
        }
        System.out.println(String.format(FORMATO_OPCAO, Operacao.values().length + 1, "Sair"));
    }

    private static Operacao traduzirOpcaoOperacao(int opcao) {
        if (opcao == OPERACOES.length + 1) {
            System.out.println("Saindo...");
            System.exit(0);
        }

        return OPERACOES[opcao - 1];
    }
}
