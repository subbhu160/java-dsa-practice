package com.subh.hashmap;

import java.util.ArrayList;

public class CustomMap {

	
	
	//hashinng techniques ->separate chaining(sc) we will use hasvaluse to store our value hasvalue
//	value is reperesent particular index number from 0 to 9 ;hash(x)=x%10--->reperesent index no where valuse will store 
//	hash function -> 1 it should be uniformly distributive
//	Easy to compute
//  DH =(h1(x)+h2(x))%capacity  h1-->some of digits%10  h2-->last digit 
//	ex 87 -> h1 = (8+7)%10 = 5  h2 -7 DH =(5+7)%10=2   means 87 will sotre in the 2nd index 
	
	
	ArrayList<ArrayList<Integer>> list;
	
	public CustomMap(int size) 
	{
		list = new ArrayList<ArrayList<Integer>>(size);
		
		for(int i=0;i<size;i++)
			list.add(new ArrayList<Integer>());
		
	}
	
	
	public int hashvalue(int x)
	{
		int key =(h1(x)+h2(x))%10;
		return key;
	}
	
	
	public int h1(int x)
	{
		return x%10;
	}
	public int h2(int x)
	{
		int sum=0;
		while(x>0)
		{
			sum+=(x%10);
		    x/=10;
		}
		
		return sum;
	}
	
	
	public boolean search(int value)
	{
		int key= hashvalue(value);
		ArrayList<Integer> al = list.get(key);
		 return al.contains(value);
	}
	
	
	public void insert (int value)
	{
		int key = hashvalue(value);
		System.out.println("key of "+value+"is "+key);
		ArrayList<Integer> al = list.get(key);
		if(!al.contains(value))al.add(value);
		
	}
	public static void main(String[] args) {

   
		
		CustomMap cs = new CustomMap(10);
		cs.insert(87);
		cs.insert(11);
		cs.insert(2);
		cs.insert(17);
		cs.insert(97);
		System.out.println(cs.search(87));
		System.out.println();
		System.out.println(cs);
	}


	@Override
	public String toString() {
		return list.toString();
	}
	
	

}
