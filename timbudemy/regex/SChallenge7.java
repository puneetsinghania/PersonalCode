package timbudemy.regex;

public class SChallenge7 {

    public static void main(String[] args) {

        String challenge7="abcd.135";

        String regex="^[a-z]+[.][0-9]+$";
        System.out.println(challenge7.matches(regex));
    }
}
