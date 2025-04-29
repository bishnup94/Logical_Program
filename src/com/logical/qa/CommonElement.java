package com.logical.qa;

public class CommonElement {
	public static void main(String[] args) {

		// WAP to find common element in 2 array
		int[] a = { 1, 5, 4, 7, 2 };
		int[] b = { 3, 9, 1, 2 };
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				if (a[i] == b[j]) {
					System.out.println(a[i]);
				}
			}
		}
	}
}
