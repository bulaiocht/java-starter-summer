package misc;

public class AccessTest {


    public static void main(String[] args) {

        int a = 5;

        int b = 6;

        int sum = sum(a, b);

        System.out.println(a + " + " + b + " = " + sum);

    }

    static int sum(int a, int b){

        int sum = a + b;

        return sum;

    }

}
