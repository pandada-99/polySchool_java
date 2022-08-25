import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("점수를 입력하세요.");
            int score = scanner.nextInt();

            if (score < 0 || score > 100) {
                continue;
            }
            else {
                switch (score/10) {
                    case 10:
                    case 9:
                        System.out.println("A학점");
                        break;
                    case 8:
                        System.out.println("B학점");
                        break;
                    case 7:
                        System.out.println("C학점");
                        break;
                    case 6:
                        System.out.println("D학점");
                        break;
                    default:
                        System.out.println("F학점");
                }
                break;
            }
        }

        scanner.close();
    }
}
