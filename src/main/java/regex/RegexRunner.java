package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexRunner {
    public static void main(String[] args) {


        String input = "abba abba abba aaba";

        Pattern pattern = Pattern.compile("a+?b+?a");

        Matcher matcher = pattern.matcher(input);

        if (matcher.find()){

            System.out.println(matcher.group());
        } else System.out.println("no match");

    }
}
