package com.subh.stackandqeue;

import java.util.Arrays;
import java.util.*;

public class ReversASent {

	public static void main(String[] args) 
	{
		
		String s = "India is moving towards AI";
		
		String s1[] = s.split(" ");
		System.out.println(Arrays.toString(s1));
		Stack<String > rev = new Stack<>();
		Stack<String>  send= new Stack<>();
		for(String data:s1)
		{
			
			rev.push(data);
			
		}
		
		
		
		
		System.out.println("revese of "+s+"is  "+send);
		

	}

}
