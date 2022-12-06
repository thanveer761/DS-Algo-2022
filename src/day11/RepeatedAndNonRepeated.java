package day11;

import java.util.HashMap;

public class RepeatedAndNonRepeated{
	/*psuedoocde
	 * Declare a map
	 * traverse through string
	 * add each characters in map
	 * if map has character which occured once 
	 * print it
	 * if map has character which occured more than once 
	 * print the first occurence of character
	 * 
	 */
	public static void main(String[] args) {
		String str2="thanveer ahmed";
        HashMap<Character, Integer> hMap = new HashMap<Character, Integer>();
        for (int i= 0; i < str2.length(); i++) {
	         if (hMap.containsKey(str2.charAt(i))) {
	            int count = hMap.get(str2.charAt(i));
	            hMap.put(str2.charAt(i), ++count);
	         } else {
	            hMap.put(str2.charAt(i),1);
	         }
	      }
        for (int i= 0; i < str2.length(); i++) {
        	if (hMap.containsKey(str2.charAt(i))) {
	             if(hMap.get(str2.charAt(i))==1);
	        	 System.out.println("First Non-Repeated Character In '" + str2 + "' is '" + str2.charAt(i) + "'");

	        	 break;
	         }
        }
        for (int i= 0; i < str2.length(); i++) {
        	if (hMap.containsKey(str2.charAt(i))) {
        	 if(hMap.get(str2.charAt(i)) > 1) {;
	        	 System.out.println("First Repeated Character In '" + str2 + "' is '" + str2.charAt(i) + "'");
        	
	        	 break;
	         }
        }
   
    }
}}
