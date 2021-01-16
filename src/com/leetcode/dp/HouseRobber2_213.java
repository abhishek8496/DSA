package leetcode.dp;

import java.util.Arrays;

public class HouseRobber2_213 {
	 public static int rob(int[] nums) 
	    {
	       if(nums.length==1)
	       {return nums[0];}
	       else if(nums.length==2)
	       {return Math.max(nums[0],nums[1]);}
	       else 
	       {
	          
	           return Math.max(houseRobber1(Arrays.copyOfRange(nums, 0, nums.length-1)),houseRobber1(Arrays.copyOfRange(nums, 1, nums.length)));
	       }
	        
	    }
	    //method same as house robber1
	    public static int houseRobber1(int[] nums) 
	    {
	           int dp[] = new int[nums.length];
	           dp[0]=nums[0];
	           dp[1]=Math.max(dp[0],nums[1]);
	           for(int i=2 ; i<nums.length ;i++)
	           {
	               dp[i]=Math.max(dp[i-2]+nums[i],dp[i-1]);
	           }
	           return dp[nums.length-1];
	    }

	public static void main(String[] args) {
		
				System.out.println(rob(new int[]{2,7,9,3,1}));

	}

}
