package leetcode.array;

import java.util.Arrays;

public class ProductofArrayExceptSelf_238 {

	 public static int[] productExceptSelf(int[] nums) {
	        //this solution works but we want more optimised solution Method 1
	        // int left[] = new int[nums.length];
	        // int right[] = new int[nums.length];
	        // left[0]=nums[0];
	        // right[nums.length-1]=nums[nums.length-1];
	        // for(int i=1; i < nums.length ; i++)
	        // {
	        //     left[i]=left[i-1]*nums[i];
	        // }
	        // for(int i=nums.length-2; i>= 0 ; i--)
	        // {
	        //     right[i]=right[i+1]*nums[i];
	        // }
	        // int output[] = new int [nums.length];
	        // output[0]=right[1];
	        // output[nums.length-1]=left[nums.length-2];
	        // for(int i=1; i < nums.length-1 ; i++)
	        // {
	        //     output[i]=left[i-1]*right[i+1];
	        // }
	        
	        //Method 2
	        
	        int output[] = new int [nums.length];
	        //pehle sara elements ko multiply karo from left except i and store it in answer array
	        output[0]=1;
	        for(int i=1;i<nums.length ;i++)
	        {
	            output[i]=nums[i-1]*output[i-1];
	            
	        }
	        //ab right se ek variable ko assign karo to find the product
	        int right=nums[nums.length-1];
	        for(int i = nums.length-2; i>=0 ; i--)
	        {
	            output[i]=output[i]*right;
	            right=right*nums[i];
	        }
	        
	        return output;
	    }
	public static void main(String[] args) {
		System.out.println(Arrays.toString(productExceptSelf(new int[] {1,2,3,4,5})));

	}

}
