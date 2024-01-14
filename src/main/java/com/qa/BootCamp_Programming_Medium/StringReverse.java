package com.qa.BootCamp_Programming_Medium;

public class StringReverse {

	public static void main(String[] args) {
		String str = "tide";
	
		char[] chars = str.toCharArray();
		
		int length =chars.length;
		System.out.println("String lehgth is:"+ length);
		
		for(int i= length-1;i>=0; i--) {
		System.out.print(chars[i]);	
		}
	} 

}
