package com.Boot_Camp_Questions_Examples;

public class Palindrome_String {
	public static void main(String[] args) {
		
		//Ex: mom, dad, race car, nurses run
		
		String original = "race car";
		original = original.replace(" ", "");
		
		String reverse = "";
		for(int i = original.length() - 1; i >= 0; i--) {
			reverse += original.charAt(i);
			System.out.println(reverse);
		}
		
		boolean palindrome = true;
		for(int i = 0; i < original.length(); i++) {
			if(original.charAt(i) != reverse.charAt(i)) {
				palindrome = false;
			}
		}
		
		if(palindrome) {
			System.out.println("PALINDROME!");
		} else {
			System.out.println("Not a palindrome!");
		}
		
	}


}
