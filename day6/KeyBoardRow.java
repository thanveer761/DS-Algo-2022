package day6;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;



public class KeyBoardRow {
	@Test
	public void testCase1() {
		String[]  words = {"Hello","Alaska","Dad","Peace"};
		String[] findWords1 = findWords1(words);
		Assert.assertArrayEquals(findWords1, new String[]{"Alaska","Dad"});
		String[] findWords2 = findWords2(words);
		Assert.assertArrayEquals(findWords2, new String[]{"Alaska","Dad"});
	}
	
	


	public String[] findWords1(String[] words) {
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

	 private String[] findWords2(String[] words) {
		 List<String> result = new ArrayList<>();
	        String[] levels = {"qwertyuiop", "asdfghjkl", "zxcvbnm"};
	        for (String word : words) {
	            for (String level : levels) {
	                int lettersCount = word.length();
	                for (int k = 0; k < word.length(); k++) {
	                    char c = Character.toLowerCase(word.charAt(k));
	                    if (level.indexOf(c) < 0) {
	                        break;
	                    }
	                    lettersCount--;
	                }
	                if (lettersCount == 0) {
	                    result.add(word);
	                    break;
	                }
	            }
	        }
	        return result.toArray(new String[0]);
	}
}
