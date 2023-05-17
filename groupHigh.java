package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class groupHigh {
    public static void main(String[] args) {
        // Define the input string
        String inputString = "Hello, my name is John Doe. I am 30 years old.";

        // Define the regex pattern
        String regexPattern = "([A-Za-z]+) ([A-Za-z]+)";

        // Create a Pattern object using the compile() factory method
        Pattern pattern = Pattern.compile(regexPattern);

        // Create a Matcher object by calling matcher() on the pattern
        Matcher matcher = pattern.matcher(inputString);

        // Perform the match operation
        if (matcher.find()) {
            // Use group() to obtain the entire matching sequence
            String fullMatch = matcher.group();
            System.out.println("Full match: " + fullMatch);

            // Use group(int group) to obtain a specific captured group
            String firstName = matcher.group(1);
            String lastName = matcher.group(2);
            System.out.println("First name: " + firstName);
            System.out.println("Last name: " + lastName);

            // Use groupCount() to get the number of capturing groups
            int numGroups = matcher.groupCount();
            System.out.println("Number of capturing groups: " + numGroups);
        } else {
            System.out.println("No match found.");
        }
    }
}

