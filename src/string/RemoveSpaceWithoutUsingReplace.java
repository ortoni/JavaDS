package string;

public class RemoveSpaceWithoutUsingReplace {
	public static void main(String[] args) {
		String str = "hey remove the spaces";
		type1(str);
		type2(str);
		type3(str);
	}

	private static void type3(String str) {
		char remove = ' ';
		int length = str.length();
		String tem = "";
		for (int i = 0; i < length; i++) {
			char c = str.charAt(i);
			if (c != remove)
				tem += c;
		}
		System.out.println(tem);
	}

	private static void type2(String str) {
		char remove = ' ';
		char[] charArray = str.toCharArray();
		String tem = "";
		for (char c : charArray) {
			if (c != remove)
				tem += "" + c;
		}
		System.out.println(tem);

	}

	private static void type1(String str) {
		String[] split = str.split(" ");
		String tem = "";
		for (String string : split) {
			tem += string;
		}
		System.out.println(tem);
	}

}
