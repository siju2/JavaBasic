package app;

import java.util.LinkedList;
import java.util.Scanner;

import member.Member;
import member.MemberService;

public class MemberApplication {
	
	Scanner sc = new Scanner(System.in);
	MemberService ms = new MemberService();
	
	public void controlMenu() {
		int menu;
		do {
			menu = selectMenu();
			switch (menu) {
			case 1: menuRegistMember(); break;
			case 2: menuMemberList(); break;
			case 3: menuMemberDetailInfo(); break;
			case 4: menuMemberUpdate(); break;
			case 5: menuMemberRemove(); break;
			case 0:
				System.out.println("프로그램을 종료합니다.");
				break;
			default:
				System.out.println("해당 메뉴는 없습니다.");
			}
		} while (menu != 0);
	}
	
	private void menuMemberRemove() {
		System.out.println("회원 탈퇴");
		menuMemberList();
		System.out.print("회원 번호 입력: ");
		int memberNo = sc.nextInt();
		
		if (ms.removeMember(memberNo)) {
			System.out.println("결과: 탈퇴되었습니다.");
		} else {
			System.out.println("결과: 탈퇴에 실패했습니다.");
		}
	}
	
	private void menuMemberUpdate() {
		System.out.println("회원 정보 수정");
		menuMemberList();
		System.out.print("회원 번호 입력: ");
		int memberNo = sc.nextInt();
		System.out.print("기존 비밀번호: ");
		String oldPassword = sc.next();
		System.out.print("새 비밀번호: ");
		String newPassword = sc.next();
		
		if (ms.updateMemberInfo(memberNo, oldPassword, newPassword)) {
			System.out.println("결과: 비밀번호가 변경되었습니다.");
		} else {
			System.out.println("결과: 비밀번호 변경에 실패했습니다.");
		}
	}
	
	private void menuMemberDetailInfo() {
		System.out.println("회원 상세정보");
		menuMemberList();
		System.out.print("회원 번호 입력: ");
		int memberNo = sc.nextInt();
		
		Member member = ms.detailMemberInfo(memberNo);
		if (member == null) {
			System.out.println("결과: 해당 회원이 존재하지 않습니다.");
		} else {
			System.out.println(member.toString());
		}
	}
	
	private void menuRegistMember() {
		System.out.println("회원가입");
		String id;
		do {
			System.out.print("아이디 입력 (중복불가): ");
			id = sc.next();
		} while (!ms.isIdValid(id));
		
		System.out.print("비밀번호 입력: ");
		String password = sc.next();
		System.out.print("이름 입력: ");
		String username = sc.next();
		
		if (ms.registMember(id, password, username)) {
			System.out.println("결과: 회원이 등록되었습니다.");
		} else {
			System.out.println("결과: 등록에 실패했습니다.");
		}
	}
	
	private void menuMemberList() {
		System.out.println("회원 목록");
		LinkedList<Member> memberList = ms.listMembers();
		System.out.println("---------------------------------------");
		if (memberList.isEmpty()) {
			System.out.println("등록된 회원이 없습니다.");
		} else {
			for (Member member : memberList) {
				System.out.println(member.toString());
			}
		}
		System.out.println("---------------------------------------");
	}
	
	private int selectMenu() {
		String[] menuList = {"종료", "회원가입", "회원목록", "회원상세정보", "회원정보수정", "회원탈퇴"};
		System.out.println("==============================");
		for (int i = 1; i < menuList.length; i++) {
			System.out.println(i + ". " + menuList[i]);
		}
		System.out.println("0. " + menuList[0]);
		System.out.println("==============================");
		System.out.print("메뉴 선택: ");
		return sc.nextInt();
	}
	
	public static void main(String[] args) {
		MemberApplication app = new MemberApplication();
		app.controlMenu();
	}
}
