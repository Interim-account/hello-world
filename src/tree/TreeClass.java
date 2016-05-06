package tree;

public class TreeClass {

	TreeNode root;

	void insert(int data){

		if(root==null)
		{
			TreeNode newNode = new TreeNode(data);
			root = newNode;
		}
		else
		{


			TreeNode current = root, parent;
			while(true)
			{

				parent = current;

				if(data<current.val)
				{
					current = current.left;
					if(current==null)
					{
						TreeNode newNode = new TreeNode(data);
						parent.left=newNode;
						return;
					}
				}else
				{
					current = current.right;
					if(current==null)
					{
						TreeNode newNode = new TreeNode(data);
						parent.right= newNode;
						return;
					}
				}
			}
		}

	}
	
	

}
