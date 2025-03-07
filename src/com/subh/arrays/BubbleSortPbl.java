package com.subh.arrays;

import java.util.ArrayList;
import java.util.List;

public class BubbleSortPbl {

	public static void main(String[] args) {
		
		List<Integer> l = new ArrayList<>();
		l.add(12);
		l.add(17);
		l.add(19);
		l.add(10);
		l.add(9);
     
		
		for(int i=0;i<l.size();i++)
		{
			for(int j=i+1;j<l.size();j++)
			{
				if(l.get(i)>l.get(j))
				{
					int temp=l.get(i);
					l.set(i, l.get(j));
					l.set(j, temp);
				}
			}
		}
		
		
		System.out.println(l);
	}

}
