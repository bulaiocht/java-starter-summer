package io;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Scanner;

public class IORunner {

    private static final String RES = "src/main/resources/";

    public static void main(String[] args) {

        String path = RES + "text";

        Path path1 = Paths.get("src", "main", "resources", "text");

        try {
            Files.lines(path1)
                    .forEach(System.out::println);

        } catch (IOException e) {
            e.printStackTrace();
        }


        TextFileReader.readFileLineByLine(path);


        File file = new File(RES + "out");

        boolean exists = file.exists();
        if (!exists){
            try {

                boolean created = file.createNewFile();
                if (created) System.out.println("File created");

            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        TextFileReader.readAndWriteFile(path, file.getPath());

        String java = "src/main/java/arrays/ArraysHomework.java";

        TextFileReader.readFileByteByByte(path);

        TextFileReader.readFileByteByByte(java);



        String target = RES + "target";
        File file2 = new File(path);
        System.out.println(file2.exists());
        System.out.println(file2.getParent());
        System.out.println(file2.getAbsolutePath());
        System.out.println((file2.getFreeSpace() / (1024*1024*1024)) + " GB");
        final long lastModified = file2.lastModified();
        LocalDateTime modified = LocalDateTime
                .ofInstant(Instant.ofEpochMilli(lastModified),
                        ZoneId.systemDefault());
        System.out.println(modified);

        File targetFile = new File(target);

        if (!targetFile.exists()) {

            try {

                boolean created = targetFile.createNewFile();
                if (created) System.out.println("File created.");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        System.out.println("=================");
        TestFileReader.readTextFileByteByByte(path);
        System.out.println("=================");
        TestFileReader.readTextCharByChar(path);
        System.out.println("=================");
        TestFileReader.readFileLineByLine(path);
        System.out.println("=================");

        TestFileReader.copyFileLineByLine(path, target);
        TestFileReader.createFakeFile(RES + "file", 1024*1024);

        fileCrawler(new File("/home/horsey/IdeaProjects/"), ".*\\.png");
        System.out.println(".png".matches(".*\\.png"));
    }

    private static void fileCrawler(File file, String suffix){
        File[] files = file.listFiles();
        if (files != null) {
            for (File f : files) {
                if (f.isFile()){
                    if (f.getName().matches(suffix)) System.out.println(f);
                } else {
                    fileCrawler(f, suffix);
                }
            }


        }

    }
}
