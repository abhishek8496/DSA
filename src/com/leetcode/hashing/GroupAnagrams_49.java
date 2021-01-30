package leetcode.hashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams_49 {
	 public static List<List<String>> groupAnagrams(String[] strs) {
	        Map<String,List<String>> groupMapping = new HashMap<String,List<String>>();
	        List<List<String>> finalResult=new ArrayList<List<String>>();
	        for(String string:strs)
	        {
	            //sort a string in  natural order and store in the map-all anagrams will come under the same key
	            char[] characterArray=string.toCharArray();
	            Arrays.sort(characterArray);
	            String sortedString=String.valueOf(characterArray);
	            List<String> anagrams;
	            if(groupMapping.get(sortedString)==null)
	            {
	                anagrams = new ArrayList<String>();
	            }
	            else
	            {
	                anagrams = groupMapping.get(sortedString);
	            }
	            anagrams.add(string);
	            groupMapping.put(sortedString,anagrams);
	            
	        }
	        for(Map.Entry<String,List<String>> m : groupMapping.entrySet())
	        {
	            finalResult.add(m.getValue());
	        }
	        return finalResult;
	    }

	public static void main(String[] args) {
		System.out.print(groupAnagrams(new String[] {"eat","tea","tan","ate","nat","bat"}));

	}

}
