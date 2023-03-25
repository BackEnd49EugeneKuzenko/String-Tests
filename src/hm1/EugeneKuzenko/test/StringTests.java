package hm1.EugeneKuzenko.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class StringTests {

//1 ********************* str.charAt(0) **********************	
	@Test
	void testCharAt() {
		assertEquals('S', "Sunrise".charAt(0));
		assertEquals('i', "Sunrise".charAt(4));
	}

// *********************  Disabled  ******************   // corrected
	@Test
	@Disabled
	void testCharAt2() {
		assertEquals('x', "".charAt(0));
		assertEquals('x', "Java".charAt(-1));
		assertEquals('x', "Java".charAt(7));
	}

//2 ********************* myStr1.compareTo(myStr2) **********************	
	@Test
	void testCompareTo() {
		assertEquals(0, "Sunrise".compareTo("Sunrise"));
		assertEquals(-1, "Sunris".compareTo("Sunrise"));
		assertEquals(1, "Sunrise".compareTo("Sunris"));
	}

//3 ********************* myStr1.compareToIgnoreCase(myStr2) **********************
	@Test
	void testCompareToIgnoreCase() {
		assertEquals(0, "Sunrise".compareToIgnoreCase("Sunrise"));
		assertEquals(0, "sunrise".compareToIgnoreCase("Sunrise"));
		assertEquals(0, "Sunrise".compareToIgnoreCase("sunrise"));
		assertTrue("Sunris".compareToIgnoreCase("Sunrise") < 0);
		assertFalse("Sunris".compareToIgnoreCase("Sunrise") > 0);
	}

//4 ********************* firstName.concat(lastName) **********************
	@Test
	void testConcat() {
		assertEquals("Sunrise", "Sun".concat("rise"));
		assertEquals("Sun rise", "Sun".concat(" rise"));

//****** corrected  ***************
		assertEquals("Sunrise", "".concat("Sunrise"));
		assertEquals("Sunrise", "Sunrise".concat(""));
	}

//5 ********************* "Hello".startsWith("He") **********************	
	@Test
	void testStartsWith() {
		assertTrue("Sunrise".startsWith("S"));
		assertTrue("Sunrise".startsWith("Sunrise"));
		assertFalse("Sunrise".startsWith("un"));
		assertFalse("Sunrise".startsWith("sunrise"));

//********  corrected  ******************************	
		assertTrue("Sunrise".startsWith(""));

	}

//6 ********************* "Hello".endsWith("o") **********************	
	@Test
	void testEndsWith() {
		assertTrue("Sunrise".endsWith("e"));
		assertFalse("Sunrise".endsWith("s"));
		assertFalse("Sunrise".endsWith("sunrise"));

//*********************  corrected  ******************************
		assertTrue("Sunrise".endsWith(""));
	}

//7 ********************* "Hello".contains("e") **********************
	@Test
	void testContains() {
		assertTrue("Sunrise".contains("Su"));
		assertTrue("Sunrise".contains("nri"));
		assertFalse("Sunrise".contains("uni"));
		assertFalse("Sunrise".contains("sun"));
	}

//8 ********************* "Hello".indexOf("e") **********************
	@Test
	void testIndexOf() {
		assertEquals(0, "Sunrise".indexOf("Sun"));
		assertEquals(3, "Sunrise".indexOf("ri"));
		assertEquals(4, "Sun rise".indexOf("rise"));
		assertEquals(2, "hello".indexOf("llo"));
		assertEquals(-1, "Sun".indexOf("sun"));
		assertEquals(-1, "Sun".indexOf("rise"));
	}

//9 ********************* "Hello".lastIndexOf("l") **********************	
	@Test
	void testLastIndexOf() {
		assertEquals(5, "Sunrise".lastIndexOf("s"));
		assertEquals(0, "Sunrise".lastIndexOf("S"));
		assertEquals(6, "Sun rise".lastIndexOf("s"));
		assertEquals(3, "hello".lastIndexOf("l"));
		assertEquals(-1, "Sun".lastIndexOf("s"));
		assertEquals(-1, "Sun".lastIndexOf("r"));
	}
}
