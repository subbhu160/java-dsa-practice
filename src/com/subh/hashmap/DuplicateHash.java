package com.subh.hashmap;

import java.util.*;
public class DuplicateHash {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10,1,2,3,4,5,6,7,-1,2,3,4,5,8,9,-4);
		Set<Integer> st = new HashSet<>(list);
		System.out.println(st);

	}

}
