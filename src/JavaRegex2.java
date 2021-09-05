import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*Documentación:
*https://docs.oracle.com/javase/8/docs/api/index.html?java/util/regex/package-summary.html
*https://docs.oracle.com/javase/8/docs/api/java/util/regex/Pattern.html
* https://docs.oracle.com/javase/8/docs/api/java/util/regex/Matcher.html
* */

public class JavaRegex2 {

    public static void main(String[] args) {

        String regex = "\\b(\\w+)(\\s+\\1\\b)*";
        Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);

        Scanner in = new Scanner(System.in);
        int numSentences = Integer.parseInt(in.nextLine());

        while (numSentences-- > 0) {
            String input = in.nextLine();

            Matcher m = p.matcher(input);

            // Check for subsequences of input that match the compiled pattern
            while (m.find()) {
                input = input.replaceAll(m.group(0), m.group(1));
            }

            // Prints the modified sentence.
            System.out.println(input);
        }

        in.close();

    }
}
