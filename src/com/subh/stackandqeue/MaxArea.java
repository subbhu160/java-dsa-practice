package com.subh.stackandqeue;

public class MaxArea {

	public static void main(String[] args) {
		
		Integer arr[]= {2,1,5,4,7,6,2,3,10,8,5,6,4,7,2,3};
		
		Integer maxarea = Integer.MIN_VALUE;
		
		for(int i=1;i<arr.length;i++)
		{
			int j=i-1,k=i+1,length=0;
			while(j>=0 && arr[j]>=arr[i])j--;
			while(k<arr.length && arr[k]>=arr[i])k++;
			length = k-j-1;
			
			maxarea=Math.max(maxarea,length*arr[i]);
			
			
		
		}
		
		System.out.println("Maximum continous  area of the given plot is :"+maxarea);
	
		
	}

}
