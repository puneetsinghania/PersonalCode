package VVK;

public class ImplementStackUsingSinglyLinkedList {

	public static void main(String[] args) {
		ImplementStackUsingSinglyLinkedList obj=new ImplementStackUsingSinglyLinkedList();
		obj.push(11);
		obj.push(22);
		obj.push(33);
		obj.push(44);

		// print Stack elements
		obj.display();

		// pritn Top element of Stack
		System.out.printf("\nTop element is %d\n", obj.peek());

		// Delete top element of Stack
		obj.pop();
		obj.pop();

		// pritn Stack elements
		obj.display();

		// print Top element of Stack
		System.out.printf("\nTop element is %d\n", obj.peek());
	}
	
	static Node53 top=null;
	
	public static void push(int newnodeData)
	{
		Node53 newnode=new Node53(newnodeData);
		newnode.data=newnodeData;
		newnode.next=top;
		top=newnode;
	}
	
	public static int pop()
	{
		if(top==null)
		{
			System.out.println("Stack Underflow");
			System.exit(1);
		}
		
		Node53 cur=top;
		top=top.next;
		cur.next=null;
		return cur.data;
	}
	
	public static boolean isEmpty()
	{
		if(top==null)
			return true;
		
		return false;
	}
	
	public static int peek()
	{
		if(!isEmpty())
		{
			return top.data;
		}
		return -1;
	}
	
	public static void display()
	{
		if(top==null)
		{
			System.out.println("Empty stack");
			System.exit(1);
		}
		
		Node53 c=top;
		while(c!=null)
		{
			System.out.print(c.data+"->");
			c=c.next;
		}
	}
}


class Node53
{
	int data;
	Node53 next;
	
	Node53(int data)
	{
		this.data=data;
		this.next=null;
	}
}
