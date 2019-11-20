package VVK;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class PrintRootToLeafPathsInBT {
	
	static Stack<Integer> stack=new Stack<>();
	
	public static void main(String[] args) {
		
		Node42 root=new Node42(10);
        root.left = new Node42(8); 
        root.right = new Node42(2); 
        root.left.left = new Node42(3); 
        root.left.right = new Node42(5); 
        root.right.left = new Node42(2); 
		
		//important method here
		printRootToLeafPaths(root);
		
	}
	
	public static void printRootToLeafPaths(Node42 root)
	{
		if(root==null)
			return;
		
		stack.push(root.data);
		
		printRootToLeafPaths(root.left);	
		
		if(root.left==null && root.right==null)
		{
			System.out.println(Arrays.toString(stack.toArray()));
		}
		
		printRootToLeafPaths(root.right);
		
		stack.pop();
	}

}

class Node42
{
	int data;
	Node42 left;
	Node42 right;
	
	Node42(int data)
	{
		this.data=data;
		this.left=null;
		this.right=null;
	}
}
