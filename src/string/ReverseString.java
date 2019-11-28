package string;

public class ReverseString {

	public static void main(String[] args) {
		String name = "reverse me";
		tyep1(name);
		type2(name);
		type3(name);
		type4(name);
		System.out.println(reverse("koushik"));

	}
	static String reverse(String s) {
		if (s.length() == 0)
			return "";
		return s.charAt(s.length() - 1)
				+ reverse(s.substring(0, s.length() - 1));
	}

	private static void type4(String name) {
		System.out.println(new StringBuilder(name).reverse());
	}

	private static void type3(String name) {
		String tem = "";
		String[] split = name.split("");
		for(int i = split.length -1; i >=0; i--) {
			tem += split[i];
		}
		System.out.println(tem);
	}

	private static void type2(String name) {
		String tem = "";
		char[] charArray = name.toCharArray();
		for (int i = name.length() - 1; i > -1; i--) {
			tem = tem + charArray[i];
		}
		System.out.println(tem);
	}

	private static void tyep1(String name) {
		String tem = "";
		for (int i = name.length() - 1; i >= 0; i--) {
			tem += name.charAt(i);
		}
		System.out.println(tem);
	}

}
