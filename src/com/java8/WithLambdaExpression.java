package com.java8;

public class WithLambdaExpression {
	public static void main(String[] args) {
		Runnable r= ()-> System.out.println("Thread is running");
		
		new Thread(r).start();
	}

}
