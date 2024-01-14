package com.Boot_Camp_Questions_Examples;

import java.util.Scanner;

public class Palindrome_number {
public static void main(String[] args) {
	Scanner scanner= new Scanner (System.in);
	System.out.println("Enter any number");
	int originalNumber= scanner.nextInt();
	scanner.close();
	 int number = originalNumber;
	 int reversedNumber= 0;
	 //logic for reverse number
	 while(number!=0) {
		 int reminder= number%10;
		 reversedNumber= (reversedNumber*10)+reminder;
		 number=number/10; //0
		//checking if the number is palindrome 
		 
		
}
	 if (originalNumber==reversedNumber) {
		System.out.println(originalNumber+ " is a palindrome"); 
		 
	 }else {
		 System.out.println(originalNumber+ " not a palindrome"); 
	 }
}}