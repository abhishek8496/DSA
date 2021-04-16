package leetcode.array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

public class IntersectionOf2Arrays2_350 {
	public int[] intersect(int[] nums1, int[] nums2) {
		int[] biggerArray=nums1.length>=nums2.length?nums1:nums2;
		int[] smallerArray=nums1.length<nums2.length?nums1:nums2;
		HashMap<Integer,Integer> mapSmall = new HashMap<Integer,Integer>();
		HashMap<Integer,Integer> mapBig = new HashMap<Integer,Integer>();
		prepareFreqMap(smallerArray,mapSmall);
		prepareFreqMap(biggerArray,mapBig);

		List<Integer> result= new ArrayList<Integer>();
		for(Entry<Integer, Integer> entry:mapSmall.entrySet())
		{
			if(mapBig.get(entry.getKey())!=null)
			{
				//if the key is also present in bigger map
				int count=Math.min(entry.getValue(),mapBig.get(entry.getKey()));
				for(int i = 0 ; i < count;i++)
					result.add(entry.getKey());
			}

		}


		return result.stream().mapToInt(Integer::intValue).toArray();


	}


	public void prepareFreqMap(int arr[], HashMap<Integer,Integer> map)
	{
		for(int x:arr)
		{
			if(map.get(x)==null)
			{
				map.put(x,1);
			}
			else
			{
				int count=map.get(x);
				map.put(x,count+1);

			}
		}
	}

}
