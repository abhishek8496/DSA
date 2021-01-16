package leetcode.dp;

public class LongestPalindromicSubstring_5 {
	public static String longestPalindrome(String s) {
        int maxLength=0;
        String palin="";
        for(int i=1; i <s.length() ; i++)
        {
            
            //checking for even length palindrome first
            int low=i-1;
            int high=i;
            while(low >=0  && high<s.length() && s.charAt(low)==s.charAt(high))
            {
                if(high-low+1>maxLength)
                {
                    maxLength=high-low+1;
                    //start=low;
                    palin=s.substring(low,high+1);
                }
                low--;
                high++;
            }
            //checking for even length palindrome first
            low=i-1;
            high=i+1;
            while(low>=0 && high <s.length() && s.charAt(low)==s.charAt(high))
            {
                if(high-low+1>maxLength)
                {
                    //start=low;
                    maxLength=high-low+1;
                    palin=s.substring(low,high+1);
                }
                low--;
                high++;
            }
        }
        //when there is no palindrome we must send the first character
        return palin.equals("")?s.charAt(0)+"":palin;
    }

	public static void main(String[] args) {
		
		System.out.println(longestPalindrome("abcdmadamdsdas"));
	}

}
