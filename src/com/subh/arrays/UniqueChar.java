package com.subh.arrays;

public class UniqueChar {

	
	public  static void getfirstnonr(String s)
	{
//		boolean unique;
		char c[] = s.toCharArray();
		for(int i=0;i<s.length()-1;i++)
		{
		
			boolean unique=true;
			for(int j=0;j<s.length()-1;j++)
			{
				
				if(i!=j && c[i]==c[j])
				{
					unique = false;
				break;
				}
			}
		
		
		if(unique)System.out.println(c[i]); 
	}
	}
	
	public static void main(String[] args) {
		
		String s = "swiss";
		getfirstnonr(s);

	}

}
