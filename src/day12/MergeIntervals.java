package day12;

import org.junit.Test;

public class MergeIntervals {
@Test
public void td1() {
	int[][] intervals = {{1,3},{2,6},{8,10},{15,18}};
	int[][] op = mergeIntervals(intervals);
	System.out.println(op);
}
@Test
public void td2() {
	int[][] intervals = {{1,4},{4,5}};
	int[][] op = mergeIntervals(intervals);
	System.out.println(op);
}
public int[][] mergeIntervals(int[][] intervals) {
	return intervals;
	

}
}
