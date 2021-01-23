package leetcode.dp;

/**
 * You can buy and sell the stock multiple times in this case but not in the same day
 * @author abhishek sharma
 *
 */
class Stock{
    int buy;
    int sell;
}
public class BestTimeToBuyAndSellStock2_122 {
	public static int maxProfit(int[] prices) 
    {
        int maxProfit=0;
        for(int i=0; i<prices.length ; i++)
        {
        	//starting from a particular index find the minimum value for slope
            while(i<prices.length-1 && prices[i]>prices[i+1])
            {
                i++;
            } 
            Stock s = new Stock();
            s.buy=i;
            i++;
            //starting from a particular index find the maximum value for slope
            while(i<prices.length-1 && prices[i]<prices[i+1])
            {
                i++;
            }
            //agar range ke end tak kuch mil jaega bechne layak price tabhi bechenge(e.g.prices go decreasing )
            if(i<prices.length)
            {
            s.sell=i;
            maxProfit+=(prices[s.sell]-prices[s.buy]);
            }
        }
        return maxProfit;
    }
	public static void main(String[] args) {
		System.out.println(maxProfit( new int[]{1,2,3,4,5,1,2,3}));
		System.out.println(maxProfit( new int[]{5,4,3,2,1}));

	}

}
