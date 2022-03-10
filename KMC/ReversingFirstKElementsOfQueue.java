package KMC;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReversingFirstKElementsOfQueue {

    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.add(50);
        queue.add(60);
        queue.add(70);
        queue.add(80);
        queue.add(90);
        queue.add(100);

        int k=5;

        Queue<Integer> res = reverseFirstK(queue,k);

        while(!res.isEmpty())
        {
            System.out.print(res.poll() + " ");
        }

    }

    public static Queue<Integer> reverseFirstK(Queue<Integer> q,int k) {

        Stack<Integer> s= new Stack<>();

        for(int i=0;i<k;i++)
        {
            s.push(q.poll());
        }

        while(!s.isEmpty())
        {
            q.add(s.pop());
        }

        for(int i=0;i<q.size()-k;i++)
        {
            q.add(q.poll());
        }

        return q;
    }
}
