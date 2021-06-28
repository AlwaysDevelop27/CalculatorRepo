package com.java.calculator;

public class Calculator extends Addition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=5;
		int b=6;
		Calculator c = new Calculator();
		Addition ax = new Addition();
		Subtract as = new Subtract();
		ax.add(a, b);
		as.sub(a,b);
		

	}

}
