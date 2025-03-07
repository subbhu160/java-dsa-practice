package com.subh.stackandqeue;

import java.util.Scanner;
import java.util.Stack;

public class GetMaxEle {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Stack<Integer> s1 = new Stack<Integer>();
		Stack<Integer>  s2 = new Stack<Integer> ();
		
		System.out.println("enter your operation u want to that/n"+"1 insert an element /n"+"1 getmax an element /n"+"3 remove  an element /n");
		
		int n = sc.nextInt();
		while(n!=-1)
		{
			
			switch(n)
			{ 
			
			case 1-> {System.out.println("Enter element to enter");
			         Integer data =sc.nextInt();
			         s1.push(data);
			         if(s1.size()==1)s2.push(data);
			         else if(data>s2.peek())s2.push(data);
			         else s2.push(s2.peek());
			         break;
			      }
			
			case 2-> {
				System.out.println("max element is "+s2.peek()+"/nElements of stackes1 "+s1+"/nElements of stackes2 "+s2);
			break;
	         
			}
			case 3->
			{
				System.exit(-1);
				
			}
			}
			System.out.println("Enter your operation (1, 2, 3) or -1 to exit:");
            n = sc.nextInt();
		}
	}

}
