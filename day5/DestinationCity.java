package day5;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;

public class DestinationCity {

	@Test
	public void testCase1() {
		String[][] paths = { { "London", "New York" }, { "New York", "Lima" }, { "Lima", "Sao Paulo" } };
		
	}

	@Test
	public void testCase2() {
		
		String[][] paths = {{"B","C" ,"D", "B" ,"C","A" }};
		
	}

	public String destinationCity(List<List<String>> paths) {
		Map<String, Integer> map = new HashMap<>();
		for (int i = 0; i < paths.size(); i++) {
			map.put(paths.get(i).get(0), 1);
		}

		for (int i = 0; i < paths.size(); i++) {
			if (map.get(paths.get(i).get(1)) == null) {
				return paths.get(i).get(1);
			}
		}

		return "";

	}
}
