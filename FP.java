public class FP { 
   
  
    public static void main(String[] args) { 
          
        
    	NodeFP root = new NodeFP(1); 
        root.left = new NodeFP(2); 
        root.right = new NodeFP(3); 
        
        System.out.println(findShortedDistance(root, 5, 6)); 
                                
    }
	
    public static NodeFP LCA(NodeFP root, int a1, int a2)  
    { 
    	if(root==null)
			return null;
		
		if(root.data==a1||root.data==a2)
			return root;
		
		NodeFP left=LCA(root.left,a1,a2);
		NodeFP right=LCA(root.right,a1,a2);
		
		if(left!=null && right!=null)
			return root;
		
		else
			return (left!=null?left:right);
    } 
        
    
    public static int findShortedDistance(NodeFP root, int a, int b) 
    { 
    	NodeFP lca = LCA(root, a, b); 
  
        int d1 = level(lca, a, 0); 
        int d2 = level(lca, b, 0); 
  
        return d1 + d2; 
    } 
    
    public static int level(NodeFP root, int p, int level) 
    { 
        if (root == null) 
            return -1; 
        if (root.data == p) 
            return level; 
        int left = level(root.left, p, level + 1); 
        if (left == -1) 
            return level(root.right, p, level + 1); 
        return left; 
    }
} 

class NodeFP { 
    int data; 
    NodeFP left; 
    NodeFP right; 

    public NodeFP(int data) { 
        this.data = data; 
        this.left=null;
        this.right=null;
    } 
}