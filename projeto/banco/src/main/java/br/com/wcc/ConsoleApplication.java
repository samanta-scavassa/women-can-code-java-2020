package br.com.wcc;

import br.com.wcc.model.*;
import br.com.wcc.repositorio.ClienteRepositorio;
import br.com.wcc.repositorio.ContaRepositorio;
import br.com.wcc.servico.ClienteServico;
import br.com.wcc.servico.ContaServico;
import br.com.wcc.servico.ExecutorOperacao;

import java.io.IOException;
import java.math.BigDecimal;
import java.text.ParseException;
import java.util.Scanner;

public class ConsoleApplication {

    private static final String FORMATO_OPCAO = "%d: %s";
    private String[] operacoes = {"Saque", "Depósito", "Saldo", "Sair"};

    private Scanner scanner;
    private ClienteRepositorio clienteRepositorio = new ClienteRepositorio();
    private ClienteServico clienteServico = new ClienteServico(clienteRepositorio);
    ContaRepositorio contaRepositorio = new ContaRepositorio();
    private ContaServico contaServico = new ContaServico(contaRepositorio);

    private Conta conta;

    ExecutorOperacao exec = new ExecutorOperacao();

    public void start() throws IOException, ParseException {
        scanner = new Scanner((System.in));

        for (; ; ) {
            System.out.println("Digite o id do cliente:");
            if (isNumeroValido()) continue;

            Cliente cliente = clienteServico.buscaClientePorId(scanner.nextInt());
            System.out.println(cliente.getNome());

            this.conta = contaServico.buscaContaPorId(cliente.getIdConta());

            if(cliente == null){
                System.out.println("Cliente não encontrado");
                System.exit(0);
                scanner.close();
            }
            selecionarOperacao();
        }

    }


    private String selecionarOperacao() {
        String operacao = "";
        for (int i = 0; i < operacoes.length ; i++) {
            exibeOpcoes();

            if (isNumeroValido()) continue;

            final int opcao = scanner.nextInt();
            switch(opcao){
                case 1:
                    System.out.println("Operação escolhida: " + operacoes[0]);
                    System.out.println("Digite o valor desejado:");
                    BigDecimal valorSaque = scanner.nextBigDecimal();
                    Saque saque = new Saque(valorSaque, conta.getValorDescontoSaque());
                    System.out.println(exec.executarOperacaoEmConta(saque, conta));
                    break;
                case 2:
                    System.out.println("Operação escolhida: " + operacoes[1]);
                    System.out.println("Digite o valor desejado:");
                    BigDecimal valorDeposito = scanner.nextBigDecimal();
                    Deposito deposito = new Deposito(valorDeposito);
                    System.out.println(exec.executarOperacaoEmConta(deposito, conta));
                    break;
                case 3:
                    System.out.println("Operação escolhida: " + operacoes[2]);
                    Saldo saldo = new Saldo(conta.getValorDescontoSaldo());
                    System.out.println(exec.executarOperacaoEmConta(saldo, conta));
                    break;
                case 4:
                    System.out.println("Operação escolhida: " + operacoes[3]);
                    traduzirOpcaoOperacao(4);
                    break;
                default:
                    System.out.println("Opção inválida");
                    traduzirOpcaoOperacao(4);
                    break;
            }

            traduzirOpcaoOperacao(opcao);

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
        for (int i = 0; i < operacoes.length; i++) {
            System.out.println(String.format(FORMATO_OPCAO, i + 1, operacoes[i]));
        }
    }

    private void traduzirOpcaoOperacao(int opcao) {
        if (opcao == operacoes.length) {
            System.out.println("Saindo...");
            System.exit(0);
        }
    }

}
