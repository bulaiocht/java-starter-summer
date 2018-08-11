package io;

import java.io.*;


public class LineByLineReader {

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
}
