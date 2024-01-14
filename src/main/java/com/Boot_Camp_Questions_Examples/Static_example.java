package com.Boot_Camp_Questions_Examples;

public class Static_example {

	 
	int rollNo;
	String name;

	static String school = "PplNTech"; // static variable

	// constructor
	Static_example(int a, String b) {
		rollNo = a;
		name = b;
	}

	public void display() {
		System.out.println(school + " " + name + " " + rollNo);
	}

	public static void main(String[] args) {
		Static_example m1 = new Static_example(1, "Roly");
		Static_example m2 = new Static_example(2, "Shiwlee");
		Static_example m3 = new Static_example(3, "Mashrufa");
		
		m1.display();
		m2.display();
		m3.display();
	}

}
