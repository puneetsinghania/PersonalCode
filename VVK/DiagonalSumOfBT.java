package VVK;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Queue;
import java.util.TreeMap;

public class DiagonalSumOfBT {
		
	public static void main(String[] args) {
		
		Node30 root = new Node30(20); 
        root.left = new Node30(8); 
        root.right = new Node30(22); 
        root.left.left = new Node30(5); 
        root.left.right = new Node30(3); 
        root.right.left = new Node30(4); 
        root.right.right = new Node30(25); 
        root.left.right.left = new Node30(10); 
        root.left.right.right = new Node30(14);
		
		//important method here
		diagonalSum(root);
		
	}
	
	public static void diagonalSum(Node30 root)
	{
		Queue<Node30> q=new LinkedList<Node30>();
		q.offer(root);
		q.offer(null);
		int sum=0;
		while(!q.isEmpty())
		{
			Node30 temp=q.poll();
			if(temp==null)
			{
				q.offer(null);
				temp=q.poll();
				if(temp==null)
					break;
						
			}
			sum=0;
			while(temp!=null)
			{
				sum=sum+temp.data;
				if(temp.left!=null)
					q.offer(temp.left);
				temp=temp.right;
			}
			System.out.print(sum+" ");
			
		}
	}

}

class Node30
{
	int data;
	Node30 left;
	Node30 right;
	
	Node30(int data)
	{
		this.data=data;
		this.left=null;
		this.right=null;
	}
}
