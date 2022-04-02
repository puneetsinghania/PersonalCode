package KMC;

import java.util.LinkedList;
import java.util.Queue;

public class LevelHavingMaxSumInBTree {
	
	public static void main(String[] args) {

		Node109 root = new Node109(2);
		root.left = new Node109(7);
		root.left.left = new Node109(11);
		root.right = new Node109(5);
		root.left.right = new Node109(6);
		root.right.right = new Node109(9);
		root.right.right.left = new Node109(4);

		//important method here
		int level = findLevelWithMaxSum(root);

		System.out.println(level);
	}

	public static int findLevelWithMaxSum(Node109 root) {

		int max= Integer.MIN_VALUE;
		int sum=0;
		int level=0;
		int resLevel=0;

		Queue<Node109> q= new LinkedList<>();
		q.offer(root);
		q.offer(null);

		while(!q.isEmpty())
		{
			Node109 temp= q.poll();

			if(temp!=null)
			{
				sum= sum+temp.data;

				if(temp.left!=null)
					q.offer(temp.left);
				if(temp.right!=null)
					q.offer(temp.right);
			}
			else
			{
				q.offer(null);
				level++;
				if(sum>max)
				{
					max=sum;
					resLevel=level;
				}
				sum=0;

				if(q.peek()== null)
					break;
			}
		}

		return resLevel;
	}
	
}

class Node109
{
	int data;
	Node109 left;
	Node109 right;
	
	Node109(int data)
	{
		this.data=data;
		this.left=null;
		this.right=null;
	}
}
