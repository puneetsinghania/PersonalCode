package timbudemy.regex;

public class SChallenge12 {

    public static void main(String[] args) {

        String zipcode="11111";

        String regex="^\\d{5}$";
        System.out.println(zipcode.matches(regex));
    }
}
