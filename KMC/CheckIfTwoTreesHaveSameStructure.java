package KMC;

public class CheckIfTwoTreesHaveSameStructure {
	
	public static void main(String[] args) {

		Node106 root1 = new Node106(1);
		root1.left = new Node106(2);
		root1.right = new Node106(3);
		root1.left.left = new Node106(4);
		root1.left.right = new Node106(5);

		Node106 root2 = new Node106(1);
		root2.left = new Node106(2);
		root2.right = new Node106(3);
		root2.left.left = new Node106(4);
		root2.left.right = new Node106(5);

		boolean isSameTree= isSameTree(root1, root2);

		System.out.println(isSameTree);

	}

	public static boolean isSameTree(Node106 root1,Node106 root2) {

		if(root1==null && root2==null)
			return true;

		if(root1==null || root2==null)
			return false;

		if(root1!=null && root2!=null)
			return (isSameTree(root1.left,root2.left) && isSameTree(root1.right,root2.right));

		return false;
	}
	
}

class Node106
{
	int data;
	Node106 left;
	Node106 right;
	
	Node106(int data)
	{
		this.data=data;
		this.left=null;
		this.right=null;
	}
}
