package io;

import java.io.*;

public class TextFileReader {


    public static void readFileByteByByte(String path) {

        InputStream in = null;

        try {

            in = new FileInputStream(path);

            int read;
            while ((read = in.read()) != -1) {
                System.out.print((char) read);
            }

        } catch (FileNotFoundException e) {

            System.out.println("No file found. " + e.getMessage());

        } catch (IOException e) {
            e.printStackTrace();
        } finally {

            closeSilently(in);

        }

    }

    public static void readFileLineByLine(String path){

        BufferedReader reader = null;

        try {
            reader = new BufferedReader(new FileReader(path));
            boolean end = false;
            while (!end){
                String line = reader.readLine();
                if (line != null){

                    if (line.matches("Where.*")) System.out.println(line);

                } else end = true;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            closeSilently(reader);
        }
    }

    public static void readAndWriteFile(String source, String target){
        BufferedReader in = null;
        BufferedWriter out = null;
        try {
            in = new BufferedReader(new FileReader(source));
            out = new BufferedWriter(new FileWriter(target));

            boolean end = false;
            while (!end){
                String line = in.readLine();
                if (line != null){
                    out.write(line);
                    out.newLine();
                } else end = true;
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            closeSilently(in);
            closeSilently(out);
        }


    }

    private static void closeSilently(Closeable closeable) {

        if (closeable != null) {

            try {

                closeable.close();

            } catch (IOException e) {

                e.printStackTrace();

            }
        }

    }


}
