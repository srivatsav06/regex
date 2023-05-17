package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main{
    public static void main(String[] args) {
        // https://docs.oracle.com/javase/8/docs/api/java/util/regex/Pattern.html#compile-java.lang.String-
        // https://docs.oracle.com/javase/8/docs/api/java/util/regex/Pattern.html#matcher-java.lang.CharSequence-
        // Define the regex pattern
        String regexPattern = "[A-Za-z]+"; // Matches individual words

        // Create a Pattern object using the compile() factory method
        Pattern pattern = Pattern.compile(regexPattern);

        // Create a Matcher object by calling matcher() on the pattern
        Matcher matcher = pattern.matcher("Hello, this is a regex example.");

        // Perform pattern matching
        while (matcher.find()) {
            // Get the matched word using group()
            String matchedWord = matcher.group();

            // Print the matched word
            System.out.println("Matched word: " + matchedWord);
        }
    }
}