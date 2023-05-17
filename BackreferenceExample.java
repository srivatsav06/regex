import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BackreferenceExample {
    public static void main(String[] args) {
        String inputString1 = "a9a";
        String inputString2 = "a9b";

        // Example 1: Capturing group backreference
        boolean match1 = Pattern.compile("([A-Za-z])[0-9]\\1")
                .matcher(inputString1)
                .find();
        System.out.println("Example 1: " + match1); // true

        // Example 2: Group not backreferenced at the end
        boolean match2 = Pattern.compile("[A-Za-z][0-9][A-Za-z]")
                .matcher(inputString2)
                .find();
        System.out.println("Example 2: " + match2); // true

        // Example 3: Group referenced before it's defined
        boolean match3 = Pattern.compile("([A-Za-z])[0-9]\\1")
                .matcher(inputString2)
                .find();
        System.out.println("Example 3: " + match3); // false

        // Example 4: Group referenced without being defined
        boolean match4 = Pattern.compile("\\1[0-9]([A-Za-z])")
                .matcher(inputString1)
                .find();
        System.out.println("Example 4: " + match4); // false
    }
}
