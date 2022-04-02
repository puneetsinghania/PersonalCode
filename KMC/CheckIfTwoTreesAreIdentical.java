package KMC;

public class CheckIfTwoTreesAreIdentical {
	
	public static void main(String[] args) {

		Node105 root1 = new Node105(1);
		root1.left = new Node105(2);
		root1.right = new Node105(3);
		root1.left.left = new Node105(4);
		root1.left.right = new Node105(5);

		Node105 root2 = new Node105(1);
		root2.left = new Node105(2);
		root2.right = new Node105(3);
		root2.left.left = new Node105(4);
		root2.left.right = new Node105(5);

		boolean isSameTree= isSameTree(root1, root2);

		System.out.println(isSameTree);

	}

	public static boolean isSameTree(Node105 root1,Node105 root2) {

		if(root1==null && root2==null)
			return true;

		if(root1==null || root2==null)
			return false;

		if(root1!=null && root2!=null)
			return (root1.data==root2.data && isSameTree(root1.left,root2.left) && isSameTree(root1.right,root2.right));

		return false;
	}
	
}

class Node105
{
	int data;
	Node105 left;
	Node105 right;
	
	Node105(int data)
	{
		this.data=data;
		this.left=null;
		this.right=null;
	}
}
