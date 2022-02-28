import static org.junit.Assert.*;

import org.junit.*;

public class NumberToWordsTest {

	@Test
	public void testZero() {
		int testParam = 0;
		String expectedValue = "Zero";
		String testValue = NumberToWords.convertToWords(testParam);
		assertEquals(expectedValue, testValue);
	}
	
	@Test
	public void testNine() {
		int testParam = 9;
		String expectedValue = "Nine";
		String testValue = NumberToWords.convertToWords(testParam);
		assertEquals(expectedValue, testValue);
	}
	
	@Test
	public void testTen() {
		int testParam = 10;
		String expectedValue = "Ten";
		String testValue = NumberToWords.convertToWords(testParam);
		assertEquals(expectedValue, testValue);
	}
	
	@Test
	public void testNineteen() {
		int testParam = 19;
		String expectedValue = "Nineteen";
		String testValue = NumberToWords.convertToWords(testParam);
		assertEquals(expectedValue, testValue);
	}
	
	@Test
	public void testTwenty() {
		int testParam = 20;
		String expectedValue = "Twenty";
		String testValue = NumberToWords.convertToWords(testParam);
		assertEquals(expectedValue, testValue);
	}
	
	@Test
	public void testNinetyNine() {
		int testParam = 99;
		String expectedValue = "Ninety Nine";
		String testValue = NumberToWords.convertToWords(testParam);
		assertEquals(expectedValue, testValue);
	}
	
	@Test
	public void testOneHundred() {
		int testParam = 100;
		String expectedValue = "One Hundred";
		String testValue = NumberToWords.convertToWords(testParam);
		assertEquals(expectedValue, testValue);
	}
	
	@Test
	public void testOneHundredOne() {
		int testParam = 101;
		String expectedValue = "One Hundred One";
		String testValue = NumberToWords.convertToWords(testParam);
		assertEquals(expectedValue, testValue);
	}
	
	@Test
	public void testOneHundredTen() {
		int testParam = 110;
		String expectedValue = "One Hundred Ten";
		String testValue = NumberToWords.convertToWords(testParam);
		assertEquals(expectedValue, testValue);
	}
	
	@Test
	public void testNineHundredNinetyNine() {
		int testParam = 999;
		String expectedValue = "Nine Hundred Ninety Nine";
		String testValue = NumberToWords.convertToWords(testParam);
		assertEquals(expectedValue, testValue);
	}
	
	@Test
	public void testOneThousand() {
		int testParam = 1000;
		String expectedValue = "One Thousand";
		String testValue = NumberToWords.convertToWords(testParam);
		assertEquals(expectedValue, testValue);
	}
	
	@Test
	public void testNineThousandNine() {
		int testParam = 9009;
		String expectedValue = "Nine Thousand Nine";
		String testValue = NumberToWords.convertToWords(testParam);
		assertEquals(expectedValue, testValue);
	}
	
	@Test
	public void testNineThousandNinetyNine() {
		int testParam = 9099;
		String expectedValue = "Nine Thousand Ninety Nine";
		String testValue = NumberToWords.convertToWords(testParam);
		assertEquals(expectedValue, testValue);
	}
	
	@Test
	public void testNineThousandNineHundred() {
		int testParam = 9900;
		String expectedValue = "Nine Thousand Nine Hundred";
		String testValue = NumberToWords.convertToWords(testParam);
		assertEquals(expectedValue, testValue);
	}
	
	@Test
	public void testNineThousandNineHundredNinety() {
		int testParam = 9990;
		String expectedValue = "Nine Thousand Nine Hundred Ninety";
		String testValue = NumberToWords.convertToWords(testParam);
		assertEquals(expectedValue, testValue);
	}
	
	@Test
	public void testNineThousandNineHundredNinetyNine() {
		int testParam = 9999;
		String expectedValue = "Nine Thousand Nine Hundred Ninety Nine";
		String testValue = NumberToWords.convertToWords(testParam);
		assertEquals(expectedValue, testValue);
	}
	
	@Test
	public void testTenThousand() {
		int testParam = 10000;
		String expectedValue = "Ten Thousand";
		String testValue = NumberToWords.convertToWords(testParam);
		assertEquals(expectedValue, testValue);
	}

	@Test
	public void testOneHundredThousand() {
		int testParam = 100000;
		String expectedValue = "One Hundred Thousand";
		String testValue = NumberToWords.convertToWords(testParam);
		assertEquals(expectedValue, testValue);
	}
	
	@Test
	public void testNineHundredNinetyThousand() {
		int testParam = 990000;
		String expectedValue = "Nine Hundred Ninety Thousand";
		String testValue = NumberToWords.convertToWords(testParam);
		assertEquals(expectedValue, testValue);
	}
	
	@Test
	public void testNineHundredNinetyNineThousand() {
		int testParam = 999000;
		String expectedValue = "Nine Hundred Ninety Nine Thousand";
		String testValue = NumberToWords.convertToWords(testParam);
		assertEquals(expectedValue, testValue);
	}
	
	@Test
	public void testNineHundredNinetyNineThousandNineHundred() {
		int testParam = 999900;
		String expectedValue = "Nine Hundred Ninety Nine Thousand Nine Hundred";
		String testValue = NumberToWords.convertToWords(testParam);
		assertEquals(expectedValue, testValue);
	}
	
	@Test
	public void testNineHundredNinetyNineThousandNineHundredNinety() {
		int testParam = 999990;
		String expectedValue = "Nine Hundred Ninety Nine Thousand Nine Hundred Ninety";
		String testValue = NumberToWords.convertToWords(testParam);
		assertEquals(expectedValue, testValue);
	}
	
	@Test
	public void testNineHundredNinetyNineThousandNineHundredNinetyNine() {
		int testParam = 999999;
		String expectedValue = "Nine Hundred Ninety Nine Thousand Nine Hundred Ninety Nine";
		String testValue = NumberToWords.convertToWords(testParam);
		assertEquals(expectedValue, testValue);
	}
	
	@Test
	public void testOneMillion() {
		int testParam = 1000000;
		String expectedValue = "One Million";
		String testValue = NumberToWords.convertToWords(testParam);
		assertEquals(expectedValue, testValue);
	}
	
}
