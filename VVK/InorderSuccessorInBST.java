package VVK;

public class InorderSuccessorInBST {
	
	public static void main(String[] args) {
		
		int totalNodes=21;
		int[] nodeDatas= {50,16,14,10,15,5,40,35,32,36,37,45,90,78,75,82,81,79,85,87,100};
		
		int i=0;
		Node14 q;
		Node14 temp=new Node14(nodeDatas[i]);
		temp.data=nodeDatas[i];
		temp.left=null;
		temp.right=null;
		
		Node14 root=temp;
		
		for(i=1;i<totalNodes;i++)
		{
			temp=new Node14(nodeDatas[i]);
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
		inorderSuccessor(root);
		
		
		
	}
	
	public static void inorderSuccessor(Node14 root)
	{
		
		//case1: when we have right of the target element whose inorder Successor has to be found
		Node14 cur=root;
		if(cur.right!=null)
		{
			cur=cur.right;
			while(cur.left!=null)
			{
				cur=cur.left;
			}
			System.out.println(cur.data);
		}
		
		//case2: when we don't have right of the target element whose inorder successor has to be found
		cur=root.left.right.left.right.right;
		Node14 s=root;
		if(cur.right==null) {
			System.out.println("Find inorder successor of=>"+cur.data);
			int key=cur.data;
			Integer store=null;
			while(key!=s.data)
			{
				if(key<s.data)
				{
					store=s.data;
					s=s.left;
				}
				else 
				{
					s=s.right;
				}
			}
			System.out.println("Inorder successor is=>"+store);
		}
	}

}

class Node14
{
	int data;
	Node14 left;
	Node14 right;
	
	Node14(int data)
	{
		this.data=data;
		this.left=null;
		this.right=null;
	}
}
