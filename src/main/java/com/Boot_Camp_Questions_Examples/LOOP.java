package com.Boot_Camp_Questions_Examples;

public class LOOP {
	public static void main(String[] args) {
		Add1to100();	
	}
	public static void Add1to100() {
		int sum=0;
		for(int i=1 ; i<=100 ; i++ ) {
			
			sum = sum+i;
		}
		System.out.println("the sum is : " + sum);
	}
	
		
}
