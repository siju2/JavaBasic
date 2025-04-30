package programing5;

public class TV extends Controller {
	
    public TV(boolean power) {
    	
        super(power);
        
    }

    @Override
    public String getName() {
    	
        return "TV";
        
    }
}
