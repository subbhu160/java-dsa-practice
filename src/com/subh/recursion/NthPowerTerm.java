package com.subh.recursion;

public class NthPowerTerm {

	
	public static int  pwerterm(int a,int n)
	{
		if (n==0)return 1;
		return (a*pwerterm(a,n-1));
	}
	
	public static void main(String[] args) {
	  int nth = pwerterm(2,30);
	  System.out.println("value for nth power of a is :"+nth);

	}

}
