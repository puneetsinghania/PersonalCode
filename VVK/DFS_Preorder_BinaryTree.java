package VVK;

public class DFS_Preorder_BinaryTree {
	
	public static void main(String[] args) {
		
		int totalNodes=21;
		int[] nodeDatas= {50,16,14,10,15,5,40,35,32,36,37,45,90,78,75,82,81,79,85,87,100};
		
		int i=0;
		Node15 q;
		Node15 temp=new Node15(nodeDatas[i]);
		temp.data=nodeDatas[i];
		temp.left=null;
		temp.right=null;
		
		Node15 root=temp;
		
		for(i=1;i<totalNodes;i++)
		{
			temp=new Node15(nodeDatas[i]);
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
		
		//important method here
		preorder(root);
		
		
		
	}
	
	public static void preorder(Node15 root)
	{
		if(root!=null)
		{
			System.out.print(root.data+" ");
			if(root.left!=null)
				preorder(root.left);
			if(root.right!=null)
				preorder(root.right);
		}
	
	}

}

class Node15
{
	int data;
	Node15 left;
	Node15 right;
	
	Node15(int data)
	{
		this.data=data;
		this.left=null;
		this.right=null;
	}
}
