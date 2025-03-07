package com.subh.arrays;

public class SlidingwindowSum {

	
	public  static void getele(int size,Integer arr[],int target)
	{
		int low=0,high=size-1;
		Integer arr2[] = new Integer[2];
		while(low<high)
			
		{
			
			int sum =(arr[low]+arr[high]);
			if(sum==target)
			{
				arr2[0]=arr[low];
				arr2[1]=arr[high];
			System.out.println("pairs of  elements whose sum is equal to "+target +" = "+arr[low]+"  "+arr[high]);
			low++;high--;
			}
			else if(sum<target)low++;
			else high--;
			
		}
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Integer arr[] = {1,3,4,6,8,9,10,11,12,15};
          getele(arr.length, arr, 18);
//          if(pair==null)System.out.println("no pairs found for target value");
	}

}
