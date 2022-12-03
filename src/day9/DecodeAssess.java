package day9;


import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class DecodeAssess {
	public static void main(String[] args) {
		String s = "aaabbbccaaad";
		StringBuilder sb = new StringBuilder();
		Map<Character,Integer> hmap = new HashMap<Character,Integer>();
		
		int start =0 , end=0;
		while(end < s.length()) {
			if(s.charAt(end) == s.charAt(start)) {
			hmap.put(s.charAt(end), hmap.getOrDefault(s.charAt(end),0)+1);
			end++;
			}else if(s.charAt(end) !=s.charAt(start)) {
				for (Entry<Character, Integer> i1 : hmap.entrySet()) {
					sb.append(i1.getKey());
					sb.append(i1.getValue());			          
				} 
				hmap.clear();
				start=end;
			}
		}
		for (Entry<Character, Integer> i1 : hmap.entrySet()) {
			sb.append(i1.getKey());
			sb.append(i1.getValue());		          
		} 
		
		
		System.out.println(sb.toString());
	}
}

