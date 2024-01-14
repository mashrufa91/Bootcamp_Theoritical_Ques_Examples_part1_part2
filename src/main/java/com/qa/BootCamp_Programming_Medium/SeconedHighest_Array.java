package com.qa.BootCamp_Programming_Medium;

import java.util.Arrays;

public class SeconedHighest_Array {
	
	public static void main(String[] args) {
		//unsorted array
		int[] num = {1,9,5,6,9,7,10,12};
		int s = num.length;
	//Sorted the array
		Arrays.sort(num);
		System.out.println("SeconedHighest Number is:"+num[s-2]);

}
	}

