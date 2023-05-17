

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CombinedBackreferenceExample {
    public static void main(String[] args) {
        String inputString1 = "ABC";
        String patternString1 = "(A)(B(C))";

        Pattern pattern1 = Pattern.compile(patternString1);
        Matcher matcher1 = pattern1.matcher(inputString1);

        if (matcher1.matches()) {
            System.out.println("Matched Group 1: " + matcher1.group(1));
            System.out.println("Matched Group 2: " + matcher1.group(2));
            System.out.println("Matched Group 3: " + matcher1.group(3));
        } else {
            System.out.println("No match found for pattern1.");
        }

        System.out.println();

        String inputString2 = "ABC";
        String patternString2 = "(A)(B)(C)";

        Pattern pattern2 = Pattern.compile(patternString2);
        Matcher matcher2 = pattern2.matcher(inputString2);

        if (matcher2.matches()) {
            System.out.println("Matched Group 1: " + matcher2.group(1));
            System.out.println("Matched Group 2: " + matcher2.group(2));
            System.out.println("Matched Group 3: " + matcher2.group(3));
        } else {
            System.out.println("No match found for pattern2.");
        }
    }
}
