package com.subh.arrays;

public class SumOfArr {
	
	public int missingno(int a[],int n)
	{
		
		
		for(int i=1;i<=(n+1);i++)
		{
			boolean miss = false;
			for(int j=0;j<n;j++)
			{
				if(i==a[j])miss=true;
//				break;
			}
			
			if(!miss)return i;
		}
	return 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {1,2,3,4,5,6,8,11,10,9};
		SumOfArr s= new SumOfArr();
		int sumarr =s.missingno(a,a.length);
		System.out.println("Sum of arraysel is :"+sumarr);

	}

}
