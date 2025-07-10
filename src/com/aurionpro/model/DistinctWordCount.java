package com.aurionpro.model;

import java.util.List;

public class DistinctWordCount {
	public static long distinctCount(List<String> words) {
		long result = words.stream().map(String::toLowerCase).distinct().count();
		return result;
	}
}
