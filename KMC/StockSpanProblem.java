package KMC;

import java.util.Arrays;
import java.util.Stack;

public class StockSpanProblem {

    public static void main(String[] args) {

        int[] ar= {100,80,60,70,60,75,85};
        int[] res = findSpanArray(ar);

        System.out.println(Arrays.toString(res));
    }

    public static int[] findSpanArray(int[] ar) {
        Stack<Integer> stack = new Stack<>();
        int[] span= new int[ar.length];

        stack.push(0);
        span[0]=1;

        for(int i=1;i<ar.length;i++)
        {
            while(!stack.isEmpty() && ar[stack.peek()]<=ar[i])
            {
                stack.pop();
            }

            if(stack.isEmpty())
                span[i]= i+1;
            else
                span[i]= i-stack.peek();

            stack.push(i);
        }
        return span;
    }
}
