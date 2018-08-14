package io;

import java.io.*;
import java.util.Arrays;


public class TestFileReader {

    public static void readTextFileByteByByte(String path){

        try {

            FileInputStream in = new FileInputStream(path);
            int read;

            while ((read = in.read()) != -1){
                System.out.print((char) read);
            }
            System.out.println();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void readTextCharByChar(String path){

        try {
            FileReader reader = new FileReader(path);

            while (true){
                int read = reader.read();
                if (read == -1){
                    reader.close();
                    System.out.println();
                    break;
                }
                System.out.print((char) read);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void readFileLineByLine(String path){

        BufferedReader reader = null;

        try {

             reader = new BufferedReader(new FileReader(path));

            boolean flag = true;

            while (flag) {
                String line = reader.readLine();
                if (line != null){
                    System.out.println(line);
                } else flag = false;
            }

        } catch (FileNotFoundException e) {
            System.out.println("no file found. " + Arrays.toString(e.getStackTrace()));
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            closeSilently(reader);
        }
    }

    public static void copyFileLineByLine(String src, String target){
        BufferedReader in = null;
        BufferedWriter out = null;
        try {
            in = new BufferedReader(new FileReader(src));
            out = new BufferedWriter(new FileWriter(target));

            boolean flag = true;
            while (flag) {
                String line = in.readLine();
                if (line != null){
                    out.write(line);
                    out.newLine();
                } else flag = false;
            }


        } catch (FileNotFoundException e) {
            System.out.println("no file found. " + Arrays.toString(e.getStackTrace()));
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            closeSilently(in);
            closeSilently(out);
        }


    }

    public static void createFakeFile(String path, long size){

        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(path, "rw");
            randomAccessFile.setLength(size);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private static void closeSilently(Closeable closeable){
        if (closeable != null){
            try {
                closeable.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
