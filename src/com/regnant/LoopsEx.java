package com.regnant;

public class LoopsEx {
	
	public static void main(String args[]) {
		int[]  arr= {1,3,5,7,9,12,14,16,18,20};
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<10) {
				System.out.println("elements are True");
			}
			else
				if(arr[i]>10) {
					System.out.println("elements are False");
				}
			
		}
	}

}
