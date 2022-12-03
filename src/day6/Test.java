package day6;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;



public class Test {

	public static void main(String[] args) {
		String s = "AppleAimAir";
	
		Map<Character, Integer> hmap = new HashMap<Character, Integer>();

		for (int i = 0; i < s.length(); i++) {
			hmap.put(s.charAt(i), hmap.getOrDefault(s.charAt(i), 0) + 1);
		}

		for (Entry<Character, Integer> res : hmap.entrySet()) {
			// Character key = res.getKey();
			if (res.getKey() == 'A' || res.getKey() =='p') {
				if (res.getValue() >= 1) {
					hmap.put(res.getKey(), res.getValue() - 1);
				} 
			}

		}
		 System.out.println(hmap);
}
}