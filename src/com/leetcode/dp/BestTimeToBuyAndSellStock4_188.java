package leetcode.dp;

/**
 * You can buy and sell the stock at most k times.
 * @author abhishek sharma
 *
 */
public class BestTimeToBuyAndSellStock4_188 {
	public static int maxProfit(int k, int[] prices) {
		if(prices.length<2)return 0;
		int[][] profits = new int[k+1][prices.length];
		//you cant make profit when a single prize is given
		for(int i=0 ; i<=k ;i++)
		{
			profits[i][1]=0; 
		}
		//you cant make profit when number of transactions is 0
		for(int i=0 ; i<prices.length ;i++)
		{
			profits[0][i]=0;
		}
		for(int t=1; t<=k ;t++)
		{
			for(int d=1 ; d<prices.length ;d++)
			{
				/*profit on 'd'th day when we can do at max 't' transactions
	                Maximum of 1)we dont sell the stock at d'th day and the profit will be same as the previous day
	                2)we sell the stock today i.e.on dth day which we bought on some 'x' day and will add up the 
	                profit  we got*/
				profits[t][d]=Math.max(profits[t][d-1],prices[d]+calculateProfit(t,d,prices,profits));
			}
		}
		return profits[k][prices.length-1];

	}

	static int  calculateProfit(int transactions,int days ,int[] prices,int[][] profits)
	{
		int max=Integer.MIN_VALUE;
		int temp=0;
		for(int i=0; i<days ;i++)
		{
			temp= (-prices[i]+profits[transactions-1][i]);
			if(temp>max)
				max=temp;
		}
		return max;

	}
	public static void main(String[] args) {
		System.out.println(maxProfit(3, new int[]{1,2,3,4,5,1,2,200,1,1000}));
		System.out.println(maxProfit(2, new int[]{5,4,3,2,1}));
		System.out.println(maxProfit(2, new int[]{1,2,3,4,5}));

	}

}
