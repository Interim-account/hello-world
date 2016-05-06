package practree;

import tree.TreeNode;

public class Solution {

	public boolean isSameTree(TreeNode p, TreeNode q) {
        
        if(p==null && q==null) return true;
        
        if((p==null && q!=null) || (q==null && p!=null)) return false;
        
        if(p!=null && q!=null){
        	
        	if(p.val!=q.val){
        		return false;
        	}
        	
        	isSameTree(p.left, q.left);
        	isSameTree(p.right, q.right);
        }
       
        return true;
    }
	
}
