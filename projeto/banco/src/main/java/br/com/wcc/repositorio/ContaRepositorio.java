package br.com.wcc.repositorio;

import br.com.wcc.file.ResourceFileReader;
import br.com.wcc.model.Conta;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;

import java.io.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ContaRepositorio {

    private ResourceFileReader reader = new ResourceFileReader();

    public Conta buscaContaPorId(Integer idConta) throws IOException {

        FileReader file = reader.getFileReaderFromResource("contas.csv");

        BufferedReader br = new BufferedReader(file);
        int numLinha = 0;
        String line;
        while ((line = br.readLine()) != null) {
            if(numLinha != 0) {
                String[] info = line.replace("\"", "").replace(" ", "").split(",");
                if (Integer.parseInt(info[0]) == idConta) {
                    file.close();
                    return new Conta(Integer.parseInt(info[0]), info[1], BigDecimal.valueOf(Double.parseDouble(info[2])));
                }
            }
            numLinha++;
        }
        throw new FileNotFoundException();
    }

    public void salvarConta(Conta conta) throws IOException {

//        StringBuilder strConta = new StringBuilder();
//        File f1 = reader.getFileFromResources("contas.csv");
        final List<Conta> contas = new ArrayList<>();

        FileReader file = reader.getFileReaderFromResource("contas.csv");

        BufferedReader br = new BufferedReader(file);
        int numLinha = 0;
        String line;

        while ((line = br.readLine()) != null) {
            if(numLinha != 0) {
                String[] info = line.replace("\"", "").replace(" ", "").split(",");
                contas.add(new Conta(Integer.parseInt(info[0]), info[1], BigDecimal.valueOf(Double.parseDouble(info[2]))));
            }
            numLinha++;
        }

        for(Conta c: contas){
            if(c.getIdConta() == conta.getIdConta()){
                c.setValorSaldo(conta.getValorSaldo());
            }
        }

        try {
            final ResourceFileReader resourceFile = new ResourceFileReader();
            final FileWriter fileToWrite = resourceFile.getFileWriterFromResource("contas.csv");
            final CSVPrinter printer = new CSVPrinter(fileToWrite, CSVFormat.DEFAULT.withHeader("id","tipo","saldo"));


            for (Conta c : contas) {
                printer.printRecord(c.getIdConta() + "," + c.getTipoConta() + "," + c.getValorSaldo());
            }

            printer.close();
            fileToWrite.flush();
            fileToWrite.close();
        } catch (IOException ignored) {

        }
    }

}
