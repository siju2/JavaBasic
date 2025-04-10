package homework;

class GolfClub {
	
	int number;
	String Name = "아이언";
	
	void print() {
		
		if(Name.equals("아이언")) {
			System.out.printf("%d번 %s입니다.\n",number,Name);
		} else {
			System.out.printf("%s입니다.\n", Name);
		}
		
	}
		GolfClub(String Name) {
		this.Name = Name;
		}
		
		GolfClub(int number) {
		this.number = number;
		}
		GolfClub() {
			number = 7;
		}
		
	}
	


public class GolfClubTest {
	
	public static void main(String[]args) {
		
		GolfClub g1 = new GolfClub();
		g1.print();
		
		GolfClub g2 = new GolfClub(8);
		g2.print();
		
		GolfClub g3 = new GolfClub("퍼터");
		g3.print();
	}

}
