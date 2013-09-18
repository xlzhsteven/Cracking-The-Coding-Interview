package com.crackingCodingInterview.chapterOne;

import static org.junit.Assert.*;

import org.junit.Test;

public class UniqueCharTest {
	private String str;
	private UniqueChar uc = new UniqueChar();

	@Test
	public void testUnique() {
		str = "abcdefg";
		assertTrue(uc.unique(str));
	}
	
	@Test
	public void testOne(){
		str="aabbccdd";
		assertTrue(uc.unique(str));
	}
	
	@Test
	public void testTwo(){
		str=null;
		assertTrue(uc.unique(str));
	}

}
