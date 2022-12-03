package day4;


import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.junit.Test;

public class MostCommonWords {

	@Test
	public void testCase1() {
		String paragraph = "Bob hit a ball, the hit BALL flew far after it was hit.";
		String[] banned = { "hit" };
		String op = mostCommWords(paragraph, banned);
		System.out.println(op);
	}
	/*public String mostCommWords(String paragraph, String[] banned) {

		Set<String> Banned_Words = new HashSet<String>();
		Map<String, Integer> Curr_Words = new HashMap<String, Integer>();
		for (String BanWord : banned) {
			Banned_Words.add(BanWord);
		}

		String[] words = paragraph.toLowerCase().split("\\W+");
		for (String currWord : words) {
			if (!Banned_Words.contains(currWord)) {
				Curr_Words.put(currWord, Curr_Words.getOrDefault(currWord, 0) + 1);
			}
		}
		int max = 0;
		String result = "";
		Set<String> keySet = Curr_Words.keySet();
		for (String currWord : keySet) {
			if (Curr_Words.get(currWord) > max) {
				max = Curr_Words.get(currWord);
				result = currWord;
			}

		}
		return result;
	}*/
	
	public String mostCommWords(String paragraph, String[] banned) {
	
	String[] words = paragraph.toLowerCase().split("\\W+");
    HashMap<String, Integer> map = new HashMap<>();
    for(String word : words) map.put(word, map.getOrDefault(word, 0) + 1);
    for(String word : banned) if(map.containsKey(word)) map.remove(word);
    String res = null;
    for(String word : map.keySet())
        if(res == null || map.get(word) > map.get(res))
            res = word;
    return res;
}
}
