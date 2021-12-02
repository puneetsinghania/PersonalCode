package timbudemy.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SChallenge9 {

    public static void main(String[] args) {

        String challenge9="abcd.135\tuvqz.7\ttzik.999\n";

        String regex= "[a-zA-Z]+\\.(\\d+)\\s";
        Pattern p= Pattern.compile(regex);
        Matcher m= p.matcher(challenge9);

        while(m.find())
        {
            System.out.print(m.group(1)+" ");
        }


    }
}
