package project_UI;

import java.util.List;
import java.util.Scanner;
import member.*;

public class BusinessCardConsoleUI {

    public static void main(String[] args) {
        MemberService service = new HJMemberService(new HashMapMemberDAO());
        BusinessCardConsoleUI ui = new BusinessCardConsoleUI(service);
        ui.start();
    }

    private final Scanner scanner = new Scanner(System.in);
    private final MemberService memberService;

    public BusinessCardConsoleUI(MemberService memberService) {
        this.memberService = memberService;
    }

    public void start() {
        while (true) {
            printMainMenu();
            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    registerMember();
                    break;
                case "2":
                    login();
                    break;
                case "3":
                    listAllMembers();
                    break;
                case "0":
                    System.out.println("프로그램을 종료합니다.");
                    return;
                default:
                    System.out.println("잘못된 선택입니다. 다시 입력해주세요.");
            }
        }
    }

    private void printMainMenu() {
        System.out.println("\n====== 명함 관리 프로그램 ======");
        System.out.println("1. 회원 가입");
        System.out.println("2. 로그인 및 명함 관리");
        System.out.println("3. 전체 회원 목록 보기");
        System.out.println("0. 종료");
        System.out.print("메뉴 선택: ");
    }

    private void registerMember() {
        System.out.print("아이디: ");
        String id = scanner.nextLine();
        System.out.print("비밀번호: ");
        String password = scanner.nextLine();
        System.out.print("이름: ");
        String username = scanner.nextLine();

        MemberVO member = new MemberVO(id, password, username);
        boolean result = memberService.registMember(member);
        System.out.println(result ? "회원 등록 성공" : "회원 등록 실패 (중복 ID?)");
    }

    private void login() {
        System.out.print("아이디: ");
        String id = scanner.nextLine();
        System.out.print("비밀번호: ");
        String password = scanner.nextLine();

        MemberVO member = memberService.login(id, password);
        if (member != null) {
            System.out.println("\n로그인 성공! 환영합니다, " + member.getUsername() + "님.");
            businessCardMenu(member);
        } else {
            System.out.println("로그인 실패: 아이디 또는 비밀번호 불일치");
        }
    }

    private void businessCardMenu(MemberVO member) {
        while (true) {
            System.out.println("\n--- 명함 관리 메뉴 ---");
            System.out.println("1. 명함 출력");
            System.out.println("2. 명함 정보 수정");
            System.out.println("3. 명함 템플릿 선택");
            System.out.println("4. 명함 구매 신청");
            System.out.println("0. 로그아웃");
            System.out.print("선택: ");
            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    BusinessCardTemplate.printBusinessCard(member);
                    break;
                case "2":
                    updateBusinessCardInfo(member);
                    break;
                case "3":
                    BusinessCardTemplateUI ui = new BusinessCardTemplateUI(memberService);
                    ui.start(member);
                    break;
                case "4":
                    applyForCardPurchase(member);
                    break;
                case "0":
                    System.out.println("로그아웃합니다.");
                    return;
                default:
                    System.out.println("잘못된 선택입니다.");
            }
        }
    }

    private void updateBusinessCardInfo(MemberVO member) {
        System.out.print("휴대폰 번호: ");
        String mobile = scanner.nextLine();
        System.out.print("이메일: ");
        String email = scanner.nextLine();
        System.out.print("주소: ");
        String address = scanner.nextLine();

        member.setMobile(mobile);
        member.setEmail(email);
        member.setAddress(address);

        boolean result = memberService.addMemberInfo(member.getId(), mobile, email, address);
        System.out.println(result ? "명함 정보 업데이트 성공" : "명함 정보 업데이트 실패");
    }

    private void listAllMembers() {
        List<MemberVO> members = memberService.listMembers();
        System.out.println("\n--- 전체 회원 목록 ---");
        for (MemberVO m : members) {
            System.out.println(m);
        }
    }

    private void applyForCardPurchase(MemberVO member) {
        System.out.println("\n--- 명함 구매 신청 ---");

        System.out.print("배송 받을 주소를 입력하세요: ");
        String deliveryAddress = scanner.nextLine();
        if (deliveryAddress.isBlank()) {
            System.out.println("[오류] 배송지는 반드시 입력해야 합니다.");
            return;
        }

        System.out.print("카드 번호를 입력하세요 (예: 1234-5678-1234-5678): ");
        String cardNumber = scanner.nextLine();
        if (!cardNumber.matches("\\d{4}-\\d{4}-\\d{4}-\\d{4}")) {
            System.out.println("[오류] 카드 번호는 형식에 맞게 입력해야 합니다.");
            return;
        }

        System.out.print("카드 유효기간을 입력하세요 (MM/YY): ");
        String cardExpiry = scanner.nextLine();
        if (!cardExpiry.matches("\\d{2}/\\d{2}")) {
            System.out.println("[오류] 유효기간은 MM/YY 형식으로 입력해야 합니다.");
            return;
        }

        System.out.print("카드 CVC 번호를 입력하세요 (3자리): ");
        String cardCvc = scanner.nextLine();
        if (!cardCvc.matches("\\d{3}")) {
            System.out.println("[오류] CVC는 3자리 숫자여야 합니다.");
            return;
        }

        System.out.println("\n명함 구매 신청이 완료되었습니다.");
        System.out.println("배송지: " + deliveryAddress);
        System.out.println("선택된 템플릿: " + BusinessCardTemplate.getTemplateName(member.getTemplateNo()));
        System.out.println("결제 카드 정보: 끝자리 ****" + cardNumber.substring(cardNumber.length() - 4));
    }
} 
