package homework;

import java.util.Scanner;

public class Circle { //ppt 문제 1
	
	
	final double PI = 3.14;
	double radius;
	
	
	public Circle(double radius) {
		this.radius = radius;
	
	}
	
	public double getArea() {
		
		return PI * radius * radius;
	}
	

}
