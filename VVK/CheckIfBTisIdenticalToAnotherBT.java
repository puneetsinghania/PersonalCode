package VVK;

public class CheckIfBTisIdenticalToAnotherBT {
	
	public static void main(String[] args) {
		
		// TREE 1 
        /* Construct the following tree 
         	10 
          /    \ 
         4      6 
          \ 
          30 */
            
		Node50 root1 = new Node50(10);
		root1.right = new Node50(6);
		root1.left = new Node50(4);
		root1.left.right = new Node50(30);
   
        // TREE 2 
        /* Construct the following tree 
           10 
         /    \ 
         4      6 
          \ 
          30  */
            
        Node50 root2 = new Node50(10); 
        root2.right = new Node50(6); 
        root2.left = new Node50(4); 
        root2.left.right = new Node50(30); 
		
		//important method here
		boolean isIdent=isIdentical(root1,root2);
		
		System.out.println(isIdent);
	}
	
	public static boolean isIdentical(Node50 root1,Node50 root2)
	{
		if(root1==null && root2==null)
			return true;
		if(root1==null || root2==null)
			return false;
		if(root1.data==root2.data && isIdentical(root1.left,root2.left) && isIdentical(root1.right,root2.right))
			return true;
		
		return false;
	}

}

class Node50
{
	int data;
	Node50 left;
	Node50 right;
	
	Node50(int data)
	{
		this.data=data;
		this.left=null;
		this.right=null;
	}
}
