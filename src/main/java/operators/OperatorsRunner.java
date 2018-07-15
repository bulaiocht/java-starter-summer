package operators;

import java.util.Scanner;

public class OperatorsRunner {


    public static void main(String[] args) {


//        char first = '\u0000';
//
//        double firstdouble = 0.0d;
//
//        float firstFloat = 0.0f;
//
//        long firstLong = 0L;
//
//        int x = 50;
//
////        x++;
//
//        x--;
//
//        System.out.println(x);
//
//        int y = x - 7;
//
//        System.out.println(y);
//
//        int z = y * x;
//
//        System.out.println(z);
//
//        System.out.println( 6/4 );
//
//        System.out.println( 6.0/4.0 );
//
//        System.out.println(7 % 3);

//        int a = 1;
//
//        int b = 1;
//
//        System.out.println(--a);
//
//        System.out.println(b--);
//
//        System.out.println(b);
//
//
//        System.out.println(2 == 7);
//
//        System.out.println(2 != 0);
//
//        System.out.println( 2 > 0 && 4/2 > 0);
//
//        System.out.println(false || true);
//
//        System.out.println(false || false);
//
//
//        int x = 6;
//
//        int y = 2;
//
//        int z = 0;
//
//        z = x % y != 0 ? x : y;
//
//        System.out.println( z );
//
//
//        x = x + 7;
//        x += 7;
//
//        x = x - 7;
//        x -= 7;


//        int x = 5;
//
//        int y = 6;
//
//        if (x + y > 10) {
//
//            System.out.println("5 + 6 > 10");
//
//        } else if (x + y == 11){
//
//            System.out.println("5 + 6 == 11");
//
//        } else {
//
//            System.out.println("Something else");
//
//        }

        Scanner scanner = new Scanner(System.in);

//        System.out.println("Type in positive integer: ");
//
//        int variable = 0;
//
//        if ( (variable = scanner.nextInt()) < 0){
//
//            System.out.println("You have failed me, son!");
//
//        } else if (variable % 2 == 0) {
//
//            System.out.println(variable + " is even number");
//
//        } else {
//
//            System.out.println(variable + " is odd number");
//
//        }

//        String text = "___";
//
//        switch (text){
//            case "Hello":
//                System.out.println("Yes, hello to you too");
//                break;
//            case "Bye":
//                System.out.println("Good bye human");
//                break;
//            default:
//                System.out.println("You're wrong, boi!");
//        }

        int hexadecimal = 0x046;

        int binary = 0b01000110;

        int octal = 05761;

        System.out.println(hexadecimal);

        System.out.println(binary);

        System.out.println(Integer.toHexString(70));
    }

}
