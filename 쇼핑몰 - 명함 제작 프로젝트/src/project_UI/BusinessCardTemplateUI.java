package project_UI;

import member.*;

import java.util.Scanner;

public class BusinessCardTemplateUI {

    public static void main(String[] args) {
        System.out.println("이 클래스는 단독 실행용이 아닙니다. BusinessCardConsoleUI에서 사용하세요.");
    }

    private final Scanner scanner = new Scanner(System.in);
    private final MemberService memberService;

    public BusinessCardTemplateUI(MemberService memberService) {
        this.memberService = memberService;
    }

    public void start(MemberVO member) {
        while (true) {
            System.out.println("\n=== 명함 템플릿 선택 ===");
            BusinessCardTemplate.printTemplateList(member.getTemplateNo());
            System.out.println("7. 뒤로 가기");
            System.out.print("원하는 템플릿 번호를 선택하세요: ");

            String input = scanner.nextLine();
            int selected;
            try {
                selected = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("숫자를 입력해주세요.");
                continue;
            }

            if (selected == 7) {
                System.out.println("이전 메뉴로 돌아갑니다.");
                return;
            } else if (selected >= 1 && selected <= 6) {
                member.setTemplateNo(selected);
                System.out.println("템플릿이 '" + BusinessCardTemplate.getTemplateName(selected) + "'로 설정되었습니다.");
            } else {
                System.out.println("1~6 사이의 숫자를 입력하거나 7번으로 돌아갈 수 있습니다.");
            }
        }
    }

	public MemberService getMemberService() {
		return memberService;
	}
} 