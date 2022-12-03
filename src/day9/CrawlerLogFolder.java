package day9;

import org.junit.Test;

public class CrawlerLogFolder {

	@Test
	public void td1() {
	String[]	logs = {"d1/","d2/","../","d21/","./"};
int crawLog = crawLog(logs);
System.out.println(crawLog);
	}
	@Test
	public void td2() {
		String[]	logs = {"d1/","d2/","./","d3/","../","d31/"};
		int crawLog = crawLog(logs);
		System.out.println(crawLog);
	}


public int crawLog(String[] logs) {
int res = 0;
for (String s : logs) {
    if (s.equals("../")) res = Math.max(0, --res);
    else if (s.equals("./")) continue;
    else res++;
}
return res;
}}