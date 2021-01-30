package leetcode.tree;

public class BinaryTreeFromPreorderAndInorder_105 {
	//initialise a static variable so it holds the index of the pre order
	int preIndex=0;

	public TreeNode buildTree(int[] preorder, int[] inorder) {
		return buildTree(preorder,inorder,0,preorder.length-1);

	}
	public TreeNode buildTree(int[] pre, int[] in,int start,int end) {



		//now the halting condition
		if(start>end)
			return null;

		//now construct the root
		TreeNode root = new TreeNode(pre[preIndex++]);

		//if it is a leaf simply return the created node
		if(start==end)
		{
			return root;
		}

		//now search the equivalent index for inorder
		int inIndex=search(root.val,start,end,in);

		//now build the remaining left and right subtrees
		root.left = buildTree(pre,in,start,inIndex-1);
		root.right = buildTree(pre,in,inIndex+1,end);
		return root;
	}

	public int search(int rootValue,int start,int end,int[] inorder)
	{
		for(int i=start; i<=end;i++)
		{
			if(inorder[i]==rootValue)return i;
		}
		return -1;
	}
}
