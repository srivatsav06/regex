package regex;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class RegexExample {
    public static void main(String[] args) {
        // Define the input string
        String inputString = "The quick brown fox jumped quickly over the fence, displaying its quick reflexes.";
        
        String inputString2 = "quick";
        
        // Define the regex pattern
        String regexPattern = "quick";
        
        // https://docs.oracle.com/javase/8/docs/api/java/util/regex/Pattern.html#compile-java.lang.String-
        // Create a Pattern object using the compile() factory method
        Pattern pattern = Pattern.compile(regexPattern);
        
        // https://docs.oracle.com/javase/8/docs/api/java/util/regex/Pattern.html#matcher-java.lang.CharSequence-
        // Create a Matcher object by calling matcher() on the pattern
        Matcher matcher = pattern.matcher(inputString);

        // Check if the pattern matches the input string
        boolean isMatch = matcher.matches();

        // Print the result
        if (isMatch) {
            System.out.println("Pattern matches the input string.");
        } else {
            System.out.println("Pattern does not match the input string.");
        }
        // https://docs.oracle.com/javase/8/docs/api/java/util/regex/Matcher.html#find--
        System.out.println(matcher.find());
        System.out.println(matcher.find());
        System.out.println(matcher.find());
        System.out.println(matcher.find());

    }
}
