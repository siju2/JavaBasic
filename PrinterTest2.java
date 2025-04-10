package homework;

	class Printer {
		
    private int numOfPapers;

    public Printer(int numOfPapers) {
        this.numOfPapers = numOfPapers;
    }

    public void print(int amount) {
        if (numOfPapers == 0) {
            System.out.println("용지가 없습니다.");
        } else if (numOfPapers < amount) {
            System.out.println(numOfPapers + "장 출력했습니다. (요청한 매수보다 " + (amount - numOfPapers) + "장 부족합니다.)");
            numOfPapers = 0;
            System.out.println("남은 용지: 0장");
        } else {
            numOfPapers -= amount;
            System.out.println(amount + "장 출력했습니다.");
            System.out.println("남은 용지: " + numOfPapers + "장");
        }
    }
}

public class PrinterTest2 {
    public static void main(String[] args) {
    	
        Printer p = new Printer(10);  
        
        p.print(2);   
        p.print(20);  
        p.print(10);   
    }
}