package KMC;

public class SearchingAnElementInBTree {
	
	public static void main(String[] args) {

		Node90 root = new Node90(2);
		root.left = new Node90(7);
		root.right = new Node90(5);
		root.left.right = new Node90(6);
		root.left.right.left = new Node90(1);
		root.left.right.right = new Node90(11);
		root.right.right = new Node90(9);
		root.right.right.left = new Node90(4);
		
		//important method here
		boolean res = search(root,5);
		
		System.out.println(res);
	}

	public static boolean search(Node90 root,int key) {

		if(root==null)
			return false;

		if(root.data==key)
			return true;

		return (search(root.left,key) || search(root.right,key));
	}
	
	
}

class Node90
{
	int data;
	Node90 left;
	Node90 right;
	
	Node90(int data)
	{
		this.data=data;
		this.left=null;
		this.right=null;
	}
}
