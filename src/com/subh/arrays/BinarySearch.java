package com.subh.arrays;

public class BinarySearch {
	
	
//	binary search complexity is log base 2
//	to sort an array minimum possible time is  O(nlogn)
	public static boolean isElePresent(Integer a[],int n,int k)
	{
		int low=0,high=a.length-1,mid;
		
		
		
		while(low<=high)
		{
			mid =(low+high)/2;
			
			if(a[mid]==k)return true;
			else if (a[mid]>k)
			{
			 high=mid-1;	
			System.err.println(high);	
			}
			else 
			{
				low = mid+1;
			}
		}
		return false;
		
	}

	public static void main(String[] args) {
		
		Integer arr[] = {-10,-4,-2,-1,1,2,3,4,88};
		
		boolean isele= isElePresent(arr, arr.length, 90);
		System.out.println("ele 3 is present in given arrary or not :"+isele);
		
	}

}
