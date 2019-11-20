package VVK;

public class CheckIfGivenBTisSumtree {
	
	public static void main(String[] args) {
		
		Node47 root = new Node47(26);
		root.left = new Node47(10);
		root.right = new Node47(3);
		root.left.left = new Node47(4);
		root.left.right = new Node47(6);
		root.right.right = new Node47(3); 
		
		//important method here
		boolean flag=isSumtree(root);
		
		System.out.println(flag);
		
		
	}
	
	public static boolean isSumtree(Node47 root)
	{
		if(root==null)
			return true;
		if(root.left==null && root.right==null)
			return true;
		
		int lsum=sum(root.left);
		int rsum=sum(root.right);
		
		if((root.data==(lsum+rsum)) && isSumtree(root.left)==true && isSumtree(root.right)==true)
			return true;
		
		return false;
	}
	
	public static int sum(Node47 node)
	{
		if(node==null)
			return 0;
		
		return node.data+sum(node.left)+sum(node.right); 
	}

}

class Node47
{
	int data;
	Node47 left;
	Node47 right;
	
	Node47(int data)
	{
		this.data=data;
		this.left=null;
		this.right=null;
	}
}
