package leetcode.dp;

/**
 * You can buy and sell the stock 2 times at maximum in this case but not in the same day
 * It is ome what like trapping the rain water problem.
 * first we check for the profit from left and then from right.
 * then we find the optimum index at which we can sell so that sum of first sell and second sell is maximum.
 * @author abhishek sharma
 *
 */
public class BestTimeToBuyAndSellStock3_123 {
	public static int maxProfit(int[] prices) 
    {
		if(prices.length<2)return 0;
        int maxProfitFromLeft[] = new int[prices.length];
        int maxProfitFromRight[] = new int[prices.length];
        int start=0;
        int maxProfit=0;
        int currentProfit=0;
        //first populating the profit from left
        for(int i=1; i<prices.length;i++)
        {
            currentProfit=prices[i]-prices[start];
            if(currentProfit>maxProfit)
            {   
               maxProfit = currentProfit;
            }
            maxProfitFromLeft[i]=maxProfit;
            if(currentProfit<0)
            {
                start=i;
                currentProfit=0;
            }
        }
        maxProfit=0;    currentProfit=0;
        int end=prices.length-1;
        //now populating the profit from  the right hand side
        for(int i=prices.length-2; i>=0;i--)
        {
            currentProfit=prices[end]-prices[i];
            if(currentProfit>maxProfit)
            {   
               maxProfit = currentProfit;
            }
            maxProfitFromRight[i]=maxProfit;
            if(currentProfit<0)
            {
                end=i;
                currentProfit=0;
            }
        }
        
        
        //we find the profit at any index k where left ka profit + right ka profit is MAX
        maxProfit=0;
        for(int i=0; i<prices.length;i++)
        {
            if(i==prices.length-1)
            {
            	//ho sakta hai sab ascending me ho tab right wala me toh koi profit nahi dikhega
            	//for the last index
                maxProfit=Math.max(maxProfit,maxProfitFromLeft[i]);
                continue;
            }
            maxProfit=Math.max(maxProfit,maxProfitFromLeft[i]+maxProfitFromRight[i+1]);
        }
        return maxProfit;
        
    }
	public static void main(String[] args) {
		System.out.println(maxProfit( new int[]{1,2,3,4,5,1,2,200,1,1000}));
		System.out.println(maxProfit( new int[]{5,4,3,2,1}));
		System.out.println(maxProfit( new int[]{1,2,3,4,5}));

	}

}
