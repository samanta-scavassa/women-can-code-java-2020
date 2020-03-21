package app;

import java.io.FileReader;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import app.file.ResourceFileReader;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

public class App {
    public static void main(String[] args) throws Exception {


        final ResourceFileReader resourceFileReader = new ResourceFileReader();
        final FileReader file = resourceFileReader.getFileReaderFromResource("aulas.csv");

        Iterable<CSVRecord> records = CSVFormat.DEFAULT.withHeader().parse(file);
        for (CSVRecord csvRecord : records) {
            String aula = csvRecord.get("Nome da Aula");
            String conteudo = csvRecord.get("Conteúdo");
            LocalDate dia = LocalDate.parse(csvRecord.get("Dia"), DateTimeFormatter.ofPattern("dd/MM/yy"));
            String linha = "Nome da aula: " +  aula +
                    ", Conteúdo: " + conteudo +
                    ", data: " +
                    dia.format(DateTimeFormatter.ofPattern("dd MMM yyyy"));
            System.out.println(linha);
        }
    }
}