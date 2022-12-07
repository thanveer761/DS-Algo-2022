package day5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

public class GroupAnagrams {
	@Test
	public void testCase1() {
		String[] strs = { "eat", "tea", "tan", "ate", "nat", "bat" };
		List<List<String>> groupAnagrams = groupAnagrams(strs);
		System.out.println(groupAnagrams);

	}
	// o[N]
	/*
	 * create a map with list of string iterate throught the strings take each
	 * convert to the string char Array and sort them
	 * Store the array in a string
	 * and, validate if map dont contains key.put the string in map and create new Array List
	 *else, get the string and add it to new Array list
	 *finally, return map values.
	 *
	 */

	// o[N]
	public List<List<String>> groupAnagrams(String[] strs) {

		Map<String, List<String>> map = new HashMap<>();
		if (strs.length == 0) {
			return new ArrayList();
		}

		for (String s : strs) {
			char arr[] = s.toCharArray(); // converted to char array
			Arrays.sort(arr); // sorting array

			String key = String.valueOf(arr); // converting to string

			if (!map.containsKey(key)) {
				map.put(key, new ArrayList());
			}
			map.get(key).add(s);

		}
		return new ArrayList(map.values());
	}

}
