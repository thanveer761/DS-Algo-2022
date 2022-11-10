package day6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class MostUnCommonWords {

	@Test
	public void testCase1() {
		String s1 = "this apple is sweet";
		String s2 = "this apple is sour";
		String[] mostCommWords = mostCommWords(s1, s2);
		Assert.assertArrayEquals(mostCommWords, new String[] { "sweet", "sour" });
	}

	public String[] mostCommWords(String s1, String s2) {

		String[] words1 = s1.toLowerCase().split("\\s");
		String[] words2 = s2.toLowerCase().split("\\s");
		HashMap<String, Integer> map = new HashMap<>();
		for (String wordA : words1)
			map.put(wordA, map.getOrDefault(wordA, 0) + 1);
		for (String wordB : words2)
			map.put(wordB, map.getOrDefault(wordB, 0) + 1);
		List<String> list = new ArrayList<>();
		for (String s : map.keySet())
			if (map.get(s) == 1)
				list.add(s);
		return list.toArray(new String[0]);

	}
}
