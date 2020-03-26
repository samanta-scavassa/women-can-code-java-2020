package br.com.wcc.file;

import java.io.*;
import java.net.URL;

public class ResourceFileReader {

    public ResourceFileReader() {
    }

    public FileReader getFileReaderFromResource(String fileName) throws FileNotFoundException {
        final URL resourceUrl = getClass().getClassLoader().getResource(fileName);
        assert resourceUrl != null;
        return new FileReader(resourceUrl.getPath());
    }

    public FileWriter getFileWriterFromResource(String fileName) throws FileNotFoundException {

        try {
            final String resource = getClass().getClassLoader().getResource(fileName).getPath();
            return new FileWriter(resource);
        } catch (IOException e) {
            throw new FileNotFoundException(fileName);
        }

    }
}
