package com.regnant;

public class MethodEx2 {
static void checkAge(int age) {
	if(age<18) {
		System.out.println("Access denied! not eligible for vote");
	}
	else{
		System.out.println("Access granted! eligible for vote");
	}
  }
public static void main(String[] args) {
	checkAge(66);
   }
}
