package KMC;

import java.util.LinkedList;
import java.util.Queue;

public class SumOfAllNodesInBTWithoutRecursion {
	
	public static void main(String[] args) {
		
		Node110 root = new Node110(26);
		root.left = new Node110(10);
		root.right = new Node110(3);
		root.left.left = new Node110(4);
		root.left.right = new Node110(6);
		root.right.right = new Node110(3); 
		
		//important method here
		int sum=sum(root);
		
		System.out.println(sum);
		
		
	}
	
	public static int sum(Node110 root)
	{
		int sum=0;

		Queue<Node110> q= new LinkedList<>();
		q.offer(root);

		while(!q.isEmpty())
		{
			Node110 temp= q.poll();
			sum=sum+temp.data;

			if(temp.left!=null)
				q.offer(temp.left);
			if(temp.right!=null)
				q.offer(temp.right);
		}

		return sum;
	}
	


}

class Node110
{
	int data;
	Node110 left;
	Node110 right;
	
	Node110(int data)
	{
		this.data=data;
		this.left=null;
		this.right=null;
	}
}
