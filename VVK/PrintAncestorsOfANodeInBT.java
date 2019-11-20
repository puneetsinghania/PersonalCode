package VVK;

public class PrintAncestorsOfANodeInBT {
	
	public static void main(String[] args) {
            
		Node51 root = new Node51(1); 
        root.left = new Node51(2); 
        root.right = new Node51(3); 
        root.left.left = new Node51(4); 
        root.left.right = new Node51(5); 
        root.left.left.left = new Node51(7); 
   
		//important method here
		ancestors(root,7);
		
	}
	
	public static boolean ancestors(Node51 root,int target)
	{
		if(root==null)
			return false;
		if(root.data==target)
			return true;
		if(ancestors(root.left,target)==true||ancestors(root.right,target)==true)
		{
			System.out.print(root.data+" ");
			return true;
		}
		return false;
		
	}

}

class Node51
{
	int data;
	Node51 left;
	Node51 right;
	
	Node51(int data)
	{
		this.data=data;
		this.left=null;
		this.right=null;
	}
}
