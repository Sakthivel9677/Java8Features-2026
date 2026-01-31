package com.java.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class onefilter {
public static void main(String[] args) {
	List<Integer> nums=Arrays.asList(12,14,16,18,19);
	Predicate<Integer> fournumbers=n->n%4==0;
	nums.stream().filter(fournumbers).forEach(System.out::println);
}
}
