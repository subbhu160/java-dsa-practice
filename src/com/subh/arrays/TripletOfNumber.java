package com.subh.arrays;

import java.util.Arrays;

public class TripletOfNumber {

	public static void main(String[] args) {
		
		Integer arr[] = {-1,2,4,-5,8,-3,-5,-2,3,5};
	       Arrays.sort(arr);
	   
	    Integer k=8;
	    
	    Integer tripl[] = triplets(arr, k);
	    if(tripl==null) System.out.println("triplrt not found for value :"+k);
	    else System.out.println("triplrt  found for value : "+k+" is "+ Arrays.toString(tripl));
	    
	}
	    public  static Integer[] triplets(Integer arr[],Integer k)
	    {
	    	
	    Integer triplet[] = new Integer[3];
	    
	    
	    for(int i =0 ;i<arr.length;i++)
	    {
//	      int c= k-arr[i]-arr[i+1];
	      
	      for(int j=i+1;j<arr.length;i++)
	      {
	    	  
	    	  Integer c= k-arr[i]-arr[j];
	    	  
	    	  if(bser(c,arr))
	    	  {
	    		 triplet[0]=arr[i]; 
	    		 triplet[1]=arr[j]; 
	    		 triplet[2]=c; 
	    		 return triplet;
	    	  }
	      }
	    }
	    
	    return  triplet;
 
	}
	
	
	
	    public  static boolean bser(int  val,Integer arr[] )
	    {
	    	
	    	int low =0,high = arr.length-1,mid;
	    	
	    	
	    	while(low<=high)
	    	{
	    		
	    		mid = (low+high)/2;
	    		
	    		if(arr[mid]==val)  return true;
	    		
	    		else if(arr[mid]<val) low = mid+1;
	    		else high = mid-1;
	    	}
	    	return false;
	    }

}
