package com.regnant;

public class MethodEx3{
	static int plusMethod(int x,int y) {
		return x+y;
	}
	static double plusMethod(double x,double y) {
		return x+y;
	}
	public static void main(String[] args) {
		int myNum1 = plusMethod(8,4);
		double myNum2 = plusMethod(4.4,6.6);
		System.out.println("int:"+ myNum1);
		System.out.println("double"+myNum2);
	}
}