package occurences;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

import org.junit.Test;

public class OccurencesOfWords {
	
	@Test
	public void td1() {
		String a ="this is my new new is my this";
	occurencesOfWords(a);
	}
@Test
public void td2() {
	String a ="Mango Orange Mango Apple Orange Mango";
	occurencesOfWords(a);
}
@Test
public void td3() {
	String a ="";
	occurencesOfWords(a);
}
public void occurencesOfWords(String a) {
	
        String[] b = a.split(" "); // stored in array and splitted
        HashMap<String, Integer> freqMap = new LinkedHashMap<String, Integer>();
        for (int i = 0; i < b.length; i++) {
            String key = b[i];
            int freq = freqMap.getOrDefault(key, 0);
            freqMap.put(key, ++freq);
        }
        for (Entry<String, Integer> result : freqMap.entrySet()) {
            System.out.println(result.getKey() + "-" + result.getValue());
        }
        if(a.isEmpty()) {
    		System.out.println("the given string is empty");
    	}
    }

}
