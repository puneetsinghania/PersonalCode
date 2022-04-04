package KMC;

import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

public class VerticalSumOfBT {
		
	public static void main(String[] args) {
		
		Node111 root = new Node111(1); 
        root.left = new Node111(2); 
        root.right = new Node111(3); 
        root.left.left = new Node111(4); 
        root.left.right = new Node111(5); 
        root.right.left = new Node111(6); 
        root.right.right = new Node111(7);
		
		//important method here  
		verticalSum(root);
		
	}
	
	public static void verticalSum(Node111 root)
	{
		Map<Integer,Integer> map= new TreeMap<>();
		int hd=0;
		root.hd=hd;

		Queue<Node111> q= new LinkedList<>();
		q.offer(root);
		while(!q.isEmpty())
		{
			Node111 temp= q.poll();
			hd= temp.hd;

			if(map.containsKey(hd))
			{
				map.put(hd,map.get(hd)+temp.data);
			}
			else
			{
				map.put(hd,temp.data);
			}

			if(temp.left!=null)
			{
				temp.left.hd=hd-1;
				q.offer(temp.left);
			}
			if(temp.right!=null)
			{
				temp.right.hd=hd+1;
				q.offer(temp.right);
			}
		}

		//print the TreeMap values
		for(Integer key:map.keySet())
		{
			System.out.print(map.get(key)+" ");
		}

	}

}

class Node111
{
	int data;
	Node111 left;
	Node111 right;
	int hd;
	
	Node111(int data)
	{
		this.data=data;
		this.left=null;
		this.right=null;
		this.hd=Integer.MAX_VALUE;
	}
}
