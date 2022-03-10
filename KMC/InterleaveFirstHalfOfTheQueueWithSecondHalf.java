package KMC;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class InterleaveFirstHalfOfTheQueueWithSecondHalf {

    public static void main(String[] args) {
        Queue<Integer> q= new LinkedList<>();
        q.add(11);
        q.add(12);
        q.add(13);
        q.add(14);
        q.add(15);
        q.add(16);
        q.add(17);
        q.add(18);
        q.add(19);
        q.add(20);

        Queue<Integer> output = interleave(q);
        while(q!=null && !q.isEmpty())
        {
            System.out.println(q.poll());
        }
    }

    public static Queue<Integer> interleave(Queue<Integer> q) {

        if(q.size()%2!=0)
        {
            System.out.println("Enter even number of integers");
            return null;
        }
        else
        {
            Stack<Integer> s= new Stack<>();
            int half= q.size()/2;

            //1st
            for(int i=0;i<half;i++)
            {
                s.push(q.poll());
            }

            //2nd
            while(!s.isEmpty())
            {
                q.add(s.pop());
            }

            //3rd
            for(int i=0;i<half;i++)
            {
                q.add(q.poll());
            }

            //4th
            for(int i=0;i<half;i++)
            {
                s.push(q.poll());
            }

            //5th
            while(!s.isEmpty())
            {
                q.add(s.pop());
                q.add(q.poll());
            }

            return q;
        }

    }
}
