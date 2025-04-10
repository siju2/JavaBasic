package homework;

class Dice {
	
	int face;
	
	Dice() {
		face = (int)(Math.random()* 6) + 1;
	}
	
	int roll() {
		return face;
	}
}

public class DiceTest {
	
	public static void main(String[]args) {
		
		Dice d = new Dice();
		
		System.out.println("주사위의 숫자:"+d.roll());
	}

}
