package leetcode;

import java.util.HashSet;
import java.util.Set;

class Q1805_NumberOfDiffIntegersInAString_BruteForce {

    public static void main(String[] args)
    {
        int num = numDifferentIntegers("a123bc34d8ef34");
        System.out.println(num);
    }
    public static int numDifferentIntegers(String word) {

        String wordR= word.replaceAll("[^0-9]"," ");

        char[] ar= wordR.toCharArray();
        int count=0;
        String st="";
        int digit=0;

        for(int i=0;i<ar.length;i++)
        {
            if(ar[i]!=' ')
            {
                st=st+ar[i];

                digit=1;
                count=0;
            }
            else if(ar[i]==' ' && i!=0 && i!=ar.length-1 && count<1 && digit!=0)
            {
                boolean end=true;
                for(int j=i;j<ar.length;j++)
                {
                    if(ar[j]!=' ')
                    {
                        end=false;
                        break;
                    }
                }

                if(!end)
                {
                    st=st+ar[i];
                    count++;
                }
            }
        }

        Set<Long> set= new HashSet<>();

        String[] split= st.split(" ");
        for(String s : split)
        {
            if(!s.equals(""))
                set.add(Long.parseLong(s));
        }

        return set.size();
    }
}