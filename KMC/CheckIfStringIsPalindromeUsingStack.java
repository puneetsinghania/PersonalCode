package KMC;

import java.util.Stack;

public class CheckIfStringIsPalindromeUsingStack {

    public static void main(String[] args) {
        //ababaXababa, babaXabababa, babaXaba, X, ababaXababb
        boolean res = checkIfPalindrome("ababaXababb");
        System.out.println(res);
    }

    public static boolean checkIfPalindrome(String str) {
        Stack<Character> stack = new Stack<>();
        char[] ar= str.toCharArray();
        int i=0;

        for(;i<ar.length && ar[i]!='X';i++)
        {
            if (ar[i]!='X')
                stack.push(ar[i]);
        }
        if(ar[i]=='X')
        {
            for(i=i+1;i<ar.length;i++)
            {
                if(stack.isEmpty() || ar[i]!=stack.pop())
                    return false;
            }
        }
        if(stack.isEmpty())
            return true;
        else
            return false;
    }
}
