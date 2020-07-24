package com.vnr.tddtask;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RemoveFirst2Chars {
	
	RemoveFirst2Ch removeFirst2Ch;
	@BeforeEach
	void setUp() {
		removeFirst2Ch=new RemoveFirst2Ch();
	}
	@Test
	void test2Chars1() {
		
		assertEquals("BCD",removeFirst2Ch.remove("ABCD"));
	}
	@Test
	void test2Chars2() {
		
		assertEquals("CD",removeFirst2Ch.remove("AACD"));
	}
	@Test
	void test2Chars3() {
		
		assertEquals("BCD",removeFirst2Ch.remove("BACD"));
	}
	@Test
	void test2Chars4() {
		
		assertEquals("BBAA",removeFirst2Ch.remove("BBAA"));
	}
	@Test
	void test2Chars5() {
		
		assertEquals("BAA",removeFirst2Ch.remove("AABAA"));
	}
}
