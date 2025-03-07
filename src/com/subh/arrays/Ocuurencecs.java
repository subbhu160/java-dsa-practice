package com.subh.arrays;

public class Ocuurencecs {

	public static void main(String[] args) {
		
		String s ="iam indian i am living in india";
		
		char c[] = s.toCharArray();
		for(int i=0;i<c.length;i++)
		{
			if(c[i]=='?')continue;
			int count =1;
			for(int j=i+1;j<c.length;j++)
			{
				
				if(c[i]==c[j])
			
				{
					count++;
					c[j]='?';
					
//					System.out.println(c[j]);
				}
			}
			System.out.println(c[i]+"  occurance is :"+count);
//			System.out.println("count of "+c[i]+"is "+count);

		}
		
		
		
//		String s= "suuuus";
//	       char ch[]=s.toCharArray();
//	       System.out.println(ch);
//	       for(int i=0;i<ch.length;i++)
//	       {
//	           if(ch[i] == '?') continue;
//	           int count=1;
//	           for(int j=i+1;j<ch.length;j++)
//	           {
//	               if(ch[i]==ch[j])
//	               {
//	                   count++;
//	                   ch[j]='?';
//	               }
//	           }
//	           
//	           System.out.println(ch[i]+"  occurance is :"+count);
//	       }
//	    }

	}

}
