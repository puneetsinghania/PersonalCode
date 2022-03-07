package KMC;

import java.util.Stack;

public class CheckingBalancingOfSymbols {

    public static void main(String[] args) {
           //boolean res= validParantheses("(A+B)+(C-D)");
           //boolean res= validParantheses("((A+B)+(C-D)");
           //boolean res= validParantheses("((A+B)+[C-D])");
           boolean res= validParantheses("((A+B)+[C-D]}");
           System.out.println(res);
    }

    public static boolean validParantheses(String str) {
        char[] ar= str.toCharArray();
        Stack<Character> stack=new Stack<>();

        for(int i=0;i<ar.length;i++)
        {
            char ch=ar[i];
            switch(ch) {

                case '(':
                case '{':
                case '[':
                    stack.push(ch);
                    break;
                case ')':
                    if (!stack.isEmpty() && stack.peek() == '(')
                        stack.pop();
                    else
                        stack.push(ch);
                    break;
                case '}':
                    if (!stack.isEmpty() && stack.peek() == '{')
                        stack.pop();
                    else
                        stack.push(ch);
                    break;
                case ']':
                    if (!stack.isEmpty() && stack.peek() == '[')
                        stack.pop();
                    else
                        stack.push(ch);
                    break;
            }
        }
        if(stack.isEmpty())
            return true;
        else
            return false;
    }
}
