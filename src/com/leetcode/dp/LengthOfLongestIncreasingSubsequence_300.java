package leetcode.dp;

import java.util.Arrays;

public class LengthOfLongestIncreasingSubsequence_300 {
	public static int lengthOfLIS(int[] nums) {
        int LIS[] = new int[nums.length];
        LIS[0]=1;
        int lengthOfLIS=1;
        for(int i=1; i <nums.length ; i++)
        {
            int temp=1;
            for(int j=i-1; j>=0 ;j--)
            {
                if(nums[i]>nums[j])
                {
                    temp=Math.max(temp,1+LIS[j]);
                }
            }
            LIS[i]=temp;
            lengthOfLIS=Math.max(lengthOfLIS,temp);
        }
        System.out.println(Arrays.toString(LIS));
        return lengthOfLIS;
    }

	public static void main(String[] args) {
		lengthOfLIS(new int[] {1,2,3,4,5});

	}

}
