package all;

public class PrimeNumers {

	public static void main(String[] args) {
		allPrime();
	}

	static void allPrime() {
		for (int i = 2; i <= 50; i++) {
			int temp = 0;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					temp++;
				}
			}
			if (temp == 0)
				System.out.println(i + " is a Prime Number");
		}
	}

	static int primeOne(int num) {
		if (num < 2) {
			System.out.println(num + " is not a prime number");
			return -1;
		}
		int temp = 0;
		for (int i = 2; i < num / 2; i++) {
			if (num % i == 0) {
				temp++;
			}
		}
		if (temp == 0)
			System.out.println(num + " is a Prime number");
		else
			System.out.println(num + " is not a prime number");
		return num;
	}

}
