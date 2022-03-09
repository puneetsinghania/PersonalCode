package KMC;

import java.util.Stack;

public class SortAStackInAscendingOrderUsingExtraTempStack {

    public static void main(String[] args) {

        Stack<Integer> stack= new Stack<>();
        stack.push(3);
        stack.push(1);
        stack.push(4);
        stack.push(2);

        Stack<Integer> res = sortStack(stack);
        while(!res.isEmpty())
        {
            System.out.println(res.pop());
        }
    }

    public static Stack<Integer> sortStack(Stack<Integer> stack) {

        Stack<Integer> temp= new Stack<>();

        while(!stack.isEmpty())
        {
            int var= stack.pop();
            while(!temp.isEmpty() && var>temp.peek())
            {
                stack.push(temp.pop());
            }
            temp.push(var);
        }

        return temp;

    }
}
