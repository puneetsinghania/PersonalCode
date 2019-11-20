package VVK;

public class PrintNodesAtDistanceKfromRoot {
	
	public static void main(String[] args) {
            
		Node52 root = new Node52(1);
		root.left = new Node52(2);
		root.right = new Node52(3);
		root.left.left = new Node52(4);
		root.left.right = new Node52(5);
		root.right.left = new Node52(8);
   
		//important method here
		distanceKnodes(root,2);
		
	}
	
	public static void distanceKnodes(Node52 root,int K)
	{
		if(root==null)
			return;
		
		if(K==0)
			System.out.print(root.data+" ");
		else
		{
			distanceKnodes(root.left,K-1);
			distanceKnodes(root.right,K-1);
		}
		
	}

}

class Node52
{
	int data;
	Node52 left;
	Node52 right;
	
	Node52(int data)
	{
		this.data=data;
		this.left=null;
		this.right=null;
	}
}
