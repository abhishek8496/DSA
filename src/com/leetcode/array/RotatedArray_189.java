package leetcode.array;

import java.util.Arrays;

public class RotatedArray_189 {
	public static String rotate(int[] nums, int k) {
        //agar k ka value array ka length se zada hai then us time effective rotations nikalna hai
        if(k>nums.length){k=k%nums.length;}
        reverse(nums,0,nums.length-k-1);
        reverse(nums,nums.length-k,nums.length-1);
        reverse(nums,0,nums.length-1);
        return Arrays.toString(nums);
        
    }
    public static void reverse(int[] nums, int start, int end) {
        while(start<end)
        {
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
        }
        
    }
    public static void main(String args[])
    {
    	System.out.println(rotate(new int[] {1,2,3,4,5,6}, 2));
    }

}
