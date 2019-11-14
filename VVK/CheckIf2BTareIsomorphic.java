package VVK;

public class CheckIf2BTareIsomorphic {
	
	public static void main(String[] args) {
		
		int totalNodes=21;
		int[] nodeDatas= {50,16,14,10,15,5,40,35,32,36,37,45,90,78,75,82,81,79,85,87,100};
		
		int i=0;
		Node20 q;
		Node20 temp=new Node20(nodeDatas[i]);
		temp.data=nodeDatas[i];
		temp.left=null;
		temp.right=null;
		
		Node20 root=temp;
		
		for(i=1;i<totalNodes;i++)
		{
			temp=new Node20(nodeDatas[i]);
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
		boolean res=checkIsomorphic(root,root);
		
		System.out.println(res);
	}
	
	public static boolean checkIsomorphic(Node20 root1,Node20 root2)
	{
		if(root1==null && root2==null)
			return true;
		else if(root1==null||root2==null)
			return false;
		else if(root1.data!=root2.data)
			return false;
		else if(checkIsomorphic(root1.left,root2.left) && checkIsomorphic(root1.right,root2.right)||
				checkIsomorphic(root1.left,root2.right) && checkIsomorphic(root1.right,root2.left))
			return true;
		else
			return false;

	}

}

class Node20
{
	int data;
	Node20 left;
	Node20 right;
	
	Node20(int data)
	{
		this.data=data;
		this.left=null;
		this.right=null;
	}
}
