package tree;

public class TreeOps {


	void preOrderTraversal(TreeNode node){
		if(node==null){
			//System.out.println("Pre: Nothing to display");
			return;
		}else{
			System.out.print(node.val + " ");
			preOrderTraversal(node.left);
			preOrderTraversal(node.right);
		}
	}

	void inOrderTraversal(TreeNode node){
		if(node==null){
			//System.out.println("In: Nothing to display");
			return;
		}else{
			inOrderTraversal(node.left);
			System.out.print(node.val+" ");
			inOrderTraversal(node.right);
		}
	}

	void postOrderTraversal(TreeNode node){
		if(node==null){
			//System.out.println("Post: Nothing to display");
			return;
		}else{
			postOrderTraversal(node.left);
			postOrderTraversal(node.right);
			System.out.print(node.val + " ");
		}
	}
	
}
