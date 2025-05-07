package hw250507NUM2;

class Shape{}

class Rectangle extends Shape {}

class Circle extends Shape {}



public class CastExceptionTest {

	public static void main(String[]args) {
		
		Rectangle r = new Rectangle();
		
		try {
			casting(r);
		} catch (ClassCastException e) {
			
			System.out.println("형변형 오류발생");
			System.out.println(e.toString());
			
			
		}
	
		
	}
	
	static void casting(Shape s) {

		Circle c = (Circle) s;
	}
}
