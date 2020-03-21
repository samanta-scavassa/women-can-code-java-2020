package br.com.wcc.banco.servico;

import br.com.wcc.banco.model.Conta;
import br.com.wcc.banco.model.Operacao;

public interface ExecutorOperacao {
    // Na implementação, quem salva informações na conta é o ContaRepositório
    // -> A classe que implementa ExecutorOperacao tem como propriedade de instancia
    // ContaRepositorio

    /**
     * Executa uma determida operação em uma conta, salva o resultado na conta fornecida
     * -> salvar resultado = salvar no arquivo (ContaRepositorio)
     * E retorna se a operação foi bem sucedida
     *
     * @param operacao
     * @param conta
     * @return
     */
    String executarOperacaoEmConta(Operacao operacao, Conta conta);
}
