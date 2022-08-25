import java.util.Scanner;

public class Project_220331 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        String grade;
//        System.out.println("점수를 입력하세요(0~100): ");
//        int score = scanner.nextInt();

        // if문
//        do
//        {
//            System.out.println("점수를 입력하세요(0~100): ");
//            score = scanner.nextInt();
//        } while (score > 100 || score < 0);
//
//        if (score >= 90)
//        {
//            if (score >= 95)
//            {
//                grade = "A+";
//            }
//            else
//            {
//                grade = "A";
//            }
//        }
//        else if (score >= 80)
//            grade = "B";
//        else if (score >= 70)
//            grade = "C";
//        else if (score >= 60)
//            grade = "D";
//        else
//            grade = "F";
//
//        System.out.println("학점은 " + grade + "입니다.");

        // switch문
//        switch (score/10)
//        {
//            case 10:
//            case 9:
//                grade = "A";
//                break;
//            case 8:
//                grade = "B";
//                break;
//            case 7:
//                grade = "C";
//                break;
//            case 6:
//                grade = "D";
//                break;
//            default:
//                grade = "F";
//        }
//        System.out.println("학점은 " + grade + "입니다.");

//        int sum = 0;
//        for(int i = 0; i <= 100; ++i)
//        {
//            sum += i;
//        }
//        System.out.println(sum);
//
//        for(int i = 0; i < 5; System.out.println(i), System.out.println("Java"))
//        {
//            ++i;
//        }

//        int count = 0;
//        int sum = 0;
//        // 'class이름' '변수이름' = new '생성자이름'
//        // Scanner라는 class에 있는 Scanner라는 생성자를 가져와서 'scanner' 라는 변수에 넣어서 쓰겠다.
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("정수를 입력하고 마지막에 -1을 입력하세요.");
//
//        int n = scanner.nextInt();
//        while (n != -1)
//        {
//            sum += n;
//            count++;
//            n = scanner.nextInt();
//        }
//        if (count == 0)
//        {
//            System.out.println("입력된 수가 없습니다.");
//        }
//        else
//        {
//            System.out.println("정수의 갯수는 " + count + "개이며, ");
//            System.out.println("평균은 " + (double)sum/count + "입니다.");
//        }

//        int x = 2, y = 10, z = 0;
//        z = x++ * 2 + --y - 5 + x * (y % 2);
//        System.out.println(z);
//
//        char c = 'a';
//        do {
//            System.out.print(c);
//            c = (char) (c + 1);
//        } while (c < 'z');
//        {
//            System.out.println(c);
//        }

        int Array[] = new int[5];
        int max = 0;
        System.out.println("양수 5개를 입력해주세요.: ");

        for(int i=0; i<5; i++) {
            Array[i] = scanner.nextInt();
            if (Array[i] > max) {
                max = Array[i];
            }
        }
        System.out.printf("가장 큰 수는 %d입니다.", max);
        scanner.close();
    }
}
