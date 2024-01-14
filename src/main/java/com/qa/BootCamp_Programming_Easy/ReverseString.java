package com.qa.BootCamp_Programming_Easy;

public class ReverseString {
	public static void main(String[] args) {
		String str = "Happy Holiday";
		String newStr = "";
		for(int i =0; i < str.length(); i++) {
			
			char ch = str.charAt(i);
			newStr = ch+newStr;
		}
		System.out.println(newStr);
		
			
		
	}
}
