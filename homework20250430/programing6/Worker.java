package programing6;

public class Worker implements Human {
	
    @Override
    
    public void print() {
    	
        System.out.println("인간입니다");
    }

    @Override
    public void eat() {
        System.out.println("빵을 먹습니다");
    }
}
