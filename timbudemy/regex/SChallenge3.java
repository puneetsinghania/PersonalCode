package timbudemy.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SChallenge3 {

    public static void main(String[] args) {

        String challenge1="I want a bike";
        String challenge2="I want a ball";

        String regex="I want a \\w+.";
        Pattern p= Pattern.compile(regex);
        Matcher m= p.matcher(challenge1);
        System.out.println(m.matches());

        m=p.matcher(challenge2);
        System.out.println(m.matches());
    }
}
