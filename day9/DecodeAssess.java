package day9;


import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class DecodeAssess {
		public static void main(String[] args) {
			 String input = "aaabbccaad";
		      String output="";
		        Map<Character,Integer> map=new HashMap<Character,Integer>();
		        for(int i=0;i<input.length();i++){
		            Character character=input.charAt(i);
		            if(map.containsKey(character)){
		                map.put(character, map.get(character)+1);
		            }else
		            	
		                map.put(character, 1);
		           
		        }
		        for (Entry<Character, Integer> entry : map.entrySet()) {
		            output+=entry.getValue()+""+entry.getKey().charValue();
		      
		        }

		        System.out.println(output);
		}
	}

