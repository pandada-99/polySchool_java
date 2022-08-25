class Answer {

    // 1번 문제
    int[] solution1 (String[] shirt_size) {
        int len = shirt_size.length;
        System.out.println("입력 배열의 길이는 " + len + "입니다.");

        int[] result = new int[6];

        if (len < 0 || len > 100) {
            System.out.println("크기 오류. 다시 입력하세요.");
        }

        for (int i = 0; i < len; ++i) {
            if (shirt_size[i] == "XS") {
                result[0] = result[0] + 1;
            }
            else if (shirt_size[i] == "S") {
                result[1] = result[1] + 1;
            }
            else if (shirt_size[i] == "M") {
                result[2] = result[2] + 1;
            }
            else if (shirt_size[i] == "L") {
                result[3] = result[3] + 1;
            }
            else if (shirt_size[i] == "XL") {
                result[4] = result[4] + 1;
            }
            else if (shirt_size[i] == "XXL") {
                result[5] = result[5] + 1;
            }
        }
        return result;
    }

    // 2번 문제
    int[] solution2 (int[] original) {
        int len = original.length;
        System.out.println("입력 배열의 길이는 " + len + "입니다.");

        int[] result = new int[len];

        int j = 0;
        for(int i = len-1; i >= 0; --i) {
            result[j] = original[i];
            ++j;
        }

        return result;
    }

    // 3번 문제
    int solution3 (int n) {
        System.out.println(n + "항 까지의 합을 구합니다.");

        int result = 0;

        for (int i = 1; i <= n; ++i) {
            int a = (4*i)-2;
            result =  result + a;
        }

        return result;
    }

    // 4번 문제
    int solution4 (int[] original) {
        int len = original.length;
        System.out.println("입력 배열의 길이는 " + len + "입니다.");

        int result = 0;

        int[] num = new int[1001];

        for (int i = 0; i < len; ++i) {
            for (int j = 0; j <= 1000; ++j) {
                if (original[i] == j) {
                    num[j] = num[j] + 1;
                }
            }
        }

        int max = 0;
        int min = len;
        for (int a = 0; a <= 1000; ++a) {
            if (num[a] > max && num[a] <= len) {
                max = num[a];
            }
        }
        for (int a = 0; a <= 1000; ++a) {
            if (num[a] < min && num[a] > 0) {
                min = num[a];
            }
        }

        result = max/min;

        return result;
    }
}

public class MidTerm_220425 {
    public static void main(String[] args) {
        System.out.println("AI-Engineering - 이은정");

        Answer ans = new Answer();

        // 1번 문제
        String[] param1 = {"XL", "XXL", "S", "M", "M", "M"};
        int[] result_1 = ans.solution1(param1);

        System.out.print("[");
        for (int i = 0; i < result_1.length; ++i) {
            System.out.print(result_1[i] + ", ");
        }
        System.out.print("]");
        System.out.println();

        // 2번 문제
        int[] param2 = {4, 5, 2, 6, 7, 1};
        int[] result_2 = ans.solution2(param2);

        System.out.print("[");
        for (int i = 0; i < result_2.length; ++i) {
            System.out.print(result_2[i] + ", ");
        }
        System.out.print("]");
        System.out.println();

        // 3번 문제
        int param3 = 5;
        int result_3 = ans.solution3(param3);

        System.out.println(param3 + "항 까지의 합은 " + result_3 + "입니다.");

        // 4번 문제
        int [] param4 = {1, 1, 1, 1, 2, 100, 2, 2, 2, 2, 2, 2, 2};
        int result_4 = ans.solution4(param4);

        System.out.println("가장 작은 원소와 가장 큰 원소는 " + result_4 + "배 차이 입니다.");
    }
}