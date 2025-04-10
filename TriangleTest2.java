package homework;

class Triangle2 {
	private double base, high;
	
	Triangle2(double base, double high) {
		this.base = base;
		this.high = high;
	}
	
	double findArea() {
		return base *high * 0.5;
	}
	String isSameArea(Triangle2 anotherTriangle) {
		if(findArea() == anotherTriangle.findArea()) {
			return "동일합니다";
		} else {
			return "동일하지 않습니다";
		}
	}
	
	double getBase() {
		return base;
	}
	double getHigh() {
		return high;
	}
	
}

public class TriangleTest2 {
	
	public static void main(String[]args) {
		
		Triangle2 t1 = new Triangle2(10.0 , 5.0);
		Triangle2 t2 = new Triangle2(5.0, 10.0);
		Triangle2 t3 = new Triangle2(8.0, 8.0);
		
		System.out.println(t1.isSameArea(t2));
		System.out.println(t1.isSameArea(t3));
		
		
	}

}
