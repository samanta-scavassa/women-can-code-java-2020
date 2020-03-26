package br.com.wcc.repositorio;

import br.com.wcc.file.ResourceFileReader;
import br.com.wcc.model.Cliente;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigDecimal;

public class ClienteRepositorio {

    private ResourceFileReader reader = new ResourceFileReader();

    public Cliente buscaClientePorId(Integer id) throws IOException {

        FileReader file = reader.getFileReaderFromResource("clientes.csv");

        BufferedReader br = new BufferedReader(file);
        int numLinha = 0;
        String line;
        while ((line = br.readLine()) != null) {
            if(numLinha != 0) {
                String[] info = line.split(",");
                if (Integer.parseInt(info[0]) == id) {
                    file.close();
                    return new Cliente(Integer.parseInt(info[0]), info[1], Integer.parseInt(info[2]), BigDecimal.valueOf(Double.parseDouble(info[3])));
                }
            }
            numLinha++;
        }
        throw new FileNotFoundException();

    }
}
