package leetcode.tree;

public class DeepestLeavesSum_1302 {
	//first find the deepest level 
    //then find the sum for the deepest level
    int level=0;
    int sum=0;
    public int deepestLeavesSum(TreeNode root) {
        
        //mode =1 for finding level,2 for finding sum
        deepestLeavesSum(root,0,1);
        //now we have the deepest level with us,now simply calculate the sum at that level
        deepestLeavesSum(root,0,2);
        return sum;
        
        
    }
    public void deepestLeavesSum(TreeNode root,int currentLevel,int mode) {
        if(root!=null)
        {
            if(mode==2)
            {
                if(currentLevel==level)
                {
                    sum+=root.val;
                }
            }
            if(mode==1)
            {
                if(currentLevel>level)
                {
                    level=currentLevel;
                
                 }
            }    
            deepestLeavesSum(root.left,currentLevel+1,mode);
            deepestLeavesSum(root.right,currentLevel+1,mode);
        }
            
    }

}
