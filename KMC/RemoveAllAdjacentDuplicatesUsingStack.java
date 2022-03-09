package KMC;

import java.util.*;

public class RemoveAllAdjacentDuplicatesUsingStack {

    public static void main(String[] args) {

        //int[] ar={1,5,6,8,8,8,0,1,1,0,6,5};
        int[] ar={1,9,6,8,8,8,0,1,1,0,6,5};

        int[] res = removeAdjacent(ar);

        System.out.println(Arrays.toString(res));
    }

    public static int[] removeAdjacent(int[] ar) {
        Stack<Integer> stack= new Stack<>();
        List<Integer> list=new ArrayList<>();

        for(int i=0;i<ar.length;i++)
        {
            if(stack.isEmpty() || ar[i]!=stack.peek())
                stack.push(ar[i]);
            else
            {
                while(i<ar.length && ar[i]==stack.peek())
                {
                    i++;
                }
                if(!stack.isEmpty())
                    stack.pop();

                i--;
            }
        }

        while(!stack.isEmpty())
        {
            list.add(stack.pop());
        }

        Collections.reverse(list);
        int[] output = list.stream().mapToInt(i->i).toArray();
        return output;
    }
}
