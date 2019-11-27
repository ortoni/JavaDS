package learnArrays;

import java.util.Arrays;
/*
 * author: Koushik Chatterjee
 * topic: Interview preparation
 */

public class RemoveDuplicates {

	public static void main(String[] args) {
		int[] input = new int[]{1, 1, 1, 3, 7, 7, 8, 6, 6, 90, 89, 9, 9, 10, 90,
				90};
		// usingStream(input);
		System.out.println();
		usingSort(input);
	}

	/*
	 * Fastest and easiest way using Java Stream in Collections
	 */
	static void usingStream(int[] arr) {
		/*
		 * IntStream stream = Arrays.stream(arr); stream.distinct().forEach(i ->
		 * System.out.print(i + " "));
		 */
		Arrays.stream(arr).distinct().forEach(i -> System.out.print(i + " "));
	}

	private static void usingSort(int[] input) {
		Arrays.sort(input);
		int current = input[0];
		for (int i = 0; i < input.length; i++) {
			if (current != input[i]) {
				System.out.print(current + " ");
				current = input[i];
			}
		}
		System.out.print(current);

		/*
		 * int current = input[0]; for (int i = 0; i < input.length; i++) { if
		 * (current != input[i]) { System.out.print(current + " "); current =
		 * input[i]; } } System.out.print(current);
		 */
	}

	/*
	 * not working
	 */
	static void remove(int[] arr) {
		int length = arr.length;
		int temp[] = new int[length];
		for (int i = 0; i < length; i++) {
			for (int j = 1; j < length; j++) {
				if (arr[i] == arr[j]) {
					temp[j] = arr[j];
				}
			}
		}
		for (int i : temp) {
			System.out.println(i);
		}
	}

}
