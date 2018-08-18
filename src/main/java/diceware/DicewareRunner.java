package diceware;

import javafx.util.Pair;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class DicewareRunner {

    public static void main(String[] args) {

        ArrayList list = new ArrayList();

        list.add(1);
        list.add(3);
        list.add(8);
        list.add(" ");
        list.add('a');

        Integer integer = 8;

        for (Object o : list) {
            System.out.println(o);
        }

        ArrayList<Integer> integers = new ArrayList<>();

        integers.add(3);
        integers.add(3);
        integers.add(3);
        integers.add(3);
        integers.add(3);
        integers.add(3);

        System.out.println("size is " + integers.size());

        Map<Integer, String> dictionary = new HashMap<>();

        dictionary.put(6565, "wipe");

        System.out.println("dictionary size: " + dictionary.size());

        String s = dictionary.get(6565);

        System.out.println(s);

        Pair<Integer, String> pair = new Pair<>(1, "Hello");

        pair.getKey();

        pair.getValue();

        System.out.println(pair.toString());

        Map.Entry<Integer, String> hello = Map.entry(1, "Hello");

        Integer integerVal;
        Double doubleVal;
        Float floatVal;
        Long longVal;
        Boolean boolVal;
        Short shortVal;
        Character charVal;
        Byte byteVal;

        int i = Integer.parseInt("6565");

        integerVal = 6;

        System.out.println(Objects.hashCode(integerVal));

        integerVal = 7;

        System.out.println(Objects.hashCode(integerVal));
    }

}
