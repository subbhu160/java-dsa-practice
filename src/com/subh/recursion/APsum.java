package com.subh.recursion;

public class APsum {
	
	
	public  static int aprogsum(int a,int n,int d)
	{
		if(n==1)return a;
		
			return (a+(n-1)*d)+aprogsum(a, n-1, d);
		
	}

	public static void main(String[] args) {

      int aps = aprogsum(2, 4, 2);
   System.out.println("sum of the AP is "+aps);
	}

}
