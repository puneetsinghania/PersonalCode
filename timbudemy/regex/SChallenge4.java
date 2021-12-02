package timbudemy.regex;

public class SChallenge4 {

    public static void main(String[] args) {

        String challenge4= "Replace all blanks with underscores.";

        challenge4=challenge4.replaceAll("\\s+","_");
        System.out.println(challenge4);
    }
}
