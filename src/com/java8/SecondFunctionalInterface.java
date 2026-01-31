package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class SecondFunctionalInterface {
public static void main(String[] args) {
	Function<String,Integer> lengthFinder=s->s.length();
	System.out.println(lengthFinder.apply("Java"));
	Function<String,String> uppercase=s->s.toUpperCase();
	List<String> names=Arrays.asList("sakthi","muthu");
	names.stream().map(uppercase).forEach(System.out::println);
}
}

//Converts one type to another

//Used in map() operation