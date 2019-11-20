package VVK;

import java.util.LinkedList;
import java.util.Queue;

public class PrintDiagonalElementsOfBT {
		
	public static void main(String[] args) {
		
		Node37 root = new Node37(8);
		root.left = new Node37(3);
		root.right = new Node37(10);
		root.left.left = new Node37(1);
		root.left.right = new Node37(6);
		root.right.right = new Node37(14);
		root.right.right.left = new Node37(13);
		root.left.right.left = new Node37(4);
		root.left.right.right = new Node37(7);
		
		//important method here  
		diagonalTraversal(root);
		
	}
	
	public static void diagonalTraversal(Node37 root)
	{
		Queue<Node37> q=new LinkedList<Node37>(); 
		q.offer(root);
		q.offer(null);
		while(!q.isEmpty())
		{
			Node37 temp=q.poll();
			
			if(temp==null)
			{
				System.out.println();
				q.offer(null);
				temp=q.poll();
				if(temp==null)
				{
					break;
				}
			}
			while(temp!=null)
			{
				System.out.print(temp.data+" ");
				if(temp.left!=null)
					q.offer(temp.left);
				
				temp=temp.right;
			}
		}
	}

}

class Node37
{
	int data;
	Node37 left;
	Node37 right;
	
	Node37(int data)
	{
		this.data=data;
		this.left=null;
		this.right=null;
	}
}
