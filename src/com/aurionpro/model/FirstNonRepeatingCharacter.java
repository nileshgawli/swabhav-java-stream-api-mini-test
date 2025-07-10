package com.aurionpro.model;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class FirstNonRepeatingCharacter {

	public static Optional<Character> firstUnique(String s) {
		return s.toLowerCase().codePoints().mapToObj(cp -> (char) cp)
				.collect(Collectors.groupingBy(c -> c, LinkedHashMap::new, Collectors.counting())).entrySet().stream()
				.filter(e -> e.getValue() == 1).map(Map.Entry::getKey).findFirst();
	}
}
