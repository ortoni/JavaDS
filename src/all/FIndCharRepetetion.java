package all;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class FIndCharRepetetion {

	public static void main(String[] args) {
		String name = "koushik";
		// usingStreams(name);
		// usingMap(name);
		withOutUsingMap(name);
		// System.out.println(name);
	}

	private static void withOutUsingMap(String name) {
		char[] charArray = name.toCharArray();

	}


	private static void usingMap(String name) {
		char[] charArray = name.toCharArray();
		Map<Character, Integer> map = new LinkedHashMap<>();
		for (char c : charArray) {
			boolean containsKey = map.containsKey(c);
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
