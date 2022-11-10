package day6;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Test;



public class KeyBoardRow {
	@Test
	public void testCase1() {
		String[]  words = {"Hello","Alaska","Dad","Peace"};
		String[] findWords = findWords(words);
		Assert.assertArrayEquals(findWords, new String[]{"Alaska","Dad"});
	}
	
	
	 public String[] findWords(String[] words) {
	        ArrayList<String> ans = new ArrayList<String>();
	        for(int i=0;i<words.length;++i){    
	            String s = words[i].toLowerCase();
	            if(s.matches("^[qwertyuiop]*$") || s.matches("^[asdfghjkl]*$") || s.matches("^[zxcvbnm]*$")){
	                ans.add(words[i]);
	            }
	        }
	        String[] ret = new String[ans.size()];
	        return ans.toArray(ret);
	    }
}
