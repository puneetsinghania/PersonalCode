package VVK;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversalOfBT_LineByLine {
		
	public static void main(String[] args) {
		
		Node36 root = new Node36(1); 
		root.left = new Node36(2);
		root.right = new Node36(3);
		root.left.left = new Node36(4);
		root.left.right = new Node36(5);
		
		//important method here  
		levelOrderT_lineByline(root);
		
	}
	
	public static void levelOrderT_lineByline(Node36 root)
	{
		Queue<Node36> q=new LinkedList<Node36>();
		q.offer(root);
		q.offer(null);
		while(!q.isEmpty())
		{
			Node36 temp=q.poll();
			
			if(temp!=null) 
			{
				System.out.print(temp.data+" ");
				
				if(temp.left!=null)
					q.offer(temp.left);
				if(temp.right!=null)
					q.offer(temp.right);
				
			}
			else if(temp==null)
			{
				System.out.println();
				q.offer(null);
				
				temp=q.peek();
				if(temp==null)
					break;
			}
		}
	}

}

class Node36
{
	int data;
	Node36 left;
	Node36 right;
	
	Node36(int data)
	{
		this.data=data;
		this.left=null;
		this.right=null;
	}
}
