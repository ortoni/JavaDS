package all;

public class ToRomanNumbers {
	public static void main(String[] args) {
		
		System.out.println(toRoman(121));
		
	}
	static String toRoman(int num) {
		String[] thousands = new String[] {"", "M", "MM", "MMM"};
		String[] hundreds = new String[] {"", "C", "CC", "CCC"};
		String[] tens = new String[] {"", "X", "XX", "XXX"};
		String[] units = new String[] {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
		/*
		 * System.out.println(thousands[num /1000]); System.out.println(hundreds [(num %
		 * 1000)/100]); System.out.println(tens[(num%100)/10]);
		 * System.out.println(units[num%10]);
		 */
		return thousands[num /1000]+ hundreds[(num % 1000)/100]+ tens[(num%100)/10]+units[num%10];
	}
}
