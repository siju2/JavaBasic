
package homework;

import java.util.Scanner;

public class CircleTest { //ppt 문제 1
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("원의 반지름");
		double radius = sc.nextDouble();
	
       Circle	circle = new Circle(radius);
		
		System.out.println("반지름이" + radius +"인 원의넓이는 " 	+circle.getArea()+  "입니다 ");
		
	}

}
