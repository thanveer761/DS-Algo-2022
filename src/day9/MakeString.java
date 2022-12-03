package day9;

import java.util.Collections;
import java.util.Stack;

import org.junit.Test;

public class MakeString {
	@Test
	public void td1() {
		
		String s = "leEeetcode";
		String makeString = makeString(s);
		System.out.println(makeString);
	}
	@Test
	public void td2() {
		
		String s = "abBAcC";
		String makeString = makeString(s);
		System.out.println(makeString);
	}
	@Test
	public void td3() {
		
		String s = "s";
		String makeString = makeString(s);
		System.out.println(makeString);
	}
	
	public String makeString(String s) {
		
		Stack<Character> st = new Stack<>();
		 for(int i = 0; i < s.length(); i++)
	        {
	            if(s.charAt(i) == Character.toLowerCase(s.charAt(i)))
	            {
	                if(!st.isEmpty() && st.peek() == Character.toUpperCase(s.charAt(i)))
	                {
	                    
	                    st.pop();
	                }
	                else
	                {
	                    st.push(s.charAt(i));
	                }
	            }
	            else if(s.charAt(i) == Character.toUpperCase(s.charAt(i)))
	            {  
	                if(!st.isEmpty() && st.peek() == Character.toLowerCase(s.charAt(i)))
	                {
	                    st.pop();
	                }
	                else
	                {
	                    st.push(s.charAt(i));
	                }
	            }
	        }
	        Collections.reverse(st);
	        String result = "";
	        while(!st.isEmpty())
	        {
	            result = result + st.pop();    
	        }
	        return result;
	}
}
