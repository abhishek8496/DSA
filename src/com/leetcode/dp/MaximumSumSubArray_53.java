package leetcode.dp;

public class MaximumSumSubArray_53 {
	public static int maxSubArray(int[] nums) {
		//Even for all negative cases atleast once the value of maxelement so far will change
		 int maximumSumSoFar=Integer.MIN_VALUE;
	     int currentSum=0;
	     for(int i=1; i<nums.length;i++)
	     {
	         currentSum+=nums[i];
	         if(currentSum>maximumSumSoFar)
	         {
	             maximumSumSoFar=currentSum;
	         }
	         if(currentSum<0)
	         {
	             currentSum=0;
	         }
	     }
	     return maximumSumSoFar;
	    }
	public static void main(String[] args) {
		System.out.println(maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4}));
	}

}
