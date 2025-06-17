package com.logical.qa;

public class Merge2Array {
	public static void main(String[] args) {
		int[] a1 = { 1, 5, 4, 7, 2 };
		int[] a2 = { 3, 9, 1, 2 };
		int c=a1.length+a2.length;
		int[] a3=new int[c];
		for(int i = 0;i<a1.length;i++)
		{
			a3[i]=a1[i];
		}
		for(int i=0;i<a2.length;i++)
		{
			a3[a1.length+i]=a2[i];
		}
		for(int k=0;k<a3.length;k++)
		{
			System.out.println(a3[k]+" ");
		}
	}
}
