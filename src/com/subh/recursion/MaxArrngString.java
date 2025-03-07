package com.subh.recursion;

import java.util.ArrayList;

public class MaxArrngString {
	
	
	public static void generatearrag(String str)
	{
		ArrayList<String> result = new ArrayList<>();
		permuteHelper(result, str,"");
		for(String str1 :result)
		{
			System.out.println( str1);
		}
		System.out.println(result.size());
		
	}
	
	
	public static void permuteHelper(ArrayList<String> result,String str, String prefix)
	{
		if(str.length()==0)result.add(prefix);
		
		else
		{
			for(int i=0;i<str.length();i++)
			{
				permuteHelper(result,str.substring(0, i)+str.substring(i+1),  prefix+str.charAt(i));
			}
		}
	}

	public static void main(String[] args) {
	
		String s = "VINAY";
		
		generatearrag(s);

	}

}
