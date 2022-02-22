package KMC;

public class FindLengthIfLoopFoundInLinkedList {

    static Node73 head;

    public static void main(String[] args) {

        FindLengthIfLoopFoundInLinkedList llist = new FindLengthIfLoopFoundInLinkedList();

        llist.push(20);
        llist.push(4);
        llist.push(15);
        llist.push(10);

        /*Create loop for testing */
        llist.head.next.next.next.next = llist.head;

        //MOST IMPORTANT METHOD CALL
        Node73 loopPoint = detectLoop(head);

        if (loopPoint != null) {
            int length = findLength(head, loopPoint);
            System.out.println(length);
        }
    }

    public void push(int new_data) {
	        /* 1 & 2: Allocate the Node & 
	                  Put in the data*/
		Node73 new_node = new Node73(new_data);

        /* 3. Make next of new Node as head */
        new_node.next = head;

        /* 4. Move the head to point to new Node */
        head = new_node;
    }

    //MOST IMPORTANT METHOD
    public static Node73 detectLoop(Node73 head) {
		Node73 f = head;
		Node73 s = head;
        while (s != null && f != null && f.next != null) {
            f = f.next.next;
            s = s.next;

            if (f == s)
                return f;

        }
        return null;

    }

    public static int findLength(Node73 head, Node73 loopPoint) {
		int length=0;

		Node73 f=loopPoint;
		f=f.next;
		length++;

		while(loopPoint!=f)
		{
			f=f.next;
			length++;
		}
		return length;
    }


}

class Node73
{
	int data;
	Node73 next;

	public Node73(int data)
	{
		this.data=data;
		this.next=null;
	}
}


