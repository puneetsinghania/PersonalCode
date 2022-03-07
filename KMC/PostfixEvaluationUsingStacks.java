package KMC;

import java.util.Stack;

public class PostfixEvaluationUsingStacks {

    public static void main(String[] args) {

        int res= postfixEval("123*+5-");
        System.out.println(res);
    }

    public static int postfixEval(String exp) {

        char[] ar= exp.toCharArray();
        Stack<Integer> stack=new Stack<>();

        for(int i=0;i<ar.length;i++)
        {
            if(ar[i]>='0' && ar[i]<='9')
            {
                stack.push(ar[i]-'0');
            }
            else
            {
                int res=0;
                int second=stack.pop();
                int first=stack.pop();

                switch(ar[i])
                {
                    case '/':
                        res=first/second;
                        stack.push(res);
                        break;
                    case '*':
                        res=first*second;
                        stack.push(res);
                        break;
                    case '+':
                        res=first+second;
                        stack.push(res);
                        break;
                    case '-':
                        res=first-second;
                        stack.push(res);
                        break;
                }
            }
        }
        return stack.pop();
    }
}
