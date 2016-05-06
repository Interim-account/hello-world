
public class Tree {

	
	TreeNode root;
	
	void insert(int val){
		
		if(root==null){
			TreeNode newNode = new TreeNode();
			newNode.setVal(val);
			root = newNode;
		}else{
			
			TreeNode current = root;
			TreeNode parent;
			while(true){
				
				parent = current;
				if(val<current.getVal()){
					current = current.getLeft();
					if(current==null){
						TreeNode newNode = new TreeNode();
						newNode.setVal(val);
						parent.setLeft(newNode);
						return;
					}
				}else{
					
					current = current.getRight();
					if(current==null){
						TreeNode newNode = new TreeNode();
						newNode.setVal(val);
						parent.setRight(newNode);
						return;
					}
					
				}
				
			}
			
		}
		
	}
	
	
}
