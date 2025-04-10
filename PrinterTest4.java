package homework;

class Printer3 {
	
	private int numOfPapers;
	private boolean duplex;
	
	public Printer3(int numOfPapers, boolean duplex) {
		this.numOfPapers = numOfPapers;
		this.duplex = duplex;
	}
	
	public void print(int amount) {
		int requiredPapers;
		
		if(duplex) {
			requiredPapers = (amount +1) / 2;
			if (numOfPapers < requiredPapers) {
				System.out.println("양면으로 모두 출력하려면 용지가"+ (requiredPapers - numOfPapers)+"매 부족합니다"+numOfPapers + "장남아있습니다");
			numOfPapers = 0;
			} else {
				numOfPapers -= requiredPapers;
				System.out.println("양면으로"+requiredPapers+"장출력했습니다. 현재 남은용지는" +numOfPapers+"장남아있습니다");
				
			}
		} else {
			requiredPapers = amount;
			if (numOfPapers < requiredPapers) {
				System.out.println("단면으로 모두 출력할려면 용지가 "+(requiredPapers - numOfPapers)+"매 부족합니다" + numOfPapers +"장만 출력합니다");
				numOfPapers = 0;
			} else {
				numOfPapers = requiredPapers;
				System.out.println("단면으로는"+requiredPapers +"장 출력했습니다 현재남은거는 "+ numOfPapers +"장남았습니다/");
			}
		}
	}
	
	public boolean getDoplex() {
		return duplex;
	}

	public void setDuplex(boolean duplex) {
		this.duplex = duplex;
	}
	
}

public class PrinterTest4 {
	
	public static void main(String[]args) {
		Printer3 p = new Printer3(20, true);
		p.print(25);
		p.setDuplex(false);
		p.print(10);
	}

}
