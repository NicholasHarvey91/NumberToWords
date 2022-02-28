
public class NumberToWords {

	private static final int TENS_MULTIPLES_OFFSET = 2;
	private static final int TEENS_MULTIPLES_OFFSET = 10;
	private static final String[] DIGITS = new String[] {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten"};
	private static final String[] TEENS = new String[] {"Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
	private static final String[] TENS_MULTIPLES = new String[] {"Twenty", "Thirty", "Fourty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
	private static final String[] UNITS = new String[] {"Hundred", "Thousand", "Million"};
	
	// Recursive method to interpret the number given and build the string
	public static String convertToWords(int userInput) {
		StringBuilder str = new StringBuilder();
		int remainder;
		// Handling for digits and unique "teens" counting
		if (userInput < 20) {
			if (userInput < 10) {
				str.append(DIGITS[userInput]);
			}
			else {
				str.append(TEENS[userInput - TEENS_MULTIPLES_OFFSET]);
			}
		}
		else if (userInput < 100) {
			remainder = userInput % 10;
			str.append(TENS_MULTIPLES[(userInput / 10) - TENS_MULTIPLES_OFFSET]);
			if (remainder > 0) {
				str.append(" " + convertToWords(remainder));
			}
		}
		else if (userInput < 1000) {
			remainder = userInput % 100;
			str.append(DIGITS[userInput / 100] + " " + UNITS[0]);
			if (remainder > 0) {
				str.append(" " + convertToWords(remainder));
			}
		}
		else if (userInput < 1000000) {
			remainder = userInput % 1000;
			if (userInput / 1000 > 9) {
				str.append(convertToWords(userInput / 1000) + " " + UNITS[1]);
			}
			else {
				str.append(DIGITS[userInput / 1000] + " " + UNITS[1]);
			}
			if (remainder > 0) {
				str.append(" " + convertToWords(remainder));
			}
		}
		// The maximum that should be sent to the method is 1 million, so default to that if too large
		// Can always add handling similar to what's above to expand
		else {
			str.append(DIGITS[1] + " " + UNITS[2]);
		}
		return str.toString();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
