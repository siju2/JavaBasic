package app;

import member.Member;
import member.MemberService;
import member.exception.NoMemberException;

import java.util.List;
import java.util.Scanner;

public class MemberApplication {
	
    private final Scanner sc = new Scanner(System.in);
    private final MemberService service = new MemberService();

    public static void main(String[] args) throws NoMemberException {
    	
    	
        new MemberApplication().controlMenu();
    }
    

    public void controlMenu() throws NoMemberException {
    	
        int menu;
        do {
        	
            menu = selectMenu();
            switch (menu) {
                case 1 -> addMember();
                case 2 -> showMemberList();
                case 3 -> showMemberDetail();
                case 4 -> removeMember();
                case 0 -> System.out.println("프로그램을 종료합니다.");
                default -> System.out.println("잘못된 메뉴 선택입니다.");
            }
        } while (menu != 0);
    }

    private int selectMenu() {
        String[] menuList = {"종료", "회원가입", "회원목록", "회원상세정보", "회원탈퇴"};
        System.out.println("\n=== 회원 관리 프로그램 ===");
        for (int i = 1; i < menuList.length; i++) {
            System.out.printf("%d. %s%n", i, menuList[i]);
        }
        System.out.print("0. 회원관리 프로그램 종료 ");
        while (!sc.hasNextInt()) {
            sc.next();
            System.out.print("숫자를 입력하세요 > ");
        }
        return sc.nextInt();
    }

    private void addMember() {
    	
        System.out.print("아이디: ");
        String id = sc.next();
        System.out.print("비밀번호: ");
        String pw = sc.next();
        System.out.print("이름: ");
        String name = sc.next();
        boolean result = service.registMember(id, pw, name);
        System.out.println(result ? "가입 완료" : "이미 존재하는 아이디입니다.");
    }

    private void showMemberList() {
    	
        List<Member> list = service.listMembers();
        if (list.isEmpty()) {
            System.out.println("등록된 회원이 없습니다.");
            return;
        }
        System.out.println("번호 | 이름 | 아이디");
        list.forEach(System.out::println);
    }

    private void showMemberDetail() throws NoMemberException {
        System.out.print("회원 번호 입력 > ");
        int no = sc.nextInt();
        Member m = service.detailMemberInfo(no);
		System.out.printf("번호: %d%n아이디: %s%n이름: %s%n", m.getMemberNo(), m.getId(), m.getUsername());
    }

    private void removeMember() {
        System.out.print("회원 번호 입력 > ");
        int no = sc.nextInt();
        boolean result = service.removeMember(no);
        System.out.println(result ? "탈퇴 완료" : "해당 번호의 회원이 없습니다.");
    }
}