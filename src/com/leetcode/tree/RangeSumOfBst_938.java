package leetcode.tree;

public class RangeSumOfBst_938 {
	 int sum=0;
	    public int rangeSumBST(TreeNode root, int low, int high) {
	        rangeSumBSTUtil(root,low,high);
	        return sum;
	    }
	    public void rangeSumBSTUtil(TreeNode root, int low, int high) {
	        
	        if(root!=null)
	        {
	            if(root.val>=low && root.val<=high)
	            {
	                sum+=root.val;
	            }
	            rangeSumBSTUtil(root.left,low,high);
	            rangeSumBSTUtil(root.right,low,high);
	        }
	        
	    }
}
