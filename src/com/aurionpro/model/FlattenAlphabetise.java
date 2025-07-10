package com.aurionpro.model;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class FlattenAlphabetise {
	
	public static List<String> flattenAndSort(List<List<String>> nested) {
	    return nested.stream()
	        .flatMap(Collection::stream)
	        .filter(s -> s != null && !s.isBlank())
	        .sorted()
	        .collect(Collectors.toList());
	}

}


















//<T> Collector<T, ?, Set<T>> toImmutableLinkedSet() {
//    return Collector.of(
//        LinkedHashSet::new,
//        Set::add,
//        (s1, s2) -> { s1.addAll(s2); return s1; },
//        s -> Collections.unmodifiableSet(s)
//    );
//}
//
//// Usage & Test:
//List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 1, 2, 3, 4, 5);
//Set<Integer> result = list.stream().collect(toImmutableLinkedSet());
//// Should print [1, 2, 3, 4, 5]
//// Mutating result.add(6) should throw UnsupportedOperationException
//

//Map<Boolean, List<Integer>> partition(List<Integer> ints) {
//    return ints.stream().collect(
//        Collector.of(
//            () -> new Object() {
//                List<Integer> primes = new ArrayList<>();
//                Map<Boolean, List<Integer>> result = new HashMap<>(Map.of(true, new ArrayList<>(), false, new ArrayList<>()));
//            },
//            (acc, n) -> {
//                boolean isPrime = acc.primes.stream().allMatch(p -> n % p != 0);
//                acc.result.get(isPrime).add(n);
//                if (isPrime) acc.primes.add(n);
//            },
//            (a, b) -> {
//                throw new UnsupportedOperationException("Parallel not supported");
//            },
//            acc -> acc.result
//        )
//    );
//}

