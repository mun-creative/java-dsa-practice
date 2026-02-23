package com.practice.arrays;

import java.util.HashMap;
import java.util.Map;

/*Array NOT Sorted → Use HashMap
Intuition

Instead of searching for two numbers:

We reframe the problem:

For every number x, check if target - x already exists.

So while iterating:

Store numbers in a HashMap

Before inserting current number, check if its complement exists*/
public class TwoSumProblemWithoutSortedArray {
	
	public static void main(String[] args) {
		int arr[]= {2,11,15,7};
		
		int [] result=twoSum(arr, 9);
		for(int i=0;i<result.length;i++)
		{
			System.out.println(result[i]);
		}
		
	}
	
	public  static int[] twoSum(int[] nums, int target) {
		
		Map<Integer,Integer> map=new HashMap<>();
		for(int i=0;i<nums.length;i++)
		{
			int complement=target-nums[i];
			if(map.containsKey(complement))
			{
				return new int[] {map.get(complement)+1,i+1};
			}
			map.put(nums[i], i);
		}
		return new int[] {-1,-1};
	}
	}


