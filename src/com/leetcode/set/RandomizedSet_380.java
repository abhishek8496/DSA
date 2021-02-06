package leetcode.set;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

public class RandomizedSet_380 {
	HashMap<Integer,Integer> hm;
    List<Integer> al;

    /** Initialize your data structure here. */
    public RandomizedSet_380() {
        hm = new HashMap<Integer,Integer>();
        al = new ArrayList<Integer>();
    }
    
    /** Inserts a value to the set. Returns true if the set did not already contain the specified element. */
    public boolean insert(int val) {
        if(hm.get(val)!=null)
        {
            return false;
        }
        else
        {
            al.add(val);
            hm.put(val,al.size()-1);
            return true;
        }
    }
    
    /** Removes a value from the set. Returns true if the set contained the specified element. */
    public boolean remove(int val) {
        if(hm.get(val)!=null)
        {
            int index=hm.get(val);
            hm.remove(val);
            //swap the indexed element with last element of arraylist
            int value=al.get(index);
            int lastElmentOfArray = al.get(al.size()-1);
            //update the last elements index in hashmap
            if(val!=lastElmentOfArray)
            {
            hm.put(lastElmentOfArray,index);
            }
            al.set(index,al.get(al.size()-1));
            //remove last element from arraylist
            al.remove(al.size()-1);
            
            return true;
        }
        else
        {
            return false;
        }
        
    }
    
    /** Get a random element from the set. */
    public int getRandom() {
        Random rand = new Random();
        int index=rand.nextInt(al.size());
        return al.get(index);
    }

}
