package com.practice.arrays;

/*Given an array of positive integers nums and a positive integer target, 
return the minimal length of a subarray whose sum is greater than or equal to targe
		t. If there is no such subarray, return 0 instead.
		
		*
		*
Example 1:

Input: target = 7, nums = [2,3,1,2,4,3]
Output: 2
Explanation: The subarray [4,3] has the minimal length under the problem constraint.
Example 2:

Input: target = 4, nums = [1,4,4]
Output: 1
		*/
public class MinimumSubArrayLength {
    public int minSubArrayLen(int target, int[] arr) {
        int left=0;
		int sum=0;
		int minLen=Integer.MAX_VALUE;
		for(int right=0;right<arr.length;right++)
		{
			sum+=arr[right];
			
			while(sum>=target)
			{
				minLen=Math.min(minLen,right-left+1);
				sum-=arr[left];
				left++;
			}		
			
			
		}
		
		return (minLen==Integer.MAX_VALUE)?0:minLen;
		
        
    }
}