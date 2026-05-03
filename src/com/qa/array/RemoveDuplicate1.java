package com.qa.array;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicate1 {
	public static void main(String[] args) {
		int[] a= {1,2,9,5,1,2};
		Set<Integer> hs=new LinkedHashSet<Integer>();
		for(int num:a)
		{
			hs.add(num);
		}
		System.out.println(hs);
	}
}
