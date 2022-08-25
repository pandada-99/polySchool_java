package JAVABook_FinalTerm;

import java.util.Scanner;

public class Chapter_2_00 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("가위바위보 게임입니다. 가위, 바위, 보 중에서 입력하세요.");

        System.out.println("철수>>");
        String soo = scanner.next();
        System.out.println("영희>>");
        String hee = scanner.next();

        if (soo.equals("보")) {
            if (hee.equals("가위")) {
                System.out.println("영희가 이겼습니다.");
            }
            else if (hee.equals("보")) {
                System.out.println("비겼습니다.");
            }
            else if (hee.equals("바위")) {
                System.out.println("철수가 이겼습니다.");
            }
        }

        if (soo.equals("가위")) {
            if (hee.equals("가위")) {
                System.out.println("비겼습니다.");
            }
            else if (hee.equals("보")) {
                System.out.println("철수가 이겼습니다.");
            }
            else if (hee.equals("바위")) {
                System.out.println("영희가 이겼습니다.");
            }
        }

        if (soo.equals("바위")) {
            if (hee.equals("가위")) {
                System.out.println("철수가 이겼습니다.");
            }
            else if (hee.equals("보")) {
                System.out.println("영희가 이겼습니다.");
            }
            else if (hee.equals("바위")) {
                System.out.println("비겼습니다.");
            }
        }
    }
}
