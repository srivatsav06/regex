
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindQuestionMarkExample {
    public static void main(String[] args) {
        String input = "This is a sample string with a question mark (?) in it.";

        Pattern pattern = Pattern.compile("\\?"); // Escaping the question mark with a backslash in the regular expression
        Matcher matcher = pattern.matcher(input);

        while (matcher.find()) {
            int startIndex = matcher.start();
            int endIndex = matcher.end();
            String matchedSubstring = input.substring(startIndex, endIndex);

            System.out.println("Found question mark at index " + startIndex + ": " + matchedSubstring);
        }
    }
}
