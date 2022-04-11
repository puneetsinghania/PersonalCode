package KMC;

public class ConvertBSTtoCircularDLL {

	static Node121 head=null;
	static Node121 pre=null;
	
	public static void main(String[] args) {

		Node121 root = new Node121(20);
		root.left = new Node121(8);
		root.right = new Node121(22);
		root.left.left = new Node121(4);
		root.left.right = new Node121(12);
		root.left.right.left = new Node121(10);
		root.left.right.right = new Node121(14);

		//important method here
		Node121 modified = convertToDLL(root);

		System.out.println(modified.left.data);
		System.out.println(pre.data);
		System.out.println(pre.right.data);
		System.out.println(modified.data);

	}

	public static Node121 convertToDLL(Node121 root) {

		inorder(root);

		if(head==null)
			return null;

		head.left=pre;
		pre.right=head;

		return head;


	}

	public static void inorder(Node121 root) {

		if(root==null)
			return;

		inorder(root.left);

		if(head==null)
			head=root;
		else
		{
			root.left=pre;
			pre.right=root;
		}
		pre=root;

		inorder(root.right);
	}

}

class Node121
{
	int data;
	Node121 left;
	Node121 right;
	
	Node121(int data)
	{
		this.data=data;
		this.left=null;
		this.right=null;
	}
}
