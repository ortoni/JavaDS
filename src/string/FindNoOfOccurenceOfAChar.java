package string;

public class FindNoOfOccurenceOfAChar {

	public static void main(String[] args) {
		String name = "koushik";
		/**
		 * OP -> k - 2
		 */

		usingStream(name);
		usingLoop(name);
	}

	private static void usingLoop(String name) {
		char[] charArray = name.toCharArray();
		char toFind = 'k';
		int count = 0;
		for (char c : charArray) {
			if (c == toFind) {
				count++;
			}
		}
		System.out.println("Count of K is " + count);
	}

	private static void usingStream(String name) {
		long count = name.chars().filter(i -> i == 'k').count();
		System.out.println("Count of K is " + count);
	}


}
