package errors;

public class RecursiveCall {

    private static int counter = 0;


    public static void recursion(){

        counter++;
        System.out.println(counter);
        if (counter <= 200) {
            recursion();
        }

    }

}
