package arrays;

import java.util.Arrays;
import java.util.Random;

public class Sorts {

    public static void main(String[] args) {

        //финальная переменная
        //её значение нельзя изменить после инициализации
        //final int a = 32;

        int [] array = new int[10];
        Random random = new Random();
        int bound = 51;

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(bound);
        }

        //Печать массива с помощью цикла for
        for (int i = 0; i < array.length; i++) {
            System.out.print( array[i] + " ");
        }

        System.out.println();

        //Печать массива с помощью утилитного метода Arrays.toString()
        System.out.println( Arrays.toString(array) );


        //Пузырьковая сортировка
        int count = array.length;

        for (int i = 0; i < count; i++) {

            for (int j = 1; j < count - i; j++) {

                if (array[j - 1] > array [j] ){

                    int temp = array[j - 1];

                    array [j - 1] = array [j];

                    array [j] = temp;

                }

            }

        }

        //Сортировка массива с помощью утилитного метода Arrays.sort()
        Arrays.sort(array);

        System.out.println(Arrays.toString(array));

    }

}
