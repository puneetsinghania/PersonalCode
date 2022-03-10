package KMC;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReversingAQueue {

    public static void main(String[] args) {

        Queue queue= new LinkedList();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        Queue outQ = reverseQueue(queue);

        while(!outQ.isEmpty())
        {
            System.out.println(outQ.remove());
        }
    }

    public static Queue reverseQueue(Queue queue) {
        Stack stack= new Stack();

        while (!queue.isEmpty())
        {
            stack.push(queue.remove());
        }
        while(!stack.isEmpty())
        {
            queue.add(stack.pop());
        }

        return queue;
    }
}
