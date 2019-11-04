package interview;

public class SumOfNum {
	public static void main(String[] args) {
		sumOFFOdd(-100);
		sumOffEven(100);
	}

	static void sumOffEven(int num) {
		int sum = 0;
		for (int i = 0; i <= num; i++) {
			if (i % 2 == 1)
				sum += i;
		}
		System.out.println("Sum of Even is : " + sum);
	}

	static void sumOFFOdd(int num) {
		int sum = num;
		for (int i = 0; i <= 5; i++) {
			if (i % 2 != 0)
				sum += i;
		}
		System.out.println("Sum of Odd is : " + sum);
	}
}
