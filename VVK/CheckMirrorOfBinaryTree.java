package VVK;

public class CheckMirrorOfBinaryTree {
		
	public static void main(String[] args) {
		
		Node66 root1 = new Node66(1);
		root1.left = new Node66(2);
		root1.right = new Node66(3);
		root1.left.left = new Node66(4);
		root1.left.right = new Node66(5);

		Node66 root2 = new Node66(1);
		root2.left = new Node66(3);
		root2.right = new Node66(2);
		root2.right.left = new Node66(5);
		root2.right.right = new Node66(4);
		
		//important method here  
        boolean isMirror=checkMirror(root1,root2);
        
        System.out.println(isMirror);
		
	}
	
	public static boolean checkMirror(Node66 root1,Node66 root2)
	{
		if(root1==null && root2==null)
			return true;
		if(root1==null || root2==null)
			return false;
		if(root1.data!=root2.data)
			return false;
		
		return (checkMirror(root1.left,root2.right) && checkMirror(root1.right,root2.left));
	}

}

class Node66
{
	int data;
	Node66 left;
	Node66 right;
	
	Node66(int data)
	{
		this.data=data;
		this.left=null;
		this.right=null;
	}
}
