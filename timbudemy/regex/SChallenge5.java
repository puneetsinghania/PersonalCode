package timbudemy.regex;

public class SChallenge5 {

    public static void main(String[] args) {

        String challenge5="aaabccccccccdddefffg";
        String regex="[a-zA-Z]+";
        System.out.println(challenge5.matches(regex));
    }
}
