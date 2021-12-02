package timbudemy.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SChallenge8 {

    public static void main(String[] args) {

        String challenge8="abcd.135uvqz.7tzik.999";

        String regex= "([0-9]+)";
        Pattern p= Pattern.compile(regex);
        Matcher m= p.matcher(challenge8);

        while(m.find())
        {
            System.out.print(m.group()+" ");
        }


    }
}
