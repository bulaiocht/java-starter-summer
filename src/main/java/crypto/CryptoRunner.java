package crypto;

import java.io.*;

public class CryptoRunner {

    public static void main(String[] args) {

        File encrypted = new File("src/main/resources/poem_crypt");

        PoemCrypter.decrypt(encrypted);

    }
}