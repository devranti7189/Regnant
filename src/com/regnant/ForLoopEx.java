package com.regnant;

public class ForLoopEx {

	public static void main(String[] args) {
		int[] arr= {2,5,4,3,6,7,8,10};
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				System.out.println("elelment at index "+i+" is even");
			}
			else 
				if(arr[i]%2!=0) {
				System.out.println("elelment at index "+i+" is odd");
			}
			
		}

	}  
	private void syso() {
		System.out.println("hello everyone");

	}
	private void syso2() {
		System.out.println("hello everyone");

	}
}
