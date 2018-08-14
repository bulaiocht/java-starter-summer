package errors;

import errors.stack.SOECreator;
import errors.stack.TimedSOECreator;

import java.io.IOException;

public class ErrorRunner {
    public static void main(String[] args) throws CustomException, InterruptedException {

        int [] array = new int[5];

        try {

            System.out.println(array[6]);

        } catch (ArrayIndexOutOfBoundsException e) {

            System.out.println("You are out of bound");

        }

        String nullWord = null;

        try {

            System.out.println(nullWord);

        } catch (NullPointerException e) {

            System.out.println("You've called method from nonexistent object");

        } catch (Exception e1){

            System.out.println("Exception handled");

        } finally {
            System.out.println("Finally clause");
        }

        try {
            IllegalArgumentCreator.div(5, 0);
        } catch (Exception e) {
            System.out.println("Exception happened " + e.getMessage() + e.getClass().getName());
        }

        try {
            IllegalArgumentCreator.checkedException();
        } catch (IOException e) {
            e.printStackTrace();
        }

//        if (true){
//            throw new CustomException();
//        }


        //Do not catch ERRORS!
        try {

            long[] l = new long[Integer.MAX_VALUE];

        } catch (Error e) {

            e.printStackTrace();

        } finally {

            System.out.println("Finally");

        }

        System.out.println("End of class");

        RecursiveCall.recursion();

        ConstructorException constructorException = null;

        try {

            constructorException = new ConstructorException(70);

        } catch (Exception e) {
            System.out.println("Exception thrown: " + e.getLocalizedMessage() );
        }

        Thread t1 = new SOECreator();
        Thread t2 = new TimedSOECreator();

        t1.start();
        t2.start();
        t1.join();
        t2.join();


    }
}
