import java.util.Scanner;

public class Project_220330 {
    int add (int a, int b)
    {
        return a+b;
    }

    int sub (int a, int b)
    {
        return a-b;
    }

    int mul (int a, int b)
    {
        return a*b;
    }

    int div (int a, int b)
    {
        if (b != 0)
        {
            return a/b;
        }
        return 0;
    }

    String hello()
    {
        return "Hello, World!";
    }

    // 평균구하기 함수
    double avr (int[] score)
    {
        // 배열의 합 구하기
        int sum = 0;

        for (int i = 0; i < score.length; ++i)
        {
            sum += score[i];
        }

        // 총합을 갯수로 나누기
        double avr = (double)sum/score.length;

        return avr;
    }

    // 배열의 최대값을 리턴하는 함수
    int maxscore (int[] score)
    {
        int max= 0; // int j가 for문 안에 있으면 return에서 못찾음
        for (int i = 0; i < score.length; ++i) // .length는 인덱스 할꺼라서 '=<' 안됨 / '<' 라고 적어야함
        {
            if (score[i] > max)
            {
                max = score[i];
            }
        }
        return max;
    }

    // 배열의 최대값을 구한 다음 해당 인덱스를 리턴하는 함수
    int maxscore_index (int[] score) //{60, 80, 95, 50, 100}
    {
        int max = score[0]; // 60
        int max_index = 0;
        for (int i = 1; i < score.length; ++i)
        {
            if (score[i] > max)
            {
                max = score[i];
                max_index = i;
            }
        }
        return max_index;
    }

    public static void main(String[] args) {
        // classname 변수이름 = new classname
        Project_220330 obj = new Project_220330();
        Scanner a = new Scanner(System.in);

        System.out.println(obj.hello());

        int sum;
        sum = obj.add(3, 5);
        System.out.println("sum= " + sum);

        int sub = obj.sub(3, 5);
        System.out.println("sub= " + sub);

        int mul = obj.mul(3, 5);
        System.out.println("mul= " + mul);

        int div = obj.div(3, 5);
        System.out.println("div= " + div);

        // 평균 구하는 함수 사용하기
        int[] std1_score = {100, 95, 90};

        double avr = obj.avr(std1_score);
        System.out.println(avr);

        // 배열의 최대값을 리턴하는 함수 사용하기
        int[] score = {100, 80, 95};
        System.out.println("최고점수는 " + obj.maxscore(score) + "점입니다.");

        // 배열의 최대값의 인덱스를 리턴하는 함수 사용하기
        int[] score2 = {60, 80, 95, 50, 100};
        System.out.println("최고점수 인덱스는 " + obj.maxscore_index(score2) + "입니다.");
    }
}