package leetcode.hashing;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRU_cache_146 {

	    LinkedHashMap<Integer,Integer> hmap;
	    public LRU_cache_146(int capacity) 
	    {
	        hmap =  new LinkedHashMap<Integer,Integer>()
	        {
	            //if this method returns true the least recently used entry will get removed
	            public boolean removeEldestEntry(Map.Entry<Integer,Integer> entry)
	            {
	                return size()>capacity;
	            }
	        };
	    }
	    
	  //suppose some one calls for key 2 then it comes under recently used and should be added again
	    public int get(int key) 
	    {
	        if(hmap.get(key)!=null)
	        {
	            int value= hmap.get(key);
	            hmap.remove(key);
	            hmap.put(key,value);
	            return value;
	        }
	        else
	        {
	            return -1;
	        }
	    }
	    
	    
	    //suppose <2,3> already exists and we want to update it as <2,4>
	    //then first remove it and then add it again
	    public void put(int key, int value) {
	        if(hmap.get(key)!=null)
	        {
	            hmap.remove(key);
	            hmap.put(key,value);
	            
	        }
	        else
	        {
	             hmap.put(key,value);
	        }
	       
	    }
	
}
