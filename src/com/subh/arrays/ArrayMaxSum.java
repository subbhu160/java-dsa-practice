package com.subh.arrays;

import com.subh.stackandqeue.MaxArea;

public class ArrayMaxSum {
	
	public static int maxsum(int arr[])
	{
		int max =Integer.MIN_VALUE;
		int current=arr[0];
		
		for(int i=0;i<arr.length-1;i++)
		{
			current = Math.max(arr[i], current+arr[i]);
			max = Math.max(max, current);
		}
		
		return max;
	}
   
	public static void main(String[] args) {
		int s[] = {1,-3,4,-5,67,89,-67,53,90};
             System.out.println("maxsum of na array "+maxsum(s));
	}
}
