package io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class NioRunner {
    public static void main(String[] args) {

        String dirs = "src/main/resources/images/png/funny";

        try {

            Files.createDirectories(Paths.get(dirs));

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
