package arrays;

import java.util.Arrays;
import java.util.Random;

public class UtilityClass {

    private static final Random random = new Random();

    /**
     * This method finds repeats of a given keys in given elements.
     * @param keys given keys.
     * @param elements elements in which should be performed lookup.
     * @return array in which numbers of repeats are corresponded to each key
     */
    public static int[][] getRepeats(int [] keys, int [] elements) {

        Arrays.sort(elements);

        int [] uniques = getUniqueElements(keys);

        int [][] repeats = new int[uniques.length][2];

        for (int i = 0; i < uniques.length; i++) {
            repeats[i][0] = uniques[i];
        }

        int repeatCount = 0;

        for (int i = 0; i < uniques.length; i++) {

            for (int element : elements) {

                if (uniques[i] == element) {
                    repeatCount++;
                } else repeats[i][1] = repeatCount;

            }

            repeatCount = 0;
        }
        return repeats;
    }

    public static int[][] getRepeats(char [] keys, char [] elements) {

        Arrays.sort(elements);

        char [] uniques = getUniqueElements(keys);

        int [][] repeats = new int[uniques.length][2];

        for (int i = 0; i < uniques.length; i++) {
            repeats[i][0] = uniques[i];
        }

        int repeatCount = 0;

        for (int i = 0; i < uniques.length; i++) {

            for (char element : elements) {
                if (uniques[i] == element) {
                    repeatCount++;
                } else repeats[i][1] = repeatCount;
            }

            repeatCount = 0;
        }

        return repeats;
    }

    public static char [] getUniqueElements(char [] elements) {

        Arrays.sort(elements);

        int unique = 1;
        char current = elements[0];
        for (int i = 0; i < elements.length - 1; i++) {
            if (current != elements[i + 1]){
                unique++;
                current = elements[i + 1];
            }
        }

        char [] uniques = new char [unique];
        int index = 1;
        current = elements[0];
        uniques[0] = current;

        for (int i = 1; i < elements.length; i++) {
            if (elements[i - 1] != elements[i]){
                current = elements[i];
                uniques[index] = current;
                index++;
            }
        }

        return uniques;
    }

    public static int [] getUniqueElements(int [] elements) {

        Arrays.sort(elements);

        int unique = 1;
        int current = elements[0];
        for (int i = 0; i < elements.length - 1; i++) {
            if (current != elements[i + 1]){
                unique++;
                current = elements[i + 1];
            }
        }

        int [] uniques = new int [unique];
        int index = 1;
        current = elements[0];
        uniques[0] = current;

        for (int i = 1; i < elements.length; i++) {
            if (elements[i - 1] != elements[i]){
                current = elements[i];
                uniques[index] = current;
                index++;
            }
        }

        return uniques;
    }

    public static void randomize(int [] elements, int lower, int upper){
        int bound = upper - lower + 1;
        for (int i = 0; i < elements.length; i++) {
            elements[i] = random.nextInt(bound) + lower;
        }

    }

    public static void randomize(char [] chars, char lower, char upper){

        int bound = upper - lower;

        for (int i = 0; i < chars.length; i++) {

            chars[i] = (char) (random.nextInt(bound) + lower);

        }

    }


}
