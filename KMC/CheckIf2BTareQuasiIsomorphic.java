package KMC;

public class CheckIf2BTareQuasiIsomorphic {
	
	public static void main(String[] args) {
		
		int totalNodes=21;
		int[] nodeDatas= {50,16,14,10,15,5,40,35,32,36,37,45,90,78,75,82,81,79,85,87,100};
		
		int i=0;
		Node113 q;
		Node113 temp=new Node113(nodeDatas[i]);
		temp.data=nodeDatas[i];
		temp.left=null;
		temp.right=null;
		
		Node113 root=temp;
		
		for(i=1;i<totalNodes;i++)
		{
			temp=new Node113(nodeDatas[i]);
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
		boolean res=checkQuasiIsomorphic(root,root);
		
		System.out.println(res);
	}
	
	public static boolean checkQuasiIsomorphic(Node113 root1,Node113 root2)
	{
		if(root1==null && root2==null)
			return true;
		else if(root1==null||root2==null)
			return false;
		else if(checkQuasiIsomorphic(root1.left,root2.left) && checkQuasiIsomorphic(root1.right,root2.right)||
				checkQuasiIsomorphic(root1.left,root2.right) && checkQuasiIsomorphic(root1.right,root2.left))
			return true;
		else
			return false;

	}

}

class Node113
{
	int data;
	Node113 left;
	Node113 right;
	
	Node113(int data)
	{
		this.data=data;
		this.left=null;
		this.right=null;
	}
}
