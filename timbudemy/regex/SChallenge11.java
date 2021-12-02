package timbudemy.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SChallenge11 {

    public static void main(String[] args) {

        String challenge11= "{0, 2}, {0, 5}, {1, 3}, {2, 4}";
        String regex= "\\{(.+?)\\}";        // ? means lazy loading
        Pattern p= Pattern.compile(regex);
        Matcher m= p.matcher(challenge11);

        while(m.find())
        {
            System.out.println(m.group(1));
        }

        System.out.println("***************");

        String challenge11a= "{0, 2}, {0, 5}, {1, 3}, {2, 4}, {x, y}, {11, 12}";
        String regexa= "\\{(\\d+, \\d+)\\}";
        Pattern pa= Pattern.compile(regexa);
        Matcher ma= pa.matcher(challenge11a);

        while(ma.find())
        {
            System.out.println(ma.group(1));
        }
    }
}
