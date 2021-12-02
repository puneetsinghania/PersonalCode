package timbudemy.regex;

public class SChallenge13 {

    public static void main(String[] args) {

        String zipcode="11111-1111";

        String regex="^\\d{5}-\\d{4}$";
        System.out.println(zipcode.matches(regex));
    }
}
