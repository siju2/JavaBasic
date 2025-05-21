package hw250521_1;

import java.util.*;

public class three {
	
    public static void main(String[] args) {
    	
        Map<String, String> a = new HashMap<>();
        
        a.put("head", "대가빠리");
        a.put("teacher", "쌤");
        a.put("cat", "꼬네이");
        a.put("aunt", "아지매");
        a.put("noodle", "국시");
        a.put("child", "얼라");

        Collection<String> collection1 = a.values();
        
        List<String> list = new ArrayList<>(collection1);
        
        Collections.shuffle(list);
        
        list.forEach(x -> System.out.print(x + " "));
        
    }
}

