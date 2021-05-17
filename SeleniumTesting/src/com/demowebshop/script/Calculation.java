package com.demowebshop.script;

public class Calculation {

	public void Addition(int a, int b) {
		System.out.println(a + b);
	}

	public void substraction(int a, int b) {
		System.out.println(a - b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculation calc = new Calculation();
		calc.Addition(10, 20);
		calc.substraction(200, 100);
	}

}
