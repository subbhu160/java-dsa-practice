package com.subh.hashmap;

import java.util.HashMap;
import java.util.Map;

public class TargetSum {
	
	public static void duplicates(int numb[] ,int targ)
	{
		Map<Integer, Integer> map = new HashMap<>();
		for(int num :numb)
		{
			int sum= targ-num;
			if(map.containsKey(sum))System.out.println(sum +" "+ num);
			map.put(num, 1);
		}
	}

	public static void main(String[] args) {
		
		int[] numbers = {2, 4, 3, 5, 7, 8, 1};
        int targetSum = 8;
        duplicates(numbers,targetSum);

	}

}
