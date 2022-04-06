package KMC;

public class FindingMinElementInBSTreeWithoutRecursion {
	
	public static void main(String[] args) {

		Node115 root = new Node115(4);
		root.left = new Node115(2);
		root.right = new Node115(7);
		root.left.left = new Node115(1);
		root.left.right = new Node115(3);

		//important method here
		int minElement = findMin(root);

		System.out.println(minElement);
	}

	public static int findMin(Node115 root) {

		while(root.left!=null)
		{
			root=root.left;
		}

		return root.data;

	}

}

class Node115
{
	int data;
	Node115 left;
	Node115 right;
	
	Node115(int data)
	{
		this.data=data;
		this.left=null;
		this.right=null;
	}
}
