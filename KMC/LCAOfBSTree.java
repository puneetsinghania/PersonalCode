package KMC;

public class LCAOfBSTree {
	
	public static void main(String[] args) {

		Node119 root = new Node119(20);
		root.left = new Node119(8);
		root.right = new Node119(22);
		root.left.left = new Node119(4);
		root.left.right = new Node119(12);
		root.left.right.left = new Node119(10);
		root.left.right.right = new Node119(14);

		//important method here
		Node119 ele = lowestCommonAncestor(root, new Node119(10), new Node119(22));

		System.out.println(ele.data);
	}

	public static Node119 lowestCommonAncestor(Node119 root, Node119 p, Node119 q) {

		if(root==null)
			return null;

		if(root==p || root==q)
			return root;

		if(p.data<root.data && q.data<root.data)
			return lowestCommonAncestor(root.left,p,q);

		if(p.data>root.data && q.data>root.data)
			return lowestCommonAncestor(root.right,p,q);

		return root;

	}

}

class Node119
{
	int data;
	Node119 left;
	Node119 right;
	
	Node119(int data)
	{
		this.data=data;
		this.left=null;
		this.right=null;
	}
}
