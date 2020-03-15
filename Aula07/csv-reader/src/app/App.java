package app;

import java.io.FileReader;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

public class App {
    public static void main(String[] args) throws Exception {
        FileReader file = new FileReader("resources/aulas.csv");
        Iterable<CSVRecord> records = CSVFormat.DEFAULT.withHeader().parse(file);
        for (CSVRecord csvRecord : records) {
            String aula = csvRecord.get("Nome da Aula");
            String conteudo = csvRecord.get("Conteúdo");
            LocalDate dia = LocalDate.parse(csvRecord.get("Dia"), DateTimeFormatter.ofPattern("dd/MM/yy"));
            StringBuilder builder = new StringBuilder();
            builder.append("Nome da aula: ")
                .append(aula)
                .append(", Conteúdo: ")
                .append(conteudo)
                .append(", data: ")
                .append(dia.format(DateTimeFormatter.ofPattern("dd MMM yyyy")));
            System.out.println(builder.toString());
        }
    }
}