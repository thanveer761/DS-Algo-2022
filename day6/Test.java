package day6;

import java.util.HashMap;
import java.util.Map;



public class Test {

	public static void main(String[] args) {
		String name ="AppleAimAir";
		int len = name.length();
	Map<Character,Integer> mn = new HashMap<>();
	for (int i = 0; i < len; i++) {
		mn.put(name.charAt(i), mn.getOrDefault(name.charAt(i), 0)+1);
		mn.get(name.charAt(0)-1);
		mn.get(mn)
	}
//	System.out.println(mn);
	
	
	
	System.out.println(mn);
	}

}
