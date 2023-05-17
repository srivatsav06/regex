package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class groupmid {
    public static void main(String[] args) {
        // Define the input string
        String inputString = "The quick brown fox jumped over the lazy dog.";

        // Define the regex pattern
        String regexPattern = "The (quick|slow) (brown|red) fox (jumped|ran) over the (lazy|active) (dog|cat).";

        // Create a Pattern object using the compile() factory method
        Pattern pattern = Pattern.compile(regexPattern);

        // Create a Matcher object by calling matcher() on the pattern
        Matcher matcher = pattern.matcher(inputString);

        // Perform the match operation
        if (matcher.find()) {
            // Use groupCount() to get the number of capturing groups
            int numGroups = matcher.groupCount();

            // Print the number of capturing groups
            System.out.println("Regex Pattern: " + regexPattern);
            System.out.println("Number of capturing groups: " + numGroups);
            System.out.println("Found value: " + matcher.group(0));
            System.out.println("Found value: " + matcher.group(1));
            System.out.println("Found value: " + matcher.group(2));
            System.out.println("Found value: " + matcher.group(3));  
            System.out.println("Found value: " + matcher.group(4));  
            System.out.println();
        } else {
            System.out.println("No match found for pattern: " + regexPattern);
            System.out.println();
        }
    }
}

