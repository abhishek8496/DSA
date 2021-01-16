package leetcode.dp;

public class HouseRobber3_337 {
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode() {}
		TreeNode(int val) { this.val = val; }
		TreeNode(int val, TreeNode left, TreeNode right) {
			this.val = val;
			this.left = left;
			this.right = right;
		}
	}
	public int rob(TreeNode root) 
	{
		if(root!=null)
		{

			int lc=0,rc=0,llc=0,lrc=0,rlc=0,rrc=0;
			if(root.left!=null)
			{
				lc= rob(root.left);
				if(root.left.left!=null)
				{
					llc=rob(root.left.left);   
				}
				if(root.left.right!=null)
				{
					lrc=rob(root.left.right);  
				}
			}
			if(root.right!=null)
			{
				rc=rob(root.right);
				if(root.right.left!=null)
				{
					rlc=rob(root.right.left);   
				}
				if(root.right.right!=null)
				{
					rrc=rob(root.right.right);  
				}
			}
			return Math.max(root.val+llc+lrc+rlc+rrc,lc+rc);

		}else return 0;
	}


}
