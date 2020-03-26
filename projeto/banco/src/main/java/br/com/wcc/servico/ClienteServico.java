package br.com.wcc.servico;

import br.com.wcc.model.Cliente;
import br.com.wcc.repositorio.ClienteRepositorio;

import java.io.IOException;

public class ClienteServico {

    private ClienteRepositorio clienteRepositorio;

    public ClienteServico(ClienteRepositorio clienteRepositorio) {
        this.clienteRepositorio = clienteRepositorio;
    }

    public Cliente buscaClientePorId(Integer id) throws IOException {
        return clienteRepositorio.buscaClientePorId(id);
    }

}
