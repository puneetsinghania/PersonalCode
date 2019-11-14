package VVK;

public class InorderPredecessorInBST {
	
	public static void main(String[] args) {
		
		int totalNodes=21;
		int[] nodeDatas= {50,16,14,10,15,5,40,35,32,36,37,45,90,78,75,82,81,79,85,87,100};
		
		int i=0;
		Node13 q;
		Node13 temp=new Node13(nodeDatas[i]);
		temp.data=nodeDatas[i];
		temp.left=null;
		temp.right=null;
		
		Node13 root=temp;
		
		for(i=1;i<totalNodes;i++)
		{
			temp=new Node13(nodeDatas[i]);
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
		inorderPredecessor(root);
		
		
		
	}
	
	public static void inorderPredecessor(Node13 root)
	{
		
		//case1: when we have left of the target element whose inorder predecessor has to be found
		Node13 cur=root;
		if(cur.left!=null)
		{
			cur=cur.left;
			while(cur.right!=null)
			{
				cur=cur.right;
			}
			System.out.println(cur.data);
		}
		
		//case2: when we don't have left of the target element whose inorder predecessor has to be found
		cur=root.left.right.left.right.right;
		Node13 s=root;
		if(cur.left==null) {
			System.out.println("Find inorder predecessor of=>"+cur.data);
			int key=cur.data;
			Integer store=null;
			while(key!=s.data)
			{
				if(key>s.data)
				{
					store=s.data;
					s=s.right;
				}
				else 
				{
					s=s.left;
				}
			}
			System.out.println("Inorder predecessor is=>"+store);
		}
	}

}

class Node13
{
	int data;
	Node13 left;
	Node13 right;
	
	Node13(int data)
	{
		this.data=data;
		this.left=null;
		this.right=null;
	}
}
