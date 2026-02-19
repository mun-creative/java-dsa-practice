package com.practice.arrays;

import java.util.ArrayList;
import java.util.Arrays;
/*
 * Given an array arr[] containing only non-negative integers, your task is to 
 * find a continuous subarray (a contiguous sequence of elements) whose sum equals 
 * a specified value target. You need to return the 1-based indices of the leftmost
 *  and rightmost elements of this subarray. You need to find the first
 *  subarray whose sum is equal to the target.
 *  
 *  Input: arr[] = [1, 2, 3, 7, 5], target = 12
Output: [2, 4]
Explanation: The sum of elements from 2nd to 4th position is 12.
 */

public class SubArraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SubArraySum sum=new SubArraySum();
		int arr[] = {1, 2, 3, 7, 5};
		int target = 12;
		System.out.println(sum.subarraySum(arr, target));;
		

	}
	
	static ArrayList<Integer> subarraySum(int[] arr, int target) {
		int left=0;
		int sum=0;
		int n=arr.length;
		for(int right=0;right<n;right++)
		{
			sum+=arr[right];
			System.out.println("right:"+right);
			System.out.println("sum: "+sum);
			while(sum>target && left<right)
			{
				System.out.println("left:"+left);
				sum-=arr[left];
				left++;
			}
			System.out.println("sum:"+sum);
			
			if(sum==target)
			{
				ArrayList<Integer> result=new ArrayList<>();
				System.out.println("left:"+left);
				System.out.println("right:"+right);
				result.add(left+1);
				result.add(right+1);
				return result;
			}
		}
		
		return new ArrayList<>(Arrays.asList(-1));
		
	}
	

}
