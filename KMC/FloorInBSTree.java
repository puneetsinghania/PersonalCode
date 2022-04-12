package KMC;

public class FloorInBSTree {
	
	public static void main(String[] args) {

		Node122 root = new Node122(4);
		root.left = new Node122(2);
		root.right = new Node122(7);
		root.left.left = new Node122(1);
		root.left.right = new Node122(3);

		//important method here
		int floor = findFloor(root,1);

		System.out.println(floor);
	}

	public static int findFloor(Node122 root,int key) {

		int floor=-1;

		while(root!=null)
		{
			if(key==root.data)
			{
				floor=root.data;
				return floor;
			}
			else if(key>root.data)
			{
				floor=root.data;
				root=root.right;
			}
			else
				root=root.left;
		}

		return floor;
	}

}

class Node122
{
	int data;
	Node122 left;
	Node122 right;
	
	Node122(int data)
	{
		this.data=data;
		this.left=null;
		this.right=null;
	}
}
