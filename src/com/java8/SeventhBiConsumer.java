package com.java8;

import java.util.function.BiConsumer;

public class SeventhBiConsumer {
	public static void main(String[] args) {
		BiConsumer<String,Integer> names=(name,age)->System.out.println(name+""+age);
		names.accept("sakthi", 30);
	}

}
