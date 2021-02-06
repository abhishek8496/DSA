package leetcode.stack;

import java.util.Stack;

public class ValidParenthses_20 {
	public static boolean isValid(String sc) {
		Stack<Character> stack = new Stack<Character>();
		for(int i = 0 ; i<sc.length() ;i++)
		{
			if(sc.charAt(i)=='{'||sc.charAt(i)=='('||sc.charAt(i)=='[')
			{
				stack.push(sc.charAt(i));
			}
			else
			{
				if(stack.isEmpty())return false;
				Character check = stack.pop();
				if(sc.charAt(i)=='}' && check!= '{')return false;
				if(sc.charAt(i)==')' && check!= '(')return false;
				if(sc.charAt(i)==']' && check!= '[')return false;
			}
		}
		if(!stack.isEmpty())return false;
		return true;
	}
	public static void main(String args[])
	{
		System.out.print(isValid("[{()}()]"));
	}
}
