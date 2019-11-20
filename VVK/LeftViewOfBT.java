package VVK;

public class LeftViewOfBT {
	
	static int maxLevel=Integer.MIN_VALUE;
		
	public static void main(String[] args) {
		
		Node31 root = new Node31(12); 
        root.left = new Node31(10); 
        root.right = new Node31(30); 
        root.right.left = new Node31(25); 
        root.right.right = new Node31(40);
		
		//important method here
        int levelOfRoot=1;
		leftView(root,levelOfRoot);
		
	}
	
	public static void leftView(Node31 root,int level)
	{
		if(root==null)
			return;
		
		if(level>maxLevel)
		{
			System.out.print(root.data+" ");
			maxLevel=level;
		}
		leftView(root.left,level+1);
		leftView(root.right,level+1);

	}

}

class Node31
{
	int data;
	Node31 left;
	Node31 right;
	
	Node31(int data)
	{
		this.data=data;
		this.left=null;
		this.right=null;
	}
}
