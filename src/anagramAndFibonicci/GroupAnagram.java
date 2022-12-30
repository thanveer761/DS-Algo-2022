package anagramAndFibonicci;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

public class GroupAnagram {
	@Test
	public void td1() {

		String[] strs = { "eat", "tea", "tan", "ate", "nat", "bat" };
		List<List<String>> group = group(strs);
		System.out.println(group);
	}

	public List<List<String>> group(String[] strs) {
		Map<String, List<String>> mp = new HashMap<>();
		if (strs.length == 0) {
			return new ArrayList();
		}

		for (String s : strs) {
			char[] arr = s.toCharArray();
			Arrays.sort(arr);
			String key = String.valueOf(arr);
			if (!mp.containsKey(key)) {
				mp.put(key, new ArrayList());
			}
				mp.get(key).add(s);

		}
		return new ArrayList<>(mp.values());
	}

}
