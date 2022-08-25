import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("키를 입력하세요.");
            float height = (scanner.nextFloat())/100;
            System.out.print("몸무게를 입력하세요.");
            float weight = scanner.nextFloat();

            float BMI = (weight/(height*height));
            BMI = Math.round(BMI);

            if (BMI >= 30.0) {
                System.out.printf("BMI: %f, 고도 비만\n", BMI);
            }
            else if ((BMI >= 25.0) && (BMI < 30.0)) {
                System.out.printf("BMI: %f, 일반 비만\n", BMI);
            }
            else if ((BMI >= 18.5) && (BMI < 25.0)) {
                System.out.printf("BMI: %f, 표준 체형\n", BMI);
            }
            else {
                System.out.printf("BMI: %f, 마른 체형\n", BMI);
            }

            System.out.print("계속하시겠습니까?(y/n)");
            char ans = scanner.next().charAt(0);
            if (ans == 'y') {
                continue;
            }
            else if (ans == 'n') {
                break;
            }
            else {
                System.out.println("key 입력오류");
                break;
            }
        }

        scanner.close();
    }
}
