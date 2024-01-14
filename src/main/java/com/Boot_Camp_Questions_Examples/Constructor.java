package com.Boot_Camp_Questions_Examples;

public class Constructor {

	int a;
	int b;

	public Constructor() { // constructor

		a = 100;
		b = 30;

	}

	public static void main(String[] args) {

		// created a object of class to call the constructor
		Constructor Myobj = new Constructor();

		System.out.println(Myobj.a + Myobj.b);
	}

}
