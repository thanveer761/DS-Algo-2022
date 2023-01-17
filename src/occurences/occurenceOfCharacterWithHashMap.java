package occurences;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class occurenceOfCharacterWithHashMap {
	
	@Test
	public void td1() {
		String s="thanveer";
		occWithMap(s);
	}
	@Test
	public void td2() {
		String s="ajit";
occWithMap(s);
	}
	
	private String occWithMap(String s) {
		 HashMap<Character, Integer> charCountMap
         = new HashMap<Character, Integer>();

     // Converting given string to char array

     char[] strArray = s.toCharArray();

     // checking each char of strArray
     for (char c : strArray) {
         if (charCountMap.containsKey(c)) {

             // If char is present in charCountMap,
             // incrementing it's count by 1
             charCountMap.put(c, charCountMap.get(c) + 1);
         }
         else {

             // If char is not present in charCountMap,
             // putting this char to charCountMap with 1 as it's value
             charCountMap.put(c, 1);
         }
     }
     for (Map.Entry entry : charCountMap.entrySet()) {
         System.out.println(entry.getKey() + " " + entry.getValue());
     }
	return s;
 }
		 
	   }
