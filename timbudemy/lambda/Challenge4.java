package timbudemy.lambda;

import java.util.function.Function;

public class Challenge4 {

    public static void main(String[] args) {

        Function<String,String> lambdaFunction= source -> {
            StringBuilder returnVal=new StringBuilder();
            for(int i=0;i<source.length();i++)
            {
                if(i%2==1)
                    returnVal.append(source.charAt(i));
            }
            return returnVal.toString();
        };

        String res=everySecondCharacter(lambdaFunction,"1234567890");
        System.out.println(res);
    }

    public static String everySecondCharacter(Function<String,String> func, String source)
    {
      return func.apply(source);
    }
}
