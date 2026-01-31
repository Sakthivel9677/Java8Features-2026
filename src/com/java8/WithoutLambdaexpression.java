package com.java8;

public class WithoutLambdaexpression {
	public static void main(String[] args) {
		Runnable r=new Runnable() {
			public void run() {
				System.out.println("Thread is running");
			}
		};
		new Thread(r).start();
	}
	

}
