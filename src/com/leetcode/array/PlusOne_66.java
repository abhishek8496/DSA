package leetcode.array;

import java.util.Arrays;

public class PlusOne_66 {
	public static int[] plusOne(int[] digits) {
        int carry=1;
        for(int i=digits.length-1; i>=0 ; i--)
        {
            digits[i]=digits[i]+carry;
            if(digits[i]==10)
            {
                digits[i]=digits[i]-10;
                carry=1;
            }
            else
            {
                carry=0;
            }
        }
        if(carry==1)
        {
            int answer[] = new int[digits.length+1];
            answer[0]=1;
            for(int i =0; i<digits.length ; i++)
            {
                answer[i+1]=digits[i];  
            }
            return answer;
        }
        return digits;
    }
	public static void main(String[] args) {
		System.out.println(Arrays.toString(plusOne(new int[] {9,9,9})));

	}

}
