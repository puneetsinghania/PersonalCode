package Sigtuple;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class Sigtuple4 {
	
	static Queue<NodeSig> q=new LinkedList<>();
	static int r=-1;
	static int f=-1;
	public static void main(String[] args) {
		
		Sigtuple4 sig=new Sigtuple4();
		sig.enqueue(new NodeSig(5));
		sig.enqueue(new NodeSig(6));
		System.out.println(sig.deque());
	}
	public void enqueue(NodeSig node)
	{
		/*if(r==q.size()) {
			System.out.println("Overflow");
		}*/
		//else
		//{
			if(q.isEmpty())
				{
				r=0;
				f=0;
				}
			q.add(node);
			r++;
	//	}
	}
	
	public int deque()
	{
		NodeSig n=null;
		if(f==-1 && r==-1 ||f==r) {
			System.out.println("UnderFlow");
		}
		else
		{
			 n=q.remove();
			f++;
		}
		return n.data;
	}

}

class NodeSig
{
	int data;
	NodeSig next;
	NodeSig(int data)
	{
		this.data=data;
		this.next=null;
	}
	
}
