package timbudemy.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SChallenge10 {

    public static void main(String[] args) {

        String challenge10="abcd.135\tuvqz.7\ttzik.999\n";

        String regex= "[a-zA-Z]+\\.(\\d+)\\s";
        Pattern p= Pattern.compile(regex);
        Matcher m= p.matcher(challenge10);

        while(m.find())
        {
            //System.out.print(m.group(1)+" ");
            System.out.println(m.start(1)+" "+ (m.end(1)-1));
        }


    }
}
