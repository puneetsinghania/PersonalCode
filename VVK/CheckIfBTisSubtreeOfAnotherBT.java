package VVK;

public class CheckIfBTisSubtreeOfAnotherBT {
	
	public static void main(String[] args) {
		
		// TREE 1 
        /* Construct the following tree 
              26 
             /   \ 
            10     3 
           /    \     \ 
          4      6      3 
           \ 
            30  */
            
		Node49 root1 = new Node49(26); 
        root1.right = new Node49(3); 
        root1.right.right = new Node49(3); 
        root1.left = new Node49(10); 
        root1.left.left = new Node49(4); 
        root1.left.left.right = new Node49(30); 
        root1.left.right = new Node49(6); 
   
        // TREE 2 
        /* Construct the following tree 
           10 
         /    \ 
         4      6 
          \ 
          30  */
            
        Node49 root2 = new Node49(10); 
        root2.right = new Node49(6); 
        root2.left = new Node49(4); 
        root2.left.right = new Node49(30); 
		
		//important method here
		boolean isSubT=isSubtree(root1,root2);
		
		System.out.println(isSubT);
		
		
	}
	
	public static boolean isSubtree(Node49 M,Node49 s)
	{
		if(s==null)
			return true;
		if(M==null)
			return false;
		
		if(isIdentical(M,s)==true)
			return true;
		
		return (isSubtree(M.left,s)||isSubtree(M.right,s));
		
	}
	
	public static boolean isIdentical(Node49 M, Node49 s)
	{
		if(M==null && s==null)
			return true;
		if(M==null || s==null)
			return false;
		if(M.data==s.data && isIdentical(M.left,s.left) && isIdentical(M.right,s.right))
			return true;
		
		return false;
	}
	


}

class Node49
{
	int data;
	Node49 left;
	Node49 right;
	
	Node49(int data)
	{
		this.data=data;
		this.left=null;
		this.right=null;
	}
}
