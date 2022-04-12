package KMC;

public class CeilInBSTree {
	
	public static void main(String[] args) {

		Node123 root = new Node123(4);
		root.left = new Node123(2);
		root.right = new Node123(7);
		root.left.left = new Node123(1);
		root.left.right = new Node123(3);

		//important method here
		int ceil = findCeil(root,5);

		System.out.println(ceil);
	}

	public static int findCeil(Node123 root,int key) {

		int ceil=-1;

		while(root!=null)
		{
			if(key==root.data)
			{
				ceil=root.data;
				return ceil;
			}
			else if(key>root.data)
				root=root.right;
			else
			{
				ceil=root.data;
				root=root.left;
			}
		}
		return ceil;
	}

}

class Node123
{
	int data;
	Node123 left;
	Node123 right;
	
	Node123(int data)
	{
		this.data=data;
		this.left=null;
		this.right=null;
	}
}
