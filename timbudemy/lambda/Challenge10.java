package timbudemy.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Challenge10 {

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

        List<String> modNames=new ArrayList<>();
        topNames2015.forEach(name -> modNames.add(name.substring(0,1).toUpperCase() + name.substring(1)) );
        modNames.sort(String::compareTo);
        modNames.forEach(System.out::println);
    }
}
