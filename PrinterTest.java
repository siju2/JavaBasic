package homework;

class Printer {
	
	int numOfPapers = 0;

	public void print(int amount) {
		
		numOfPapers -= amount;
	}
	
}



public class PrinterTest {
	
	public static void main(String[]args) {
		
		Printer demoPrinter = new Printer();
		
		
		demoPrinter.numOfPapers = 100;
		
		
		demoPrinter.print(70);
		
		System.out.println(+ demoPrinter.numOfPapers);
	}

}
