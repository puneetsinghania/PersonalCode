package VVK;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Queue;
import java.util.TreeMap;

public class TopViewOfBT {
		
	public static void main(String[] args) {
		
		Node33 root = new Node33(1); 
        root.left = new Node33(2); 
        root.right = new Node33(3); 
        root.left.right = new Node33(4); 
        root.left.right.right = new Node33(5);
        root.left.right.right.right = new Node33(6);
		//important method here
		topView(root);
		
	}
	
	public static void topView(Node33 root)
	{
		Queue<Node33> q=new LinkedList<Node33>();
		Map<Integer,Integer> map=new TreeMap<>();
		
		int hd=0;
		root.hd=hd;
		q.offer(root);
		while(!q.isEmpty())
		{
			Node33 temp=q.poll();
			hd=temp.hd;
			if(!map.containsKey(hd))
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
		
		Iterator<Entry<Integer,Integer>> itr=map.entrySet().iterator();
		while(itr.hasNext())
		{
			Map.Entry<Integer,Integer> keyco=itr.next();
			System.out.print(keyco.getValue()+" ");
		}
	}

}

class Node33
{
	int data;
	Node33 left;
	Node33 right;
	int hd;
	
	Node33(int data)
	{
		this.data=data;
		this.left=null;
		this.right=null;
		this.hd=Integer.MAX_VALUE;
	}
}
