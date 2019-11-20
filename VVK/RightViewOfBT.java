package VVK;

public class RightViewOfBT {
	
	static int maxLevel=Integer.MIN_VALUE;
		
	public static void main(String[] args) {
		
		Node32 root = new Node32(1); 
		root.left = new Node32(2);
		root.right = new Node32(3);
		root.left.left = new Node32(4);
		root.left.right = new Node32(5);
		root.right.left = new Node32(6);
		root.right.right = new Node32(7);
		root.right.left.right = new Node32(8);
		
		//important method here
        int levelOfRoot=1;
		rightView(root,levelOfRoot);
		
	}
	
	public static void rightView(Node32 root,int level)
	{
		if(root==null)
			return;
		
		if(level>maxLevel)
		{
			System.out.print(root.data+" ");
			maxLevel=level;
		}
		
		rightView(root.right,level+1);
		rightView(root.left,level+1);
		
	}

}

class Node32
{
	int data;
	Node32 left;
	Node32 right;
	
	Node32(int data)
	{
		this.data=data;
		this.left=null;
		this.right=null;
	}
}
