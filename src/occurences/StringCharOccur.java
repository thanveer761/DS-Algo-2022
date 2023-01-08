
package occurences;

import org.junit.Test;

public class StringCharOccur {

	@Test
	public void td1() {
		String m = "abbc";
		String op = stringocc1(m);
		System.out.println(op);

	}

	@Test
	public void td2() {
		String m = "abbbc";
		String op = stringocc1(m);
		System.out.println(op);

	}

	@Test
	public void td3() {
		String m = "aabbc";
		String op = stringocc1(m);
		System.out.println(op);

	}

	@Test
	public void td4() {
		String m = "aabbaa";
		// output===>3
		String op = stringocc1(m);
		System.out.println(op);

	}

	@Test
	public void td5() {
		String m = "aaabbbccaaad";
		// output==>4
		String op = stringocc1(m);
		System.out.println(op);

	}

	@Test
	public void td6() {
		String m = "abcdefg";
		String op = stringocc1(m);
		System.out.println(op);

	}

	public String stringocc1(String m) {

		StringBuilder sb = new StringBuilder();
		int start = 0, end = 0, count = 0;
		while (end < m.length()) {
			if (m.charAt(end) == m.charAt(start)) {
				count++;
				end++;

			} else if (m.charAt(end) != m.charAt(start)) {
				sb.append(count + "");
				sb.append(m.charAt(start));
				count = 0;
				start = end;
			}

		}
		sb.append(count + "");
		sb.append(m.charAt(start));
		return sb.toString();
	}
}
