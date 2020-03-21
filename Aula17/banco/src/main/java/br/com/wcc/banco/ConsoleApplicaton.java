package br.com.wcc.banco;

import br.com.wcc.banco.servico.ClienteServico;

import java.util.Scanner;

public class ConsoleApplicaton {
    private static final String FORMATO_OPCAO = "%d: %s";
    private static final Operacao[] OPERACOES = Operacao.values();

    private Scanner scanner;
    private ClienteServico clienteServico;

    public void start() {
        scanner = new Scanner((System.in));

//        for (; ; ) {
//            System.out.println("Digite o id do cliente:");
//            if (isNumeroValido()) continue;
//
//            Cliente cliente = clienteServico.buscaClientePorId(scanner.nextInt());
//            if(cliente == null)
//        }


        Operacao operacao = selecionarOperacao();

        System.out.println(operacao);
        scanner.close();
    }

    private Operacao selecionarOperacao() {
        Operacao operacao;
        for (; ; ) {
            exibeOpcoes();

            if (isNumeroValido()) continue;

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

    private boolean isNumeroValido() {
        if (!scanner.hasNextInt()) {
            System.out.println("Opção inválida: " + scanner.nextLine());
            return true;
        }
        return false;
    }

    private void exibeOpcoes() {
        System.out.println("Selecione uma operação:");
        for (int i = 0; i < Operacao.values().length; i++) {
            Operacao operacao = OPERACOES[i];
            System.out.println(String.format(FORMATO_OPCAO, i + 1, operacao.getTexto()));
        }
        System.out.println(String.format(FORMATO_OPCAO, Operacao.values().length + 1, "Sair"));
    }

    private Operacao traduzirOpcaoOperacao(int opcao) {
        if (opcao == OPERACOES.length + 1) {
            System.out.println("Saindo...");
            System.exit(0);
        }

        return OPERACOES[opcao - 1];
    }

    private enum Operacao {
        SAQUE("Saque"),
        SALDO("Saldo"),
        DEPOSITO("Depósito");

        private String texto;
        Operacao(String texto) {
            this.texto = texto;
        }

        public String getTexto() {
            return texto;
        }
    }
}
