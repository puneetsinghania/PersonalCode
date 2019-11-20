package VVK;

public class ConvertBTintoItsMirrorTree {
		
	public static void main(String[] args) {
		
		Node64 root = new Node64(1); 
        root.left = new Node64(2); 
        root.right = new Node64(3); 
        root.left.left = new Node64(4); 
        root.left.right = new Node64(5); 
        root.right.left = new Node64(6); 
        root.right.right = new Node64(7); 
        root.right.left.right = new Node64(8); 
        root.right.right.right = new Node64(9); 
		
		//important method here  
		mirror(root);
		
	}
	
	public static void mirror(Node64 root)
	{
		if(root==null)
			return;
		
		mirror(root.left);
		mirror(root.right);
		Node64 temp=root.left;
		root.left=root.right;
		root.right=temp;
	}

}

class Node64
{
	int data;
	Node64 left;
	Node64 right;
	
	Node64(int data)
	{
		this.data=data;
		this.left=null;
		this.right=null;
	}
}
