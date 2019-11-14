package VVK;

public class BoundaryTraversalOfBinaryTree {
	
	public static void main(String[] args) {
		
		int totalNodes=7;
		int[] nodeDatas= {5,7,3,2,9,1,8};
		
		int i=0;
		Node7 q;
		Node7 temp=new Node7(nodeDatas[i]);
		temp.data=nodeDatas[i];
		temp.left=null;
		temp.right=null;
		
		Node7 root=temp;
		
		for(i=1;i<totalNodes;i++)
		{
			temp=new Node7(nodeDatas[i]);
			temp.data=nodeDatas[i];
			temp.left=null;
			temp.right=null;
			
			q=root;
			
			while(true)
			{
				if(temp.data<q.data)
				{
					if(q.left==null)
					{
						q.left=temp;
						break;
					}
					else
					{
						q=q.left;
					}
				}
				else
				{
					if(q.right==null)
					{
						q.right=temp;
						break;
					}
					else
					{
						q=q.right;
					}
				}
					
			}
			
		}
		
	//important methods starts here
		System.out.println("======LEFT BOUNDARY======");
		leftBoundary(root);
		
		System.out.println();
		
		System.out.println("======RIGHT BOUNDARY======");
		rightBoundary(root.right);
		
		System.out.println();
		
		System.out.println("======LEAF BOUNDARY======");
		leafBoundary(root);
		
		
	//	
	}
	public static void leftBoundary(Node7 root)
	{
		if(root!=null)
		{
			if(root.left!=null)
			{
				System.out.print(root.data+" ");
				leftBoundary(root.left);
			}
			else if(root.right!=null)
			{
				System.out.print(root.data+" ");
				leftBoundary(root.right);
			}
		}
	}
	
	public static void rightBoundary(Node7 root)
	{
		if(root!=null)
		{
			if(root.right!=null)
			{
				System.out.print(root.data+" ");
				rightBoundary(root.right);
			}
			else if(root.left!=null)
			{
				System.out.print(root.data+" ");
				rightBoundary(root.left);
			}
		}
	}
	
	public static void leafBoundary(Node7 root)
	{
		if(root!=null)
		{
			leafBoundary(root.left);
			
			if(root.left==null && root.right==null)
				System.out.print(root.data+" ");
			
			leafBoundary(root.right);
		}
	}

}

class Node7
{
	int data;
	Node7 left;
	Node7 right;
	
	Node7(int data)
	{
		this.data=data;
		this.left=null;
		this.right=null;
	}
}
