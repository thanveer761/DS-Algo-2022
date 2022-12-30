package day12;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class Practice {

	public static void main(String[] args) {
		String str ="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		Map<Character,Integer> hm = new HashMap<>();
		for (int i = 0; i < str.length(); i++) {
			hm.put(str.charAt(i), i+100);
		}
		System.out.println(hm);
		Set<Entry<Character, Integer>> entrySet = hm.entrySet();
		for (Entry<Character, Integer> entry : entrySet) {
			Character key = entry.getKey();
			Integer value = entry.getValue();
				
				System.out.println(Arrays.asList(key,value));
			}
			
		}
		
	}
