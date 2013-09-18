package com.crackingCodingInterview.chapterOne;

import static org.junit.Assert.*;

import org.junit.Test;

public class PermutationTest {
	Permutation p;

	@Test
	public void test() {
		p = new Permutation();
		String s1 = "Eat";
		String s2 = "Ate";
		assertTrue(p.permutation(s1, s2));
	}

}
