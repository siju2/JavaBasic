package programing4;

public class TalkableTest {
	
    public static void speak(Talkable t) {
    	
        t.speak();
        
    }

    public static void main(String[] args) {
    	
        speak(new Korean());
        speak(new American());
        
    }
}
