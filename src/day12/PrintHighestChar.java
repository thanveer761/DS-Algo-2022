package day12;

import java.util.Arrays;

public class PrintHighestChar {

	public static void main(String[] args) {

		StringBuilder sb = new StringBuilder();
		char[] ch = { 'a', 'b', 's', 't', 'u', 'v' };
		for (int i = 0; i < ch.length; i++) {
			// System.out.println(ch[i]);
			if (ch[i] - 'a' > 1)
				sb.append(ch[i]).reverse();

		}
		 char[] op = sb.toString().toCharArray();
		System.out.println(op);
		
	}

}
