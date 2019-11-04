package learnArrays;

public class AdditonOfArray {
	public static void main(String[] args) {
		int[] ar = { 10, 20, 30, 8 };
		add(ar);
	}

	static void add(int[] arr) {
		int length = arr.length;
		int sum = 0;
		for (int i = 0; i < length; i++) {
			sum += arr[i];
		}
		System.out.println("Sum of Array is: " + sum);
	}

}
