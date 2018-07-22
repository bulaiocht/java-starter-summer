package strings;

import java.util.Arrays;
import java.util.StringJoiner;

public class StringRunner {

    public static void main(String[] args) {

        //Конкатенация строк
        String words = "sorting algorithms";
        String otherWords = " are cool!";
        String finalWords = words + otherWords;
        System.out.println(finalWords);

        // StringJoiner помогает строить красивые последовательности строк
        StringJoiner joiner = new StringJoiner("~" , "\"", "\"");

        for (int i : finalWords.toCharArray()) {
            joiner.add(String.valueOf((char) i));
        }
        System.out.println(joiner.toString());


        System.out.println(finalWords + "#");

        System.out.println(3 + "#");

        System.out.println("#" + 3 + 2);

        System.out.println("#" + (3 + 2));

        System.out.println("#" + (3 - 2));

        int a = 64;

        double sqrt = Math.sqrt(a);

        System.out.println(sqrt);

        final double pow = Math.pow(2, 4);

        System.out.println(pow);


        //Перевод строки в число
        String number = "3215";
        Integer integer = Integer.valueOf(number);
        System.out.println(integer + 3);


        //Пример со строками и пулом строк
        String one = "one";

        String two = "one";

        String three = new String("one");

        String intern = three.intern();

        //Знак сравнения == для ссылочных типов, таких как String
        //сравнит не объекты хранящиеся по ссылкам в памяти, а сами ссылки.
        //one и two указывают на один объект в пуле стрингов,
        //поэтому это сравнение вернёт true
        System.out.println(one == two);

        //Вернёт false потому что three указывает на новый объект вне пула стрингов
        System.out.println(one == three);

        //Вернёт true потому что метод intern() найдет слово "one" в
        //пуле и укажет на него ссылку intern.
        System.out.println(one == intern);


        //Метод split()
        String sentence = "Quick brown fox jumps over the lazy dog";
        String[] split = sentence.split(" ");
        System.out.println(Arrays.toString(split));
    }
}
