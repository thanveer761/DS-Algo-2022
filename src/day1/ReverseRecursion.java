package day1;

import org.junit.Test;

public class ReverseRecursion {
		@Test
		public void td1() {
			char[] s={'t','h','a','n','v','e','e','r'};
			char[] op = reverseRecurseString(0, 0, s);
			System.out.println(op);
			char[] recurseString = recurseString(s);
			System.out.println(recurseString);
		}
		public char[] recurseString(char[] s) {
			return reverseRecurseString(0,s.length-1,s);
		}
		private char[] reverseRecurseString(int i, int j, char[] s) {
		if(i>=j) {
			
		}else {
			char temp=s[i];
		s[i]=s[j];
		s[j]=temp;
		reverseRecurseString(++i, --j, s);
			
		}
		return s;
		}
	}

