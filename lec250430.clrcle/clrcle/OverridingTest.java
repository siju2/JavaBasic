package lec250430.clrcle;

public class OverridingTest {

	public static void main(String[]args) {
		Circle circle = new Circle(5.0);
		System.out.println(">>> 원:");
		System.out.println("반지름:" + circle.getRaius());
		System.out.println("면접" + circle.getArea());
		
		Ball ball = new Ball(5.0);
		System.out.println(">>> 공:");
		System.out.println("반지름:" + ball.getRaius());
		System.out.println("면접" + ball.getArea());

		Cylinder cylinder = new Cylinder(5.0,7.0);
		System.out.println(">>> 실린더:");
		System.out.println("반지름:" + cylinder.getRaius());
		System.out.println("면접" + cylinder.getArea());

		
		
	}
}
