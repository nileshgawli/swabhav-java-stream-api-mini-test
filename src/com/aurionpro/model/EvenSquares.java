package com.aurionpro.model;

import java.util.List;
import java.util.stream.Collectors;

public class EvenSquares {
	public static List<Integer> squareOfEvenNo(List<Integer> list) {
		List<Integer> result = list.stream().filter(x -> (x%2==0)).map(n -> n*n).collect(Collectors.toList());
		return result;
	}
}
