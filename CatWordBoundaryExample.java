
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CatWordBoundaryExample {
    public static void main(String[] args) {
        String inputString = "I have a pet cat named catalina. bobcat are wonderful animals.";
        // String patternString = "\\bcat\\b";
        String patternString = "cat\\b";
        Pattern pattern = Pattern.compile(patternString);
        Matcher matcher = pattern.matcher(inputString);

        while (matcher.find()) {
            System.out.println("Match found: " + matcher.group());
        }
    }
}
