package io;

public class IORunner {
    public static void main(String[] args) {

        String path = "src/main/resources/text";

        LineByLineReader.readTextFileByteByByte(path);
        LineByLineReader.readTextCharByChar(path);
    }
}
