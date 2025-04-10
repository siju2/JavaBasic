package homework;

class Line {
	
	int length;
	
	Line(int length) {
		this.length = length;
		
	}
	
	boolean isSameLine(Line b) {
		if(length == b.length) {
			return true;
		} else {
			return false;
		}
	}
	
}

public class LineTest {
	
	public static void main(String[]args) {
		
		Line a = new Line(1);
		Line b = new Line(1);
		
		System.out.println(a.isSameLine(b));
		System.out.println(a ==b);
		
	}

}
