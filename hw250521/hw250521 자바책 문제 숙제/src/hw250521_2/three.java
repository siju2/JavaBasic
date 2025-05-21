package hw250521_2;

import java.util.*;

public class three {
	
    public static void main(String[] args) {

    	Map<String, Integer> map = new Hashtable<>();
        map.put("김열공", 80);
        map.put("최고봉", 90);
        map.put("우등생", 95);
        map.put("나자바", 88);

        Scanner sc = new Scanner(System.in);
        System.out.print("이름을 입력하세요 : ");
        String name = sc.nextLine();

        
        Integer score = map.get(name);
        
        if (score != null) {
        
        	System.out.println(score);
        
        } else {
        
        	System.out.println("해당 이름이 없습니다.");
        }
    }
}
