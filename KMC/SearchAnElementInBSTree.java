package KMC;

public class SearchAnElementInBSTree {
	
	public static void main(String[] args) {

		Node112 root = new Node112(4);
		root.left = new Node112(2);
		root.right = new Node112(7);
		root.left.left = new Node112(1);
		root.left.right = new Node112(3);

		//important method here
		boolean isPresent = searchBST(root,2);

		System.out.println(isPresent);
	}

	public static boolean searchBST(Node112 root,int value) {

		if(root==null)
			return false;

		if(value==root.data)
			return true;

		if(value<root.data)
			return searchBST(root.left,value);

		if(value>root.data)
			return searchBST(root.right,value);

		return false;

	}

}

class Node112
{
	int data;
	Node112 left;
	Node112 right;
	
	Node112(int data)
	{
		this.data=data;
		this.left=null;
		this.right=null;
	}
}
