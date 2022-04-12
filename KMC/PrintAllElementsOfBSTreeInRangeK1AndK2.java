package KMC;

public class PrintAllElementsOfBSTreeInRangeK1AndK2 {
	
	public static void main(String[] args) {

		Node124 root = new Node124(4);
		root.left = new Node124(2);
		root.right = new Node124(7);
		root.left.left = new Node124(1);
		root.left.right = new Node124(3);

		//important method here
		printAll(root,1,5);
	}

	public static void printAll(Node124 root,int k1,int k2) {

		if(root==null)
			return;

		if(root.data<k1 && root.data<k2)
			printAll(root.right,k1,k2);
		else if(root.data>k1 && root.data>k2)
			printAll(root.left,k1,k2);
		else
		{
			printAll(root.left,k1,k2);
			System.out.print(root.data+" ");
			printAll(root.right,k1,k2);
		}


	}

}

class Node124
{
	int data;
	Node124 left;
	Node124 right;
	
	Node124(int data)
	{
		this.data=data;
		this.left=null;
		this.right=null;
	}
}
