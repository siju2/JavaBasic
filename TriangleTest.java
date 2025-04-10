package homework;

class Triangle {
	
	private double base, high;
	
	Triangle(double base, double high){
		this.base = base;
		this.high = high;
	}
	
	double findArea() {
		return base * high * 0.5;
		
	}
	
	double getBase() {
		return base;
	}
	
	double getHigh() {
		return high;
	}
}

public class TriangleTest {
	
	public static void main(String[]args) {
		
		Triangle t = new Triangle(10.0, 5.0);
		System.out.println(t.findArea());		
	}

}
