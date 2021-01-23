package leetcode.dp;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;
import java.util.UUID;

public class ClimbingStaricase_70 {
	 public static int climbStairs(int n) {
	        if(n==0)return 0;
	        if(n==1)return 1;
	        if(n==2)return 2;
	        
	        int memo[] = new int[n+1];
	        memo[0]=1;
	        memo[1]=1;
	        memo[2]=2;
	        for(int i=3; i<=n ;i++)
	        {
	            memo[i]=memo[i-1]+memo[i-2];
	        }
	        return memo[n];
	        
	    }
	public static void main(String[] args) {
		System.out.println(climbStairs(6));
		UUID uuid=UUID.randomUUID(); 
		System.out.println("UUID_CODE:"+uuid.toString());
		Date date = new Date(System.currentTimeMillis());
		SimpleDateFormat sdf;
		sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSXXX");
		sdf.setTimeZone(TimeZone.getTimeZone("GMT+5:30"));
		String text = sdf.format(date);
		System.out.println("DATE_TIME_ISO8601FORMAT:"+text);
		//clsWebServiceRequestDTO.setParamvsValueMap(paramvsValueMap);

	}

}
