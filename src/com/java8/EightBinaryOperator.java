package com.java8;

import java.util.function.BinaryOperator;

public class EightBinaryOperator {
	public static void main(String[] args) {
		BinaryOperator<Integer> multiply=(a,b)->a*b;
		System.out.println(multiply.apply(12, 12));
	}

}
