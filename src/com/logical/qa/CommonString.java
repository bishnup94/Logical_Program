package com.logical.qa;

import java.util.HashSet;
import java.util.Set;

public class CommonString {

	public static void main(String[] args) {
		String[] s1 = { "java", "c", "hello", "maven" };
		String[] s2 = { "java", "123hi", "test", "maven" };
		Set<String> s = new HashSet<>();
		for (int i = 0; i < s1.length; i++) {
			for (int j = 0; j < s2.length; j++) {
				if (s1[i] == s2[j]) {
					s.add(s1[i]);
				}
			}
		}
		for (String p : s) {
			System.out.println(p);
		}
	}
}
