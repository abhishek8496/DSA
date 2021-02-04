package leetcode.queue;

public class GasStation_134 {
	public static int canCompleteCircuit(int[] gas, int[] cost) {
        int n=gas.length;
        //agar sirf ek station hai toh us tak wapas pohochne jitna gas hona chahiye
        if(n==1)
        {
            if(cost[0]<=gas[0])return 0;
            else return -1;
        }
        int start=0;
        int end=start+1;
        int tank=gas[start]-cost[start];
        while(start!=end || tank<0)
        {
        	//agar tank 0 se kam hua tabhi start ko next kar ke check karenge
            if(tank<0)
            {
                start=(start+1)%n;
                //since 0 se hi start kiye the aur wapas 0 me hi aa gaye is liye koi tour available nahi hai
                if(start==0) return -1;
                
                end=(start+1)%n;
                tank=gas[start]-cost[start];
            }
            
            while(start!=end && tank>=0)
            {
            	//jab tak tank hai aage badhte jao
                tank+=(gas[end]-cost[end]);
                end=(end+1)%n;
            }
            
        }
        //yaha tabhi aaenge jab start==end hua and ek proper tour ho paya
        return start;
        
        
    }

}
