package leetcode.tree;

public class FindaCorrespondingNodeofaBinaryTreeinACloneofThatTree_1379 {
	  public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
	        if(original!=null)
	        {
	            
	            TreeNode left=getTargetCopy(original.left,cloned.left,target);
	            
	            TreeNode right=getTargetCopy(original.right,cloned.right,target);
	            
	            if(original.val==target.val)
	            {
	                return cloned;
	            }
	            if(left!=null)
	            {
	                return left;
	            }
	            else
	            {
	                return right;
	            }
	            
	        }
	        
	        return null;
	    }
}
