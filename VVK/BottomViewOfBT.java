package VVK;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Queue;
import java.util.TreeMap;

public class BottomViewOfBT {
		
	public static void main(String[] args) {
		
		Node29 root = new Node29(20); 
        root.left = new Node29(8); 
        root.right = new Node29(22); 
        root.left.left = new Node29(5); 
        root.left.right = new Node29(3); 
        root.right.left = new Node29(4); 
        root.right.right = new Node29(25); 
        root.left.right.left = new Node29(10); 
        root.left.right.right = new Node29(14);
		
		//important method here
		bottomView(root);
		
	}
	
	public static void bottomView(Node29 root)
	{
		Queue<Node29> q=new LinkedList<Node29>();
		Map<Integer,Integer> map=new TreeMap<>();
		int hd=0;
		root.hd=hd;
		q.offer(root);
		
		while(!q.isEmpty())
		{
			Node29 temp=q.poll();
			hd=temp.hd;
			map.put(hd,temp.data);
			
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
		Iterator<Entry<Integer,Integer>> itr=map.entrySet().iterator();
		while(itr.hasNext())
		{
			Map.Entry<Integer, Integer> keyco=itr.next();
			System.out.print(keyco.getValue()+" ");
		}
	}

}

class Node29
{
	int data;
	Node29 left;
	Node29 right;
	int hd;
	
	Node29(int data)
	{
		this.data=data;
		this.left=null;
		this.right=null;
		this.hd=Integer.MAX_VALUE;
	}
}
