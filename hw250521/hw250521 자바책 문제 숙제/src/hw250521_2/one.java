package hw250521_2;

import java.util.*;

public class one {
	
    public static void main(String[] args) {
    
    	List<String> list = Arrays.asList("갈매기", "나비", "다람쥐", "라마");
        
    	for (String word : list) {
        
    		if (word.length() == 2) {
            
    			System.out.println(word);
            
    		}
        }
    }
}
