package reverse;

import org.junit.Test;

public class RecursionReverseString {
@Test
public void td1() {
	char[] s = {'h','e','l','l','o'};
	char[] reverseRecursiveString = reverseRecursiveString(0, 0, s);
	System.out.println(reverseRecursiveString);
	char[] reverseString = reverseString(reverseRecursiveString);
	System.out.println(reverseString);
}
	
	public char[] reverseString(char[] s) {
		 return reverseRecursiveString(0,s.length-1,s);
	}
	public char[] reverseRecursiveString(int start,int end ,char[] s) {
		
		 if(start>=end)
		    {
		        
		    }
		    else
		    {
		        char temp = s[start];
		        s[start] = s[end];
		        s[end] = temp;         
		      reverseRecursiveString(++start,--end,s);
		    }
		return s;
		
		
		
	}
	
}
