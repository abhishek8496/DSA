package leetcode.dp;

public class BestTimeToBuyAndSellStockI_121 {
	 public static int maxProfit(int[] prices) {
	        if(prices==null || prices.length<2)return 0;
	        int currentProfit=0;
	        int maxProfitSoFar=0;
	        int start=0;
	        for(int i=1 ; i<prices.length ; i++)
	        {
	        	//calculate profit at each step from the assumed start
	            currentProfit=prices[i]-prices[start];
	            //if the caluclated profit is greater than what we got previously update is
	            if(maxProfitSoFar<currentProfit)
	            {
	                maxProfitSoFar=currentProfit;
	            }
	            //if by chance the current profit becomes negative,it means the stock price have gone 
	            //down so the stock price must have gone down to a loss, so we have a better scope for
	            //not buying the stock or buying at a lower price
	            if(currentProfit<0)
	            {
	                currentProfit=0;
	                start=i;
	            }
	        }
	        return maxProfitSoFar;
	        
	    }
	public static void main(String[] args) {
		System.out.println(maxProfit( new int[]{1,2,3,4,5}));
		System.out.println(maxProfit( new int[]{5,4,3,2,1}));

	}

}
