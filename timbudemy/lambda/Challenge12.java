package timbudemy.lambda;

import java.util.Arrays;
import java.util.List;

public class Challenge12 {

    public static void main(String[] args) {

        List<String> topNames2015= Arrays.asList(
                "Amelia",
                "Olivia",
                "emily",
                "Isla",
                "Ava",
                "oliver",
                "Jack",
                "Charlie",
                "harry",
                "Jacob"
        );

        long namesCount= topNames2015
                .stream()
                .filter(name -> name.substring(0,1).equalsIgnoreCase("A") )
                .count();

        System.out.println(namesCount);
    }
}
