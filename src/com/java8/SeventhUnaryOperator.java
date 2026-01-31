package com.java8;

import java.util.function.UnaryOperator;

public class SeventhUnaryOperator {
	public static void main(String[] args) {
		UnaryOperator<Integer> multiply=n->n*5;
		System.out.println(multiply.apply(5));
	}

}
