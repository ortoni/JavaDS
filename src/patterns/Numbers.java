package patterns;

public class Numbers {

	public static void main(String[] args) {
		Number1.number(5);
	}
}

class Number1 {

	static void number(int n) {
		for (int j = 1; j <= n; j++) {
			for (int i = j; i <= n; i++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}

}
