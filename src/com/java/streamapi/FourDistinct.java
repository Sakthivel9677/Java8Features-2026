package com.java.streamapi;

import java.util.Arrays;
import java.util.List;

public class FourDistinct {
	public static void main(String[] args) {
		List<Integer> nums=Arrays.asList(1,2,2,2,2,2,2,2);
		nums.stream().distinct().forEach(System.out::println);
		
	}

}
