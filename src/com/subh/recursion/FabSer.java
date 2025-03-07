package com.subh.recursion;

public class FabSer {

	
	public static void printFabnocci(int val1,int val2, int num)
	{
		if(num==0)return;
		
		System.out.print(val1 +val2 +",");
		
		printFabnocci(val2, val1+val2, --num);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        printFabnocci(1, 0, 10);
        printFabnocci2(1,0,12);
	}
	
	public static void printFabnocci2(int v1,int v2, int num)
	{
		if(num==0)return;
		System.out.print(v1+v2+",");
		printFabnocci2(v2,v2+v1,--num);
	}

}
