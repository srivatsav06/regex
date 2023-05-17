package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class backslash {
    public static void main(String[] args) {
        String inputString = "\\\\\\\\\\";
        System.out.println(inputString);
        String patternString = "\\\\";
        System.out.println(patternString);
        Pattern pattern = Pattern.compile(patternString);
        Matcher matcher = pattern.matcher(inputString);

        while (matcher.find()) {
            String matchedSubstring = matcher.group();
            int startIndex = matcher.start();
            int endIndex = matcher.end() - 1; // Adjusting the end index

            System.out.println("Matched substring: " + matchedSubstring);
            System.out.println("Start index: " + startIndex);
            System.out.println("End index: " + endIndex);
            System.out.println();
        }
    }
}

