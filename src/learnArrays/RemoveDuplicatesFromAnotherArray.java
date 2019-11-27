package learnArrays;

public class RemoveDuplicatesFromAnotherArray {

	/**
	 * Print which in not available in arr2
	 * 
	 * @author Koushik
	 */
	public static void main(String[] args) {
		char[] arr1 = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 's', 't'};
		char[] arr2 = {'a', 'b', 'b', 'd', 'f', 'g', 's', 'z', 'x'};
		char[] removeDuplicate = removeDuplicate(arr1, arr2);
		for (char c : removeDuplicate) {
			if (c != 0) {
				System.out.print(c);
			}
		}
	}

	static char[] removeDuplicate(char[] arr1, char[] arr2) {

		char[] tem = new char[arr1.length];

		for (int i = 0; i < arr2.length; i++) {
			int temp = 0;
			for (int j = 0; j < arr1.length; j++) {
				if (arr2[i] == arr1[j])
					temp++;
			}
			if (temp == 0)
				tem[i] = arr2[i];
			// System.out.println(arr2[i]);
		}

		for (int i = 0; i < arr1.length; i++) {
			int temp = 0;
			for (int j = 0; j < arr2.length; j++) {
				if (arr1[i] == arr2[j])
					temp++;
			}
			if (temp == 0) {
				tem[i] = arr1[i];
				// System.out.println(arr1[i]);
			}
		}
		return tem;

	}
}
