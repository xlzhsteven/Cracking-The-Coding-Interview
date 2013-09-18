package com.crackingCodingInterview.chapterOne;

import java.util.Arrays;

public class Permutation {
	public boolean permutation(String s1, String s2){
		char[] c1 = s1.toLowerCase().toCharArray();
		Arrays.sort(c1);
		char[] c2 = s2.toLowerCase().toCharArray();
		Arrays.sort(c2);
		boolean check = true;
		
		if (s1.length()!=s2.length()) {
			check = false;
		} else {
			for (int i = 0; i < c1.length; i++) {
				if (c1[i]!=c2[i]) {
					check = false;
				}
			}
		}
		return check;
	}
}
