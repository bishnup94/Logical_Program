package com.qa.array;

import java.util.HashSet;

public class RemoveDuplicate {

	public static void main(String[] args) {
		int[] a= {1,2,9,5,1,2};
		HashSet<Integer> hs=new HashSet<Integer>();
		for(int i=0;i<a.length;i++)
		{
			hs.add(a[i]);
		}
		for(int n:hs)
		{
			System.out.println(n);
		}
	}
}
