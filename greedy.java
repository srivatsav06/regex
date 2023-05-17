package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class greedy {
    public static void main(String[] args) {
        String inputString = "A small eagle landed in the meadow.";

        // Regular expression "e.+?d"
        Pattern pattern1 = Pattern.compile("e.+?d");
        Matcher matcher1 = pattern1.matcher(inputString);
        if (matcher1.find()) {
            System.out.println("Pattern 'e.+?d' matches: " + matcher1.group());
        } else {
            System.out.println("Pattern 'e.+?d' doesn't match");
        }

        // Regular expression "e.+d"
        Pattern pattern2 = Pattern.compile("e.+d");
        Matcher matcher2 = pattern2.matcher(inputString);
        if (matcher2.find()) {
            System.out.println("Pattern 'e.+d' matches: " + matcher2.group());
        } else {
            System.out.println("Pattern 'e.+d' doesn't match");
        }
    }
}
