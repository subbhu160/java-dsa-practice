package com.subh.recursion;

public class Subarray {

	
	public static boolean subArray(int  arr[],int size,int target,int sum,int index)
	{
		
	
		if(index==size)
			return target==sum;
		
		return subArray(arr, size, target, sum+arr[index],index+1) | subArray(arr, size, target, sum,index+1);
	}
	public static void main(String[] args) {
		int a[] = {3,-4,8,10};
       System.out.println(subArray(a, a.length, 9, 0, 0));
	}

}
