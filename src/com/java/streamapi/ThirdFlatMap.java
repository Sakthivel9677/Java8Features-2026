package com.java.streamapi;

import java.util.Arrays;
import java.util.List;

public class ThirdFlatMap {
public static void main(String[] args) {
	List<List<Integer>> data = Arrays.asList(
		    Arrays.asList(1,2),
		    Arrays.asList(3,4)
		);
	data.stream().flatMap(List::stream).forEach(System.out::println);
	
	List<List<String>> data1=Arrays.asList(Arrays.asList("apple","orange","guava","grapes"),Arrays.asList("apple1","orange1","guava1","grapes1"));
	data1.stream().flatMap(List::stream).forEach(System.out::println);
	
}
}

//We use flatMap when map() produces a nested structure (like Stream of Streams).
//flatMap flattens it into a single stream so we can process elements easily.