package VVK;

public class HeightOfBT {
	
	public static void main(String[] args) {
		
		int totalNodes=21;
		int[] nodeDatas= {50,16,14,10,15,5,40,35,32,36,37,45,90,78,75,82,81,79,85,87,100};
		
		int i=0;
		Node21 q;
		Node21 temp=new Node21(nodeDatas[i]);
		temp.data=nodeDatas[i];
		temp.left=null;
		temp.right=null;
		
		Node21 root=temp;
		
		for(i=1;i<totalNodes;i++)
		{
			temp=new Node21(nodeDatas[i]);
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
		int heightBT=height(root);
		
		System.out.println(heightBT);
		
	}
	
	public static int height(Node21 root)
	{
	
		if(root==null)
			return 0;
		
		return 1+Math.max(height(root.left),height(root.right));
	}

}

class Node21
{
	int data;
	Node21 left;
	Node21 right;
	
	Node21(int data)
	{
		this.data=data;
		this.left=null;
		this.right=null;
	}
}
