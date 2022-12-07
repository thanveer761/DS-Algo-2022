package day12;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.junit.Test;

public class PrintUniqueAndDuplicateWords {
	@Test
	public void td1() {
		String str = "thanveer from salem  and from salem TN";
		String dupWord = printUniqueAndDups(str);
		System.out.println(dupWord);
		
	}

	@Test
	public void td2() {
		String str = "thanveer from sal9789em  and from salem TN";
		String dupWord = printUniqueAndDups(str);
		System.out.println(dupWord);

	}

	public String printUniqueAndDups(String str) {
		String dupWordd= "";
		String	uniqueWordd="";
		String[] words = str.split("\\W");
		Map<String, Integer> map = new HashMap<>();
		// Here we are iterating in words array and
		// increasing it's occurrence by 1.
		for (String word : words) {

			if (map.get(word) != null||map.containsKey(word)) {
				map.put(word, map.get(word) + 1);
			}
			// if the word came once then occurrence is 1.
			else {
				map.put(word, 1);
			}
		}
		 for (Map.Entry<String, Integer> entry :
	         map.entrySet()) {

	        // If value of words equals unity
	        if (entry.getValue() > 1) {
				String word = entry.getKey();
				dupWordd+=" "+word;
				
			}else if(entry.getValue()==1) {
				String word2= entry.getKey();
				uniqueWordd+=" "+word2;
			}
		 }
return dupWordd+","+uniqueWordd;
	}
}
