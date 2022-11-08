package day5;

import java.util.ArrayList;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class NumberDisappearedinArray {

	@Test
	public void testCase1() {
		int[] nums = { 4, 3, 2, 7, 8, 2, 3, 1 };
		List<Integer> findDisappearedNumbers = findDisappearedNumbers(nums);
		Assert.assertEquals((findDisappearedNumbers), new int[] {5,6});
	}

	@Test
	public void testCase2() {

		int[] nums = { 1, 1 };
List<Integer> findDisappearedNumbers = findDisappearedNumbers(nums);
Assert.assertEquals((findDisappearedNumbers), new int[] {2});
	}

	 public List<Integer> findDisappearedNumbers(int[] nums) {
		 List<Integer> lt=new ArrayList<Integer>();
		 int[] store=new int[nums.length+1];

		     for(int i=0;i<nums.length;i++)
		         ++store[nums[i]];
		     
		     for(int j=1;j<store.length;j++)
		         if(store[j]==0)
		             lt.add(j);
		     
			return lt;
		     
	    }
	}
