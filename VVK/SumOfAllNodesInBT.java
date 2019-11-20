package VVK;

public class SumOfAllNodesInBT {
	
	public static void main(String[] args) {
		
		Node48 root = new Node48(26);
		root.left = new Node48(10);
		root.right = new Node48(3);
		root.left.left = new Node48(4);
		root.left.right = new Node48(6);
		root.right.right = new Node48(3); 
		
		//important method here
		int sum=sum(root);
		
		System.out.println(sum);
		
		
	}
	
	public static int sum(Node48 root)
	{
		if(root==null)
			return 0;
		
		return root.data+sum(root.left)+sum(root.right);
	}
	


}

class Node48
{
	int data;
	Node48 left;
	Node48 right;
	
	Node48(int data)
	{
		this.data=data;
		this.left=null;
		this.right=null;
	}
}
