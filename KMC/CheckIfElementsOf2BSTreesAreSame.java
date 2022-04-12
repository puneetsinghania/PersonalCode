package KMC;

import java.util.ArrayList;
import java.util.List;

public class CheckIfElementsOf2BSTreesAreSame {

	static List<Integer> list1= new ArrayList<>();
	static List<Integer> list2= new ArrayList<>();

	public static void main(String[] args) {

		Node125 root1 = new Node125(4);
		root1.left = new Node125(2);
		root1.right = new Node125(7);
		root1.left.left = new Node125(1);
		root1.left.right = new Node125(3);

		Node125 root2 = new Node125(4);
		root2.left = new Node125(2);
		root2.right = new Node125(7);
		root2.left.left = new Node125(1);
		root2.left.right = new Node125(3);

		//important method here
		boolean isSame = checkElements(root1,root2);

		System.out.println(isSame);
	}

	public static boolean checkElements(Node125 root1,Node125 root2) {

		inorder(root1,list1);
		inorder(root2,list2);

		return list1.equals(list2);
	}

	public static void inorder(Node125 root,List<Integer> list) {

		if(root==null)
			return;

		inorder(root.left,list);

		list.add(root.data);

		inorder(root.right,list);
	}

}

class Node125
{
	int data;
	Node125 left;
	Node125 right;

	Node125(int data)
	{
		this.data=data;
		this.left=null;
		this.right=null;
	}
}
