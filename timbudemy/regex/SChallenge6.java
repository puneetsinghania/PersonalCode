package timbudemy.regex;

public class SChallenge6 {

    public static void main(String[] args) {

        String challenge5="aaabccccccccdddefffg";
        String regex="^a{3}bc{8}d{3}ef{3}g$";
        System.out.println(challenge5.matches(regex));
    }
}
