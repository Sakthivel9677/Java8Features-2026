package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;

public class SixthBIfUNCTION {
	public static void main(String[] args) {
		BiFunction<Integer,Integer,Integer> sum=(a,b)->a+b;
		System.out.println(sum.apply(12, 18));
		List<String> names=Arrays.asList("sakthi","muthu");
		BiFunction<String,String,String> nameUppercase=(a,b)->a.toLowerCase()+a.toUpperCase();
		
		names.stream().map(name->nameUppercase.apply(name, name)).forEach(System.out::println);
	}

}
