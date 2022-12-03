package day5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

public class GroupAnagrams {
	@Test
	public void testCase1() {
		String[] strs = {"eat","tea","tan","ate","nat","bat"};
		List<List<String>> groupAnagrams = groupAnagrams(strs);
		System.out.println(groupAnagrams);
		
	}
	//o[N]
	/*
	 * create a map with list of string
	 * iterate throught the strings 
	 * take each character 
	 * and iterste with the assccii
	 * take the value of ca
	 * if map contains key add it to map
	 * and get the mapp and add it to list
	 * return map value usong array list
	}*/
	
	//o[N]
public List<List<String>> groupAnagrams(String[] strs) {
	 if (strs.length == 0) return new ArrayList<>();
     Map<String, List<String>> map = new HashMap<>();
     for (String s : strs) {
         char[] ca = new char[26];
         for (char c : s.toCharArray()) ca[c - 'a']++;
         String keyStr = String.valueOf(ca);
         if (!map.containsKey(keyStr)) map.put(keyStr, new ArrayList<>());
         map.get(keyStr).add(s);
     }
     return new ArrayList<>(map.values());
 }
        
    }
