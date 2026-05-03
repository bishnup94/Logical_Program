package com.qa.array;

public class SecondHighest {

	public static void main(String[] args) {
		int[] a= {11,2,4,5,22,22,33,33};
		int first=Integer.MIN_VALUE;
		int second=Integer.MIN_VALUE;
		
		for(int num:a)
		{
			if(num>first)
			{
				second=first;
				first=num;
			}
			else if(num>second && num!=first)
	
			{
				second=num;
			}
		}
		System.out.println("second highest number:"+ second);
	}
}
