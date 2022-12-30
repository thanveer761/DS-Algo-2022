package day12;

import java.util.Arrays;

import org.junit.Test;

public class MaxUnitTruck {
	@Test
	public void td1() {
	int[][]	boxTypes = {{1,3},{2,2},{3,1}}; int truckSize = 4;
	int op = maximumUnits(boxTypes, truckSize);
	System.out.println(op);
	}
	@Test
	public void td2() {
		int[][]	boxTypes = {{5,10},{2,5},{4,7},{3,9}}; int truckSize = 10;
		int op = maximumUnits(boxTypes, truckSize);
		System.out.println(op);
	}
	/*Sort the array in decreasing order(Using Lambda Exp i.e. Comparator) with respect to its second column (i.e. UnitsPerBoxes).. So, that we can always put max units per box first.. this makes it Greedy approach

	Run a loop till Array.length and trucksize >0
	add to total capacity, substract the current truckSize by current taken capacity.. for last iteration take current left capacity and units of current types' units per boxes.

	return total
*/

	    public int maximumUnits(int[][] boxTypes, int truckSize) {
	        Arrays.sort(boxTypes, (a, b) -> b[1] - a[1]);
	        int total = 0;
	        int i = 0;
	        while(truckSize > 0 && i<boxTypes.length){
	            if(truckSize >= boxTypes[i][0]){
	                total = total + (boxTypes[i][0] * boxTypes[i][1]);
	                truckSize -=  boxTypes[i][0];
	                i++;
	            } else if(truckSize < boxTypes[i][0]){
	                total = total + (truckSize * boxTypes[i][1]);
	                truckSize = 0;
	            }
	        }
	        return total;
	    }
}
