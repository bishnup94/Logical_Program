package com.logical.string;

public class SwapString {
	public static void main(String[] args) {
		String a="hello";
		String b="world";
		a=a+b; //helloworld
		b=a.substring(0, a.length()-b.length()); //world
		a=a.substring(b.length()); //hello
		
		System.out.println(a);
		System.out.println(b);
	}
	

}
