package VVK;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversalOfBT_Whole {
		
	public static void main(String[] args) {
		
		Node35 root = new Node35(1); 
		root.left = new Node35(2);
		root.right = new Node35(3);
		root.left.left = new Node35(4);
		root.left.right = new Node35(5);
		
		//important method here  
		levelOrderT_whole(root);
		
	}
	
	public static void levelOrderT_whole(Node35 root)
	{
		Queue<Node35> q=new LinkedList<Node35>();
		q.offer(root);
		while(!q.isEmpty())
		{
			Node35 temp=q.poll();
			System.out.print(temp.data+" ");
			
			if(temp.left!=null)
				q.offer(temp.left);
			if(temp.right!=null)
				q.offer(temp.right);
			
		}
	}

}

class Node35
{
	int data;
	Node35 left;
	Node35 right;
	
	Node35(int data)
	{
		this.data=data;
		this.left=null;
		this.right=null;
	}
}
