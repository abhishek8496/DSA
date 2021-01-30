package leetcode.dp;

public class IsSubsequence392 {
	public static boolean isSubsequence(String s, String t) {        int start=0;
    if(s.equals(""))return true;
    if(t.equals(""))return false;
    
    for(int i=0; i<s.length(); i++)
    {
        if(start<t.length())
        {
           start=t.indexOf(s.charAt(i),start); 
            if(start==-1)return false;
        } 
        else
        {
            return false;
        }
        
        start++;
    }
    return true;
    }
	public static void main(String args[]) {
		isSubsequence("acb","ahbgdc");
	}

}
