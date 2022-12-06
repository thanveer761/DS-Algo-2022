package day9;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.Test;

public class CountDupsGroup {

	
	@Test
	public void td3() {
		String m = "aaabbbccaaad";
		//op==>4
		int op = stringocc2(m);
		System.out.println(op);
		//int op = stringocc1(m);
		//	System.out.println(op);
		//int op1 = stringocc2(m);
		//System.out.println(op1);

	}
	public int stringocc0(String m) {
		int count = 0;
		char [] chars = m.toCharArray();
		char c = chars[0];
		int k = 0;
		int i=1;
		for (; i < chars.length; i++) {
			if (chars[i] != c) {
				if (i - k  > 1) {
					count++;
				}
				c = chars[i];
				k = i;
			}
		}
		
		return count + ((i-k > 1) ? 1 : 0);
		
	}
	public int stringocc1(String m) {
		int count = 0;
		Matcher matcher = Pattern.compile("(\\w)\\1+").matcher(m);
		while (matcher.find()) {
			count++; 
		}
		return count;
	}

	public int stringocc2(String m) {
		int count=0;
		Map<Character,Integer> hm = new HashMap<>();
		for (int i = 0; i < m.length(); i++) {
			hm.put(m.charAt(i), hm.getOrDefault(m.charAt(i), 0)+1);
		}
		//System.out.println(hm);
		Set<Entry<Character, Integer>> entrySet = hm.entrySet();
		for (Entry<Character, Integer> entry : entrySet) {
			if(entry.getValue()>1) {
				count+=entry.setValue(1
						);
			}
		}
		return count;


	}

}
