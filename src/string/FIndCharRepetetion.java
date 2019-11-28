package string;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class FIndCharRepetetion {

	public static void main(String[] args) {
		String name = "koushiK";
		// System.out.println(name.compareTo("K"));

		// usingStreams(name);
		usingMap(name);
		// withOutUsingMap(name);


	}


	private static void withOutUsingMap(String name) {

		name = name.replaceAll("\\s", "").toUpperCase();
		int len = name.length();
		while (len > 0) {
			int count = 1;
			for (int j = 1; j < len; j++) {
				if (name.charAt(0) == name.charAt(j)) {
					count++;
				}
			}
			if (count > 1) {
				System.out.println(name.charAt(0) + " : " + count);
			}

			String character = String.valueOf(name.charAt(0)).trim();
			name = name.replaceAll(character, "");
			len -= count;

		}
	}


	private static void usingMap(String name) {
		char[] charArray = name.toCharArray();
		Map<Character, Integer> map = new LinkedHashMap<>();
		for (char c : charArray) {
			System.out.println((int) c);
			boolean containsKey = map.containsKey(c)
					|| map.containsKey((c) + 32);
			if (containsKey) {
				Integer integer = map.get(c);
				map.put(c, integer + 1);
			} else
				map.put(c, 1);
		}
		for (Entry<Character, Integer> c : map.entrySet()) {
			System.out.println(c.getKey() + "-->" + c.getValue());
		}

	}

	private static void usingStreams(String name) {
		Map<String, Long> map = Arrays.stream(name.split(""))
				.collect(Collectors.groupingBy(g -> g, Collectors.counting()));
		System.out.println(map);
	}

}
