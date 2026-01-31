package com.java8;

import java.util.function.Consumer;

public class ThirdFunIt {
	public static void main(String[] args) {
		Consumer<String> printvalue=s->System.out.println(s);
		printvalue.accept("String is okay");
		Consumer<Integer> printval=s->System.out.println(s);
		printval.accept(1);
		
	}

}

//Takes input
//
//Returns nothing
//
//Used in logging, printing, notification