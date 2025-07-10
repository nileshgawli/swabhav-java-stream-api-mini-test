package com.aurionpro.model;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapVsFlatmap {

	public static List<List<String>> wordsBySentence(List<String> sentences) {
	    return sentences.stream()
	        .map(s -> Arrays.asList(s.split("\\s+")))
	        .collect(Collectors.toList());
	}
	
	public static List<String> allUniqueSortedWords(List<String> sentences) {
	    return sentences.stream()
	        .flatMap(s -> Arrays.stream(s.split("\\s+")))
	        .distinct()
	        .sorted()
	        .collect(Collectors.toList());
	}
	
	
}
