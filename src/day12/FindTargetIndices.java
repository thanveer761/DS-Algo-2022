package day12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class FindTargetIndices {
	@Test
	public void td1() {
		
		int[] nums = { 1,2,5,2,3 };
		int target = 2;
		List<Integer> op = targetIndices(nums, target);
		System.out.println(op);
	}

	@Test
	public void td2() {
		int[] nums = { 1,2,5,2,3};
		int target = 3;
		 List<Integer> op = targetIndices(nums, target);
		System.out.println(op);
	}
	public List<Integer> targetIndices(int[] nums, int target) {
	    ArrayList<Integer> li=new ArrayList<>();
	        int len=nums.length;
	        Arrays.sort(nums);
	        for(int i=0;i<len;i++){
	            if(nums[i]==target){
	                li.add(i);
	            }
	            if(!li.isEmpty()&&nums[i]!=target)
	                break;
	        }
	        return li;
	}
}
