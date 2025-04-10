package homework;

class Complex {
	
	double bokSoSu, bokSoSu2;
	
	Complex(double bokSoSu) {
		this.bokSoSu = bokSoSu;
		this.bokSoSu2 = bokSoSu2;
		
	}
	
	Complex(double bokSoSu, double bokSoSu2) {
		this.bokSoSu = bokSoSu;
		this.bokSoSu2 = bokSoSu2;
	}
	
	void print() {
		System.out.printf(bokSoSu+ "+" + bokSoSu2 + "i");
	}
}

public class ComplexTest {
	
	public static void main(String[]args) {
		
		Complex c1 = new Complex(2.0);
		c1.print();
		
		Complex c2 = new Complex(1.5,2.5);
		c2.print();
		
	}
}
