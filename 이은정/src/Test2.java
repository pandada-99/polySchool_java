import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int 오만원 = 50000;
        int 만원 = 10000;
        int 천원 = 1000;
        int 백원 = 100;
        int 오십원 = 50;
        int 십원 = 10;
        int 일원 = 1;

        System.out.print("금액을 입력하세요>>");
        int money = scanner.nextInt();

        if (money/오만원 > 0) {
            int con = money/오만원;
            System.out.printf("오만원권 %d매\n", con);
            money = money-(con*오만원);
        }
        if (money/만원 > 0) {
            int con = money/만원;
            System.out.printf("만원권 %d매\n", con);
            money = money-(con*만원);
        }
        if (money/천원 > 0) {
            int con = money/천원;
            System.out.printf("천원권 %d매\n", con);
            money = money-(con*천원);
        }
        if (money/백원 > 0) {
            int con = money/백원;
            System.out.printf("백원 %d개\n", con);
            money = money-(con*백원);
        }
        if (money/오십원 > 0) {
            int con = money/오십원;
            System.out.printf("오십원 %d개\n", con);
            money = money-(con*오십원);
        }
        if (money/십원 > 0) {
            int con = money/십원;
            System.out.printf("십원 %d개", con);
            money = money-(con*십원);
        }
        if (money/일원 > 0) {
            int con = money/일원;
            System.out.printf("일원 %d개", con);
            money = money-(con*일원);
        }

        scanner.close();
    }
}
