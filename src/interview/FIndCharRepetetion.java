package interview;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class FIndCharRepetetion {

	public static void main(String[] args) {
		String name = "koushik";
		Map<String, Long> map = Arrays.stream(name.split(""))
				.collect(Collectors.groupingBy(g -> g, Collectors.counting()));
		System.out.println(map);
	}

}
