package interview;

public class FibonacciSeries {
	public static void main(String[] args) {
		fibonacci(10);
		uptoFibo(10);
	}

	static void uptoFibo(int n) {
		int first = 0, second = 1;
		int temp = 0;
		while (temp <= n) {
			first = second;
			second = temp;
			System.out.print(temp + " + ");
			temp = first + second;
		}
	}

	static void fibonacci(int n) {
		int first = 0, second = 1;
		System.out.print("Fibonacci - " + first);
		for (int i = 0; i <= n; i++) {
			int temp = first + second;
			first = second;
			second = temp;
			System.out.print(" " + temp);
		}
		System.out.println();
	}

}
