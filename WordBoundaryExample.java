

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WordBoundaryExample {
    public static void main(String[] args) {
        String inputString = "Hello, world! Welcome to the world of programming.";
        String patternString1 = "\\bworld\\b";
        String patternString2 = "world";

        Pattern pattern1 = Pattern.compile(patternString1);
        Matcher matcher1 = pattern1.matcher(inputString);

        System.out.println("Matches using pattern \\bworld\\b:");
        while (matcher1.find()) {
            System.out.println("Match found: " + matcher1.group());
        }

        System.out.println();

        Pattern pattern2 = Pattern.compile(patternString2);
        Matcher matcher2 = pattern2.matcher(inputString);

        System.out.println("Matches using pattern world:");
        while (matcher2.find()) {
            System.out.println("Match found: " + matcher2.group());
        }
    }
}

