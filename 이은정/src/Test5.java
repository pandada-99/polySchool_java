import java.util.ArrayList;
import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        float sum = 0;

        while (true) {
            System.out.print("점수를 입력하세요.");
            int score = scanner.nextInt();
            list.add(score);

            System.out.print("계속하시겠습니까?(y/n)");
            char ans = scanner.next().charAt(0);
            if (ans == 'y') {
                continue;
            }
            else if (ans == 'n') {
                for (int i = 0; i < list.size(); i++) {
                    sum = sum + list.get(i);
                }
                float avg = sum / list.size();
                System.out.printf("입력된 점수의 평균: %f", avg);
                break;
            }
        }
    }
}