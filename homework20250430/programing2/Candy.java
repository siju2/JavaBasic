package programing2;

public class Candy implements Delicious {
	
    @Override
    public void eat() {
    	
        System.out.println("사탕을 먹어요!");
        
    }

    @Override
    
    public void sweet() {
    	
        System.out.println("사탕은 달콤해요!");
        
        
    }
}
