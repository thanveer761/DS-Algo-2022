package day9;



import org.junit.Test;

public class FirstPalindromicString {
	@Test
	public void td1() {

		String[]words = {"abc","car","ada","racecar","cool"};
		String fp = firstPalindrome(words);
		System.out.println(fp);
	}
	@Test
	public void td2() {
		String[] words = {"notapalindrome","racecar"};
		String fp = firstPalindrome(words);
		System.out.println(fp);
	}

	public String firstPalindrome(String[] words) {
		for(int i=0; i<words.length;i++){
			StringBuilder sb = new StringBuilder();
			sb.append(words[i]);
			sb.reverse();
			if(words[i].equals(sb.toString())){
				return words[i];
			}
		}
		return "";
	}
}