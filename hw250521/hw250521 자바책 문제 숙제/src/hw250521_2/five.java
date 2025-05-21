package hw250521_2;

import java.util.*;

public class five {
	
    public static void main(String[] args) {
    	
        Scanner scanner = new Scanner(System.in);
        
        ArrayList<Integer> scores = new ArrayList<>();

        while (true) {
        	
            System.out.print("점수를 입력하세요 : ");
            
            int score = scanner.nextInt();
            
            if (score < 0) break;
            
            scores.add(score);
            
        }

        System.out.println("전체 학생은 " + scores.size() + "명이다.");
        
        System.out.print("학생들의 성적 : ");
        
        for (int s : scores) System.out.print(s + " ");
        
        System.out.println();

        for (int i = 0; i < scores.size(); i++) {
        	
            int s = scores.get(i);
            
            String grade;
            if (s >= 90) grade = "A";
           
            else if (s >= 80) grade = "B";
           
            else if (s >= 70) grade = "C";
            
            else if (s >= 60) grade = "D";
            
            else grade = "F";
            
            System.out.println(i + "번 학생의 성적은 " + s + "점이며 등급은 " + grade + "이다.");
        }
    }
}
