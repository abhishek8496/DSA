package leetcode.dp;

/**
 * You can buy and sell the stock with a cooldown.So basically we want to decide ki aaj sell karna sahi rahega ya hold kare
 * @author abhishek sharma
 *
 */
public class BestTimeToBuyAndSellStock5Cooldown_309 {
	/*
    In this solution we have an intuition of prebuing isliye selling me minus kar rahe
    Here we have three states:-
    1)NoStock[i]=Math.max(NoStock[i-1],Sold[i-1])//pehle se nahi tha ya last day beche hai
    2)InHand[i]=Math.max(InHand[i-1], NoStock[i-1]-price[i]);//ya toh pehle se tha ya aaj kharide
    3)Sold[i]=InHand[i-1]+price[i] //sold tabhi kar sakte jab pehle kharide ho
    Due to our cooling constraint we can only goto noStock state from sold state and will have to spend there a day
    
    TODO:Try optimizing for O(1) sc by taking only 3 variables
    */
    public static int maxProfit(int[] prices) {
        if(prices.length<2)return 0;
        int noStock[] = new int[prices.length];
        int inHand[] = new int[prices.length];
        int sold[] = new int[prices.length];
        
        inHand[0]=-prices[0];
        for(int i=1 ; i <prices.length ; i++)
        {
            //ya toh pehle kuch tha nahi ya last din bech diye aur ab cooling period katna hai...whatever is maximum 
            noStock[i]=Math.max(noStock[i-1],sold[i-1]);
            
            //ya toh pehle se tha ya aaj kharide hai....toh NoStack me jitna balance hai usme se aaj ka price 
            //minus karenge tab kharida jaega
            inHand[i]=Math.max(inHand[i-1],noStock[i-1]-prices[i]);
            
            //sold is simple jo inhand tha usko aaj ke price pe bech do aur noStock me chal jao
            sold[i]=inHand[i-1]+prices[i];
        }
        return Math.max(sold[prices.length-1],noStock[prices.length-1]);
        //we dont need to consider the max for inHand state because that dont make any sense
    }
	public static void main(String[] args) {
		System.out.println(maxProfit( new int[]{1,2,3,4,5,1,2,200,1,1000}));
		System.out.println(maxProfit( new int[]{5,4,3,2,1}));
		System.out.println(maxProfit( new int[]{1,2,3,4,5}));

	}

}
