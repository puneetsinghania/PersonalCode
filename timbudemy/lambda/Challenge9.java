package timbudemy.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Challenge9 {

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

        /* String st="";
        for(String names:topNames2015)
        {
            char[] charray=names.toCharArray();
            for(int i=0; i<charray.length;i++)
            {
                if(i==0)
                {
                    st=st + String.valueOf(charray[i]).toUpperCase();
                }
                else
                {
                    st=st+String.valueOf(charray[i]);
                }
            }
            System.out.println(st);
            st="";
        } */

        List<String> modNames=new ArrayList<>();
        topNames2015.forEach(name -> modNames.add(name.substring(0,1).toUpperCase() + name.substring(1)) );
        modNames.sort((s1,s2) -> s1.compareTo(s2));
        modNames.forEach(name -> System.out.println(name));
    }
}
