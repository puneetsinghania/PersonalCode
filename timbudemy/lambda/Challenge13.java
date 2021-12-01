package timbudemy.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Challenge13 {

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

        topNames2015
                .stream()
                .map(name -> name.substring(0,1).toUpperCase() + name.substring(1))
                .peek(System.out::println)
                .sorted(String::compareTo)
                .collect(Collectors.toList());
    }
}
