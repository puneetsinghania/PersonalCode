package VVK;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class PrintRootToLeafPathsWithGivenSum {
	
	static int sum=0;
	static Stack<Integer> stack=new Stack<>();
	
	public static void main(String[] args) {
		
		int totalNodes=12;
		int[] nodeDatas= {1,2,3,4,5,6,7,8,9,10,11,12};
		
		int i=0;
		Node25 q;
		Node25 temp=new Node25(nodeDatas[i]);
		temp.data=nodeDatas[i];
		temp.left=null;
		temp.right=null;
		
		Node25 root=temp;
		
		for(i=1;i<totalNodes;i++)
		{
			temp=new Node25(nodeDatas[i]);
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
		printRootToLeafPathsWithGivenSum(root,21);
		
	}
	
	public static void printRootToLeafPathsWithGivenSum(Node25 root,int given)
	{
		if(root==null)
			return;
		
		sum=sum+root.data;
		stack.push(root.data);
		if(sum==given)
			System.out.println(Arrays.toString(stack.toArray()));
			
		printRootToLeafPathsWithGivenSum(root.left,given);
		printRootToLeafPathsWithGivenSum(root.right,given);
		
		sum=sum-root.data;
		stack.pop();
	}

}

class Node25
{
	int data;
	Node25 left;
	Node25 right;
	
	Node25(int data)
	{
		this.data=data;
		this.left=null;
		this.right=null;
	}
}
