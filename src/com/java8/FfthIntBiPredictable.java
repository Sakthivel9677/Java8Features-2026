package com.java8;

import java.util.function.BiPredicate;

public class FfthIntBiPredictable {
	public static void main(String[] args) {
		BiPredicate<Integer,Integer> issumeven=(a,b)->(a+b)%2==0;
		System.out.println(issumeven.test(8,12));
		
		
	}

}
//Takes two arguments
//
//Returns boolean