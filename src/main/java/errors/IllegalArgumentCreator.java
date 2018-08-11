package errors;

import java.io.IOException;

public class IllegalArgumentCreator {


    public static void div(int divident, int divisor){

        if (divisor == 0){

            throw new IllegalArgumentException("your divisor should not be 0");

        }

        System.out.println(divident/divisor);

    }

    public static void checkedException() throws IOException {

        throw new IOException();

    }


}
