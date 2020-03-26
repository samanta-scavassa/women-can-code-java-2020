package br.com.wcc.servico;

import br.com.wcc.model.Conta;
import br.com.wcc.repositorio.ContaRepositorio;

import java.io.IOException;

public class ContaServico {

    private ContaRepositorio contaRepositorio;

    public ContaServico(ContaRepositorio contaRepositorio) {
        this.contaRepositorio = contaRepositorio;
    }

    public Conta buscaContaPorId(Integer id) throws IOException {
        return contaRepositorio.buscaContaPorId(id);
    }

    public void salvarConta(Conta conta) throws IOException {
        contaRepositorio.salvarConta(conta);
    }
}
