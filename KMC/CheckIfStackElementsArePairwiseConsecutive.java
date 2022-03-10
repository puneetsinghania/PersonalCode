package KMC;

import java.util.Stack;

public class CheckIfStackElementsArePairwiseConsecutive {

    public static void main(String[] args) {

        Stack<Integer> s = new Stack<>();
        s.push(4);
        s.push(5);
        s.push(-2);
        s.push(-3);
        s.push(11);
        s.push(10);
        s.push(5);
        s.push(6);
        s.push(20);

        boolean isPairwiseConsecutive = pairwiseConsecutive(s);
        System.out.println(isPairwiseConsecutive);
    }

    public static boolean pairwiseConsecutive(Stack<Integer> s) {

        Stack<Integer> temp= new Stack<>();

        while(!s.isEmpty())
        {
            temp.push(s.pop());
        }

        while(temp.size()>1)
        {
            int x= temp.pop();
            int y= temp.pop();

            if(Math.abs(x-y)!=1)
                return false;

            s.push(x);
            s.push(y);
        }
        if(temp.size()==1)
            s.push(temp.pop());

        return true;
    }
}
