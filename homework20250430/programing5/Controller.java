package programing5;

public abstract class Controller {
	
    protected boolean power;

    public Controller(boolean power) {
    	
        this.power = power;
        
    }

    public void show() {
    	
        if (power) {
        	
            System.out.println(getName() + "가 켜졌습니다.");
        } else {
        	
            System.out.println(getName() + "가 꺼졌습니다.");
        }
    }

    public abstract String getName();
    
}
