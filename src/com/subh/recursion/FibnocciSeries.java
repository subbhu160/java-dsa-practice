package com.subh.recursion;

public class FibnocciSeries {
	
	public  static int  fbnseries(int n)
	{
		
		if (n==1 || n==2)
			{
			return 1;
			}
		return fbnseries(n-1)+fbnseries(n-2);
	}

	public static void main(String[] args) {
		int num =fbnseries(5);
		System.out.println(num);
	}

}
