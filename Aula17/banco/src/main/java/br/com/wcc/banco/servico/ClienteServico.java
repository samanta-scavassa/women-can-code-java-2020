package br.com.wcc.banco.servico;

import br.com.wcc.banco.model.Cliente;

public interface ClienteServico {
    Cliente buscaClientePorId(Integer id);
}
