package br.com.wcc.servico;

import br.com.wcc.model.Conta;
import br.com.wcc.model.Operacao;
import br.com.wcc.repositorio.ContaRepositorio;

public class ExecutorOperacao {
    
    private ContaRepositorio contaRepositorio = new ContaRepositorio();
    private ContaServico servico = new ContaServico(contaRepositorio);

    public String executarOperacaoEmConta(Operacao operacao, Conta conta) {
        try {

            System.out.println(operacao.executar(conta));
            servico.salvarConta(conta);
            return "Operação realizada com sucesso!";
        } catch (Exception e) {
            return"Falha. Operação não realizada.";
        }
    }
}
