package learnArrays;

import java.util.Arrays;

public class WaveArray {
	/*
	 * int arr[] = { 2, 4, 6, 8, 10, 20 }; op = {4,2,8,6,20,10}
	 */

	public static void main(String[] args) {

		int arr[] = { 2, 4, 6, 8, 10, 20 };
		Arrays.sort(arr);
		for (int i = 0; i < arr.length - 1; i += 2) {
			doWave(arr, i);
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	private static void doWave(int[] arr, int i) {
		int temp = arr[i];
		arr[i] = arr[i + 1];
		arr[i + 1] = temp;
	}

}
