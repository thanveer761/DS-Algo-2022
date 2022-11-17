package day7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class FindAllAnagrams {
@Test
public void td1() {
	String s = "cbaebabacd", p = "abc";
	List<Integer> findAnagram = findAnagrams(s, p);
	System.out.println(findAnagram);

}
public List<Integer> findAnagrams(String s, String p) {
	List<Integer> list=new ArrayList<>();
    int start=0;
    int end=0;
    int ss[]=new int[26];
    int pp[]=new int[26];
    for(int i=0;i<p.length();i++) {
        pp[p.charAt(i)-'a']++;
    }
    for(end=0;end<s.length();end++){
        ss[s.charAt(end)-'a']++;        
        if(end>=p.length())
            ss[s.charAt(start++)-'a']--;
        if(Arrays.equals(pp,ss)) list.add(start);
        }
    return list;
    
}
}
