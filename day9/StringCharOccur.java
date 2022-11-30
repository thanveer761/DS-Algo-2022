
package day9;

import org.junit.Test;

public class StringCharOccur {

	@Test
	public void td1() {
		String m = "abbc";
		int op = stringocc(m);
		System.out.println(op);
	}

	@Test
	public void td2() {
		String m = "abbbc";
		int op = stringocc(m);
		System.out.println(op);
	}

	@Test
	public void td3() {
		String m = "aabbc";
		int op = stringocc(m);
		System.out.println(op);
	}

	@Test
	public void td4() {
		String m = "aabbaa";
		int op = stringocc(m);
		System.out.println(op);
	}

	@Test
	public void td5() {
		String m = "aaabbbccaaad";
		int op = stringocc(m);
		System.out.println(op);
	}

	@Test
	public void td6() {
		String m = "abcdefg";
		int op = stringocc(m);
		System.out.println(op);
	}

	public int stringocc(String m) {
		int count=0;
		for (int i = 0; i < m.length(); i++) {
			for (int j = i+1; j < m.length(); j++) {
				if(m.charAt(i)!=m.charAt(j)) {
					count+=m.charAt(i)-'a';
				}
			}
		}
		/*
		 * int count, repChars = 0; int strLen = m.length(); char[] arr = new
		 * char[strLen]; for (int i = 0; i < strLen; i++) { arr[i] = m.charAt(i); } for
		 * (int i = 0; i < strLen; i++) { count = 0; for (int j = i + 1; j < strLen;
		 * j++) { if (arr[i] == arr[j]) { count++; for (int k = j; k < strLen - 1; k++)
		 * arr[k] = arr[k + 1]; strLen--; j--; } } if (count > 0) repChars++; } return
		 * repChars;
		 */
		return count;
	}
}
