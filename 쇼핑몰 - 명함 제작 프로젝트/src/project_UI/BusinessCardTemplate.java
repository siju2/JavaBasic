package project_UI;

import member.*;

public class BusinessCardTemplate {

    public static void main(String[] args) {
        System.out.println("BusinessCardTemplate 클래스는 명함 템플릿 목록 제공용 유틸 클래스입니다.");
        System.out.println("템플릿 목록:");
        printTemplateList(0);
    }

    public static void printTemplateList(int selectedNo) {
        System.out.println("\n--- 명함 템플릿 목록 ---");
        for (int i = 1; i <= 6; i++) {
            String templateName = getTemplateName(i);
            if (i == selectedNo) {
                System.out.println(i + ". " + templateName + " ← 선택됨");
            } else {
                System.out.println(i + ". " + templateName);
            }
        }
    }

    public static String getTemplateName(int templateNo) {
        switch (templateNo) {
            case 1: return "미니멀 화이트";
            case 2: return "클래식 박스";
            case 3: return "감성 라인아트";
            case 4: return "컬러풀 비즈니스";
            case 5: return "모던 다크모드";
            case 6: return "레드 포인트 엣지";
            default: return "기본 템플릿";
        }
    }

    public static void printBusinessCard(MemberVO member) {
        System.out.println("\n=== 나의 명함 ===");
        System.out.println("템플릿: " + getTemplateName(member.getTemplateNo()));
        System.out.println("이름: " + nullSafe(member.getUsername()));
        System.out.println("아이디: " + nullSafe(member.getId()));
        System.out.println("전화: " + nullSafe(member.getMobile()));
        System.out.println("이메일: " + nullSafe(member.getEmail()));
        System.out.println("주소: " + nullSafe(member.getAddress()));
        System.out.println("가입일: " + (member.getRegDate() != null ? member.getRegDate().toString() : "(없음)"));
    }

    private static String nullSafe(String value) {
        return (value != null && !value.isBlank()) ? value : "(입력되지 않음)";
    }
} 
