package com.crackingCodingInterview.chapterOne;

import java.util.Arrays;

public class UniqueChar {

	public boolean unique(String str) {
		boolean check = true;
		char[] character = str.toLowerCase().toCharArray();
		Arrays.sort(character);

		if (str.length() == 0) {
			check = false;
			return check;
		} else {
			for (int i = 0; i < character.length - 1; i++) {
				if (character[i] == character[i + 1]) {
					check = false;
				}
			}
			return check;
		}
	}
}
