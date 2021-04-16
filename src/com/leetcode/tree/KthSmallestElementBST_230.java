package leetcode.tree;

public class KthSmallestElementBST_230 {
	int count=0;

	public int kthSmallest(TreeNode root, int k) {
		int min=0;
		if(root.left!=null)
		{
			min=  kthSmallest(root.left,k);
			if(min!=-1)
				return min;
		}
		count++;
		if(count==k)
		{
			return root.val;
		}
		if( root.right!=null)
		{
			min= kthSmallest(root.right,k);
			if(min!=-1)
				return min;
		} 
		return -1;


	}
}
