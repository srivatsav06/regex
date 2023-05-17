package regex;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BackreferenceExample1 {
    public static void main(String[] args) {
        String inputString = "GOVERNESSSHIP  YAYYY EGG HOSTESSHIP";

        // Example 5: Backreference for finding consecutive characters
        //Matcher matcher = Pattern.compile("")//fill
        Matcher matcher = Pattern.compile("(\\w)\\1+")
                .matcher(inputString);
        while (matcher.find()) {
            System.out.println("Match: " + matcher.group() + " at " + matcher.start() + "-" + matcher.end());
        }
    }
}



































// Matcher matcher = Pattern.compile("(\\w)\\1+")