package io.pipes;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PipedRunner {

    private static final String SRC = "src/main/resources/";

    public static void main(String[] args) throws IOException, InterruptedException {

        Path in = Paths.get(SRC, "wap");

        Path out = Paths.get(SRC, "copy");

        Files.deleteIfExists(out);

        Files.createFile(out);

        FileInputStream fis = new FileInputStream(in.toFile());

        FileOutputStream fos = new FileOutputStream(out.toFile());

        PipedInputStream reader = new PipedInputStream();

        PipedOutputStream writer = new PipedOutputStream(reader);

        Thread readerThread = new Thread(() -> readAndWrite(fos, reader));

        Thread writerThread = new Thread(() -> readAndWrite(writer, fis));

        readerThread.start();
        writerThread.start();

        readerThread.join();
        writerThread.join();

    }

    private static void readAndWrite(OutputStream outputStream, InputStream inputStream) {
        try {
            boolean working = true;
            while (working) {
                final int read = inputStream.read();
                if (read != -1) {
                    outputStream.write(read);
                } else working = false;
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            closeSilently(outputStream);
            closeSilently(inputStream);
        }
    }

    private static void closeSilently(Closeable closeable) {
        try {
            closeable.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
