package com.Boot_Camp_Questions_Examples;

public class Shape {
	public static void main(String[] args) {
		Shape s = new Shape();
		s.area("circle");
		s.area("cirlce", "triangle");
		s.area("cirlce", "triangle","rectriangle");
	}
	
public void area(String Circle) {
		
		System.out.println("Circle");
	}
public void area(String Circle, String Triangle) {
	
	System.out.println("Circle and Traingle");
}
public void area(String Circle, String Triangle, String Rectriangle ) {
	
	System.out.println("Circle,Traingle and Rectriangle");
}

}
