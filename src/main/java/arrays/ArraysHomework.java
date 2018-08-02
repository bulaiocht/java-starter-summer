package arrays;

import java.util.Arrays;
import java.util.Random;

public class ArraysHomework {

    public static void main(String[] args) {

        String name = "Варвара";

        char[] randomChars = generateRandomChars('а', 'я', 32);

        final int[][] repeats = findRepeats(name, randomChars);

        for (int i = 0; i < repeats.length; i++) {
            System.out.println((char) repeats[i][0] + " repeats " + repeats[i][1] + " times");
        }

    }

    private static int [][] findRepeats(String name, char[] randomChars) {

        Arrays.sort(randomChars);
        print(randomChars);

        char[] uniques = findUniques(processName(name));

        int [][] repeats = new int[uniques.length][2];

        for (int i = 0; i < uniques.length; i++) {
            repeats[i][0] = uniques[i];
        }

        int letterCount = 0;

        for (int i = 0; i < repeats.length; i++) {

            for (char randomChar : randomChars) {

                if (repeats[i][0] == randomChar) {
                    letterCount++;
                } else {
                    repeats[i][1] = letterCount;
                }
            }

            letterCount = 0;

        }

        return repeats;

    }

    private static void print(char[] randomChars) {
        System.out.println(Arrays.toString(randomChars));
    }

    static char [] generateRandomChars(char start, char end, int size) {

        char [] randoms = new char[size];

        Random random = new Random();

        for (int i = 0; i < randoms.length; i++) {
            randoms[i] = (char) (random.nextInt(end - start) + start);
        }

        return randoms;
    }

    static char [] findUniques(char [] letters){

        int uniqueCounter = 1;

        char current = letters[0];

        for (int i = 0; i < letters.length - 1; i++) {
            if (current != letters[i + 1]){
                uniqueCounter++;
                current = letters[i + 1];
            }
        }

        char [] uniques = new char[uniqueCounter];

        int index = 0;
        uniques[index] = letters[0];

        for (int i = 0; i < letters.length - 1; i++) {

            if ( uniques[index] != letters[i + 1]){
                index++;
                uniques[index] = letters[i + 1];
            }

        }

        return uniques;

    }

    static char [] processName(String name){

        char[] chars = name.toLowerCase().toCharArray();

        Arrays.sort(chars);

        return chars;
    }

}
