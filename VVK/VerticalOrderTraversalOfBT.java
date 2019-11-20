package VVK;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Queue;
import java.util.TreeMap;

public class VerticalOrderTraversalOfBT {
		
	public static void main(String[] args) {
		
		Node34 root = new Node34(1); 
        root.left = new Node34(2); 
        root.right = new Node34(3); 
        root.left.left = new Node34(4); 
        root.left.right = new Node34(5); 
        root.right.left = new Node34(6); 
        root.right.right = new Node34(7); 
        root.right.left.right = new Node34(8); 
        root.right.right.right = new Node34(9); 
		
		//important method here  
		verticalOrderTraversal(root);
		
	}
	
	public static void verticalOrderTraversal(Node34 root)
	{
		Queue<Node34> q=new LinkedList<Node34>();
		Map<Integer,List<Integer>> map=new TreeMap<>();
		  
		  int hd=0;
	      root.hd=hd;
	      q.offer(root);
	      while(!q.isEmpty())
	      {
	    	  Node34 temp=q.poll();
	    	  hd=temp.hd;
	    	  
	    	  if(map.containsKey(hd))
	    	  {
	    		  List<Integer> list=map.get(hd);
	    		  list.add(temp.data);  
	    		  map.put(hd,list);
	    	  }
	    	  else
	    	  {
	    		  List<Integer> listnew=new ArrayList<>();
	    		  listnew.add(temp.data);
	    		  map.put(hd,listnew);
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
	      Iterator<Entry<Integer,List<Integer>>> itr=map.entrySet().iterator();
	      while(itr.hasNext())
	      {
	    	  Map.Entry<Integer,List<Integer>> keyco=itr.next();
	    	  System.out.println(keyco.getKey()+"->"+keyco.getValue());
	      }
	}

}

class Node34
{
	int data;
	Node34 left;
	Node34 right;
	int hd;
	
	Node34(int data)
	{
		this.data=data;
		this.left=null;
		this.right=null;
		this.hd=Integer.MAX_VALUE;
	}
}
