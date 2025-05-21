package hw250521_2;

import java.util.*;

public class six {
	
    public static void main(String[] args) {
    	
        Map<String, String> map = new HashMap<>();
        
        map.put("호랑이", "tiger");
        map.put("표범", "leopard");
        map.put("사자", "lion");

        System.out.println("변경 전 : " + map);

        map.replaceAll((k, v) -> v.toUpperCase());

        System.out.println("변경 후 : " + map);
    }
}
