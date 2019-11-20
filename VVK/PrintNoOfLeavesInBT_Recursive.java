package VVK;

import java.util.LinkedList;
import java.util.Queue;

public class PrintNoOfLeavesInBT_Recursive {
		
	static int count=0;
	public static void main(String[] args) {
		
		Node44 root=new Node44(10);
        root.left = new Node44(8); 
        root.right = new Node44(2); 
        root.left.left = new Node44(3); 
        root.left.right = new Node44(5); 
        root.right.left = new Node44(2); 
		
		//important method here
		int leaves=printNumberOfLeaves(root);
		
		System.out.println(leaves);
		
	}
	
	public static int printNumberOfLeaves(Node44 root)
	{
		if(root!=null)
		{
			if(root.left==null && root.right==null)
				count++;
			else
			{
				if(root.left!=null)
					printNumberOfLeaves(root.left);
				if(root.right!=null)
					printNumberOfLeaves(root.right);
			}
		}
		return count;
	}

}

class Node44
{
	int data;
	Node44 left;
	Node44 right;
	
	Node44(int data)
	{
		this.data=data;
		this.left=null;
		this.right=null;
	}
}
