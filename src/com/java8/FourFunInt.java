package com.java8;

import java.util.function.Supplier;

public class FourFunInt {
	public static void main(String[] args) {
		Supplier<Double> randomvalue=(()->Math.random());
		System.out.println(randomvalue.get());
		
	}

}

//No input
//
//Returns value
//
//Used for lazy initialization