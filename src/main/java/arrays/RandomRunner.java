package arrays;

import java.util.Arrays;
import java.util.Random;

public class RandomRunner {
    public static void main(String[] args) {

        Random random = new Random();

        int upperBound = 500;
        int lowerBound = 200;
        int size = 20;
        int [] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = random
                    .nextInt(upperBound + lowerBound) - lowerBound;
        }
        System.out.println(Arrays.toString(array));

        int min = array[0];
        int minIndex = 0;

        int max = array[1];
        int maxIndex = 1;

        for (int i = 0; i < array.length; i++) {

            if (min > array[i]){
                min = array[i];
                minIndex = i;
            }

            if (max < array[i]){
                max = array[i];
                maxIndex = i;
            }
        }

        System.out.printf("Min index: %d, Min elem: %d \n" +
                "Max index: %d, Max elem: %d", minIndex, min, maxIndex, max);



    }
}
