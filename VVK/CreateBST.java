package VVK;

public class CreateBST {
	
	public static void main(String[] args) {
		
		int totalNodes=5;
		int[] nodeDatas= {5,7,3,2,9,1,8};
		
		int i=0;
		Node5 q;
		Node5 temp=new Node5(nodeDatas[i]);
		temp.data=nodeDatas[i];
		temp.left=null;
		temp.right=null;
		
		Node5 root=temp;
		
		for(i=1;i<totalNodes;i++)
		{
			temp=new Node5(nodeDatas[i]);
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
		
		
		
	}

}

class Node5
{
	int data;
	Node5 left;
	Node5 right;
	
	Node5(int data)
	{
		this.data=data;
		this.left=null;
		this.right=null;
	}
}
