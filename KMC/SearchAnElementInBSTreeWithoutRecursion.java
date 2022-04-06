package KMC;

public class SearchAnElementInBSTreeWithoutRecursion {
	
	public static void main(String[] args) {

		Node114 root = new Node114(4);
		root.left = new Node114(2);
		root.right = new Node114(7);
		root.left.left = new Node114(1);
		root.left.right = new Node114(3);

		//important method here
		boolean isPresent = searchBST(root,2);

		System.out.println(isPresent);
	}

	public static boolean searchBST(Node114 root,int value) {

		if(root==null)
			return false;

		while(root!=null)
		{
			if(value == root.data)
				return true;
			else if(value > root.data)
				root=root.right;
			else if(value < root.data)
				root=root.left;
		}
		return false;
	}

}

class Node114
{
	int data;
	Node114 left;
	Node114 right;
	
	Node114(int data)
	{
		this.data=data;
		this.left=null;
		this.right=null;
	}
}
