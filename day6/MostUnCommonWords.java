package day6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.Assert;
import org.junit.Test;

public class MostUnCommonWords {

	@Test
	public void testCase1() {
		String s1 = "this apple is sweet";
		String s2 = "this apple is sour";
		String[] mostCommWords1 = mostCommWords1(s1, s2);
		String[] mostCommWords2 = mostCommWords2(s1, s2);
		Assert.assertArrayEquals(mostCommWords1, new String[] { "sweet", "sour" });
		Assert.assertArrayEquals(mostCommWords2, new String[] { "sweet", "sour" });
	}

	public String[] mostCommWords1(String s1, String s2) {
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
	public String[] mostCommWords2(String s1, String s2) {
		Set<String> uniq = new HashSet<String>();
		Set<String> dupl = new HashSet<String>();
		for (String s : s1.split(" ")) {
			if (dupl.contains(s))
				continue;
			if (uniq.contains(s)) {
				dupl.add(s);
				uniq.remove(s);
				continue;
			} 
			uniq.add(s);
		}
		for (String s : s2.split(" ")) {
			if (dupl.contains(s))
				continue;
			if (uniq.contains(s)) {
				dupl.add(s);
				uniq.remove(s);
				continue;
			} 
			uniq.add(s);
		}

		String[] res = new String[uniq.size()];
		int i = 0;
		for (String s : uniq) {
			res[i++] = s;
		}
		return res;


	}
}
