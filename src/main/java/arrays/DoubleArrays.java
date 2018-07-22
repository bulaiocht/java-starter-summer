package arrays;

import java.util.Random;

public class DoubleArrays {
    public static void main(String[] args) {


        int [][] table = new int[3][3];

        int length = table[1].length;

//        System.out.println(length);

        table[1][1] = 8;

        Random random = new Random();

//        int random1 = (int) (Math.random()*100);

        for (int i = 0; i < table.length; i++) {

            for (int j = 0; j < table[i].length; j++) {

                table[i][j] = random.nextInt(11);

            }

        }

        for (int i = 0; i < table.length; i++) {

            for (int j = 0; j < table[i].length; j++) {

                System.out.print(table[i][j] + " ");

            }

            System.out.println();
        }


//        int [][][][][][][][] crazyArray = new int[1][2][5][1][2][6][8][10];

    }
}
