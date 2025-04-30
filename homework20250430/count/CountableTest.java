package lec250430.count;

public class CountableTest {

    public static void main(String[] args) {

    	
        Countable[] l = {
        		
            new Bird("뻐꾸기", 2),
            new Bird("독수리", 2),
            new Tree("사과나무", 10),
            new Tree("밤나무", 7)
            
        };

        for (Countable x : l) {
        	
            x.count();
            
        }

        for (Countable x : l) {
        	
            if (x instanceof Bird) {
            	
                ((Bird) x).fly();
                
            } else if (x instanceof Tree) {
            	
                ((Tree) x).ripen();
            }
        }
    }
}
