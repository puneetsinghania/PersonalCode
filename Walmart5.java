public class Walmart5 { 
  
    static Node root; 
  
    int maximumPath(Node node, Res res) { 
  
        if (node == null) 
            return 0; 
        if (node.left == null && node.right == null) 
            return node.data; 
     
        int ls = maximumPath(node.left, res); 
        int rs = maximumPath(node.right, res); 
  
        if (node.left != null && node.right != null) { 
  
            res.val = Math.max(res.val, ls + rs + node.data); 
           
            return Math.max(ls, rs) + node.data; 
        } 
       
        return (node.left == null) ? rs + node.data 
                : ls + node.data; 
    } 
  
    
    int maxPathSum(Node node) 
    { 
        Res res = new Res(); 
        res.val = Integer.MIN_VALUE; 
        maximumPath(root, res); 
        return res.val; 
    } 
  
    //Driver program
    public static void main(String args[]) { 
        Walmart5 tree = new Walmart5(); 
        tree.root = new Node(-15); 
        tree.root.left = new Node(5); 
        tree.root.right = new Node(6); 
        tree.root.left.left = new Node(-8); 
        tree.root.left.right = new Node(1); 

        System.out.println("Max pathsum: "
                + tree.maxPathSum(root)); 
    } 
} 
class Node { 
	  
    int data; 
    Node left, right; 
  
    Node(int item) { 
        data = item; 
        left = right = null; 
    } 
} 
  
class Res { 
    int val; 
}   