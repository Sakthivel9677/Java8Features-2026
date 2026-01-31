package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class onePredicateFunctionalInt {
	public static void main(String[] args) {
		Predicate<Integer> isEven = n->n%2 ==0;
		System.out.println(isEven.test(12));
		System.out.println(isEven.test(9));
		
		List<Integer> nums=Arrays.asList(1,2,3,4,5,6);
		Predicate<Integer> result=n->n>5;
		nums.stream().filter(result).forEach(System.out::println);
		
		
		
	}

}
//Checks a condition

//Mostly used in filter() in Stream API
