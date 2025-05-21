package hw250521_1;

import java.util.*;

public class two {
    public static void main(String[] args) {
        Map<String, String> a = new HashMap<>();
        a.put("head", "대가리");
        a.put("teacher", "쌤");
        a.put("cat", "꼬네이");
        a.put("aunt", "아지매");
        a.put("noodle", "국시");
        a.put("child", "얼라");

        for (String key : a.keySet()) {
        	
            System.out.printf("%s=%s ", key, a.get(key));
            
        }
        
        
        System.out.println();

        a.forEach((key, value) -> System.out.printf("%s=%s ", key, value));
        
        System.out.println();
        
    }
}
