package leetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class Q1805_NumberOfDiffIntegersInAString_Optimal {

    public static void main(String[] args)
    {
        int num = numDifferentIntegers("a123bc34d8ef34");
        System.out.println(num);
    }
    public static int numDifferentIntegers(String word) {

        return (int) Arrays.stream(word.replaceAll("[a-zA-Z]+"," ")
                            .split(" "))
                            .filter(s -> !s.equals(""))
                            .map(s -> s.replaceFirst("^0+",""))
                            .distinct()
                            .count();
    }
}