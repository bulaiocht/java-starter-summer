package misc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class StreamRunner {
    public static void main(String[] args) {

        Random random = new Random();
        int limit = 10;
        int bound = 1501;

        Supplier<Integer> supplier = () -> random.nextInt(bound);

        Stream.iterate("0", str -> str + "0")
                .limit(25).forEach(System.out::println);

        ArrayList<Integer> collect = Stream.generate(supplier)
                .limit(limit)
                .distinct()
                .collect(ArrayList::new, ArrayList::add, (list, numbers) -> numbers.addAll(list));

        collect.forEach(System.out::println);

        Stream<Character> characterStream = getChars('a', 'z');


    }

    private static Stream<Character> getChars(char start, char end){
        int size = start <= end ? start - end : end - start;
        Character [] chars = new Character [size];
        int index = 0;

        for (char i = start; i < end; i++) {
            chars[index] = i;
            index++;
        }

        return Arrays.stream(chars);
    }

    private static int getNeg(int pos) {
        return ~pos + 1;
    }


}
