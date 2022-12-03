package day9;



import org.junit.Test;

public class DuplicateCharGroup {
	@Test
	public void td5() {
		String m = "aaabbbccaaad";
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
					count = 0;
					start = end;
				}

			}
			sb.append(count + "");
			count = 0;
			start = end;
			return sb.toString();
}
}
