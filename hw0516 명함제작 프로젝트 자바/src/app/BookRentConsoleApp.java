package app;

import java.util.Scanner;

public class BookRentConsoleApp {

    // 카드 정보
    static final int STATUS_IDX = 4;
    static final String STATUS_ACTIVE = "active";
    static final String STATUS_DELETED = "deleted";

    static String[][] cardList = {
        { "1", "심플 템플릿", "김철수", "010-1234-5678", STATUS_ACTIVE },
        { "2", "모던 블루", "이영희", "010-9999-8888", STATUS_ACTIVE },
        { "3", "비즈니스 클래식", "박민수", "010-2222-3333", STATUS_ACTIVE }
    };

    public static void main(String[] args) {

        displayWelcome();
        boolean isQuit = false;

        while (!isQuit) {
            int menu = getMenu();

            switch (menu) {
                case 1: // 템플릿 목록 보기
                    menuTemplateList();
                    break;
                case 2: // 명함 만들기
                    menuCardCreate();
                    break;
                case 3: // 명함 목록 보기
                    menuCardList();
                    break;
                case 4: // 명함 삭제
                    menuCardDelete();
                    break;
                case 0: // 종료
                    menuExit();
                    isQuit = true;
                    break;
                default:
                    System.out.println("⚠️ 없는 메뉴입니다.");
            }
        }
    }

    static void displayWelcome() {
        System.out.println("************************************");
        System.out.println("*     명함 제작 콘솔 앱에 오신 걸 환영합니다.    *");
        System.out.println("************************************");
    }

    static int getMenu() {
        System.out.println("=================================");
        System.out.println("1. 템플릿 목록 보기");
        System.out.println("2. 명함 만들기");
        System.out.println("3. 제작된 명함 목록 보기");
        System.out.println("4. 명함 삭제하기");
        System.out.println("0. 종료");
        System.out.println("=================================");
        System.out.print(">> 메뉴 선택 : ");

        Scanner sc = new Scanner(System.in);
        int menu = -1;
        try {
            menu = sc.nextInt();
        } catch (Exception e) {
            System.out.println("⚠️ 숫자를 입력하세요.");
            sc.nextLine();
        }
        return menu;
    }

    static void menuTemplateList() {
        System.out.println("*** 템플릿 목록 ***");
        System.out.println("1. 심플 템플릿");
        System.out.println("2. 모던 블루");
        System.out.println("3. 비즈니스 클래식");
    }

    static void menuCardList() {
        System.out.println("*** 제작된 명함 목록 ***");
        displayCardList(STATUS_ACTIVE);
    }

    static void menuCardCreate() {
        System.out.println("*** 명함 만들기 ***");
        Scanner sc = new Scanner(System.in);

        System.out.print("이름 입력: ");
        String name = sc.nextLine();

        System.out.print("전화번호 입력: ");
        String phone = sc.nextLine();

        menuTemplateList();
        System.out.print("템플릿 번호 선택: ");
        int templateNo = sc.nextInt();
        sc.nextLine(); // 줄바꿈 처리

        String templateName = switch (templateNo) {
            case 1 -> "심플 템플릿";
            case 2 -> "모던 블루";
            case 3 -> "비즈니스 클래식";
            default -> "기본 템플릿";
        };

        // 카드 배열에 추가 (빈 칸 찾기)
        boolean added = false;
        for (int i = 0; i < cardList.length; i++) {
            if (cardList[i][STATUS_IDX].equals(STATUS_DELETED)) {
                cardList[i][0] = String.valueOf(i + 1);
                cardList[i][1] = templateName;
                cardList[i][2] = name;
                cardList[i][3] = phone;
                cardList[i][4] = STATUS_ACTIVE;
                added = true;
                break;
            }
        }

        if (!added) {
            System.out.println("⚠️ 더 이상 명함을 저장할 수 없습니다.");
        } else {
            System.out.println("✅ 명함이 성공적으로 생성되었습니다!");
        }
    }

    static void menuCardDelete() {
        System.out.println("*** 명함 삭제하기 ***");
        displayCardList(STATUS_ACTIVE);

        Scanner sc = new Scanner(System.in);
        System.out.print(">> 삭제할 명함 번호 입력: ");
        int cardNo = sc.nextInt();

        if (cardNo > 0 && cardNo <= cardList.length && cardList[cardNo - 1][STATUS_IDX].equals(STATUS_ACTIVE)) {
            cardList[cardNo - 1][STATUS_IDX] = STATUS_DELETED;
            System.out.println("✅ 명함이 삭제되었습니다.");
        } else {
            System.out.println("⚠️ 잘못된 명함 번호입니다.");
        }
    }

    static void displayCardList(String status) {
        for (int i = 0; i < cardList.length; i++) {
            if (cardList[i][STATUS_IDX].equals(status)) {
                System.out.printf("%s. [%s] %s (%s)\n", cardList[i][0], cardList[i][1], cardList[i][2], cardList[i][3]);
            }
        }
    }

    static void menuExit() {
        System.out.println("*** 명함 제작 앱을 종료합니다. ***");
    }
}
