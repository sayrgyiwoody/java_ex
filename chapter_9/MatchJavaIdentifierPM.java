package chapter_9;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchJavaIdentifierPM {
    private static final String STOP = "STOP";
    private static final String VALID = "Valid Java identifier";
    private static final String INVALID = "Not a valid Java identifier";

    private static final String VALID_IDENIFIER_PATTERN = "[a-zA-Z][a-zA-Z0-9_$]*";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str, reply;

        
        Pattern pattern = Pattern.compile(VALID_IDENIFIER_PATTERN);
        Matcher matcher;

        while(true) {
            System.out.println("Identifier : ");
            str = scanner.next();

            if(str.equals(STOP)){
                break;
            }

            matcher = pattern.matcher(str);

            if(matcher.matches()){
                reply = VALID;
            }else {
                reply = INVALID;
            }

            System.out.println(str + " : " + reply + "\n");
        }
    }
}
