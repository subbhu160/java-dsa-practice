package com.subh.arrays;

public class Palindrome {

	public static void main(String[] args) {
		
		String s = "mama";
		char c[] = s.toCharArray();
		boolean b = true;
		
		for(int i=0;i<(s.length()-1)/2;i++)
		{
			if(c[i]!=c[(s.length()-1-i)])
				{
				System.out.println("inside if condition");
				b=false;
				}
			break;
		}
         if(b)System.out.println(s +" is a palindrome ");
         else System.out.println(s+ " is not a palindrome");
	}

}
