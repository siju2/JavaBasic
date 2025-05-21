package hw250521_1;

import java.util.*;

public class one {

	
	    public static void main(String[] args) {
	        List<String> capitals = new ArrayList<>();
	        capitals.add("서울");
	        capitals.add("워싱턴");
	        capitals.add("베이징");
	        capitals.add("마드리드");
	        capitals.add("파리");

	        for (String capital : capitals) {
	            System.out.print(capital + " ");
	        }
	        System.out.println();

	        capitals.add("런던");
	        for (String capital : capitals) {
	            System.out.print(capital + " ");
	        }
	        System.out.println();

	        capitals.removeIf(city -> city.length() < 3);
	        for (String capital : capitals) {
	            System.out.print(capital + " ");
	        }
	        System.out.println();
	    }
	}
