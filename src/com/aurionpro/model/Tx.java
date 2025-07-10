package com.aurionpro.model;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Tx {

	private int year;
	private String trader;
	private int value;

	public Tx(int year, String trader, int value) {
		super();
		this.year = year;
		this.trader = trader;
		this.value = value;
	}

	public int getYear() {
		return year;
	}

	public String getTrader() {
		return trader;
	}

	public int getValue() {
		return value;
	}

	public static Map<Integer, List<String>> topTraders(List<Tx> txs) {
		return txs.stream()
				.collect(Collectors.groupingBy(tx -> tx.year,
						Collectors.collectingAndThen(
								Collectors.groupingBy(tx -> tx.trader, Collectors.summingInt(tx -> tx.value)),
								map -> map.entrySet().stream()
										.sorted(Comparator.comparingInt(Map.Entry<String, Integer>::getValue).reversed()
												.thenComparing(Map.Entry::getKey))
										.limit(3).map(Map.Entry::getKey).collect(Collectors.toList()))));
	}

}
