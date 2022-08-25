import java.util.Arrays;

public class MidTerm_220426 {
    public static void main(String[] args) {
        System.out.println("AI-Engineering - 이은정");

        Answer2 ans = new Answer2();

        // 1번 문제 테스트
        String [] param1 = {"XXL", "XL", "XXL", "XS", "S"};
        int [] ans1 = ans.solution1(param1);
        System.out.println(Arrays.toString(ans1));

        // 2번 문제 테스트
        int [] param2 = {1, 2, 3, 4, 5, 9999};
        int [] ans2 = ans.solution2(param2);
        System.out.println(Arrays.toString(ans2));

        // 3번 문제 테스트
        int param3 = 5;
        int ans3 = ans.solution3(param3);
        System.out.println(ans3);

        // 4번 문제 테스트
        int [] param4 = {1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 4568};
        int ans4 = ans.solution4(param4);
        System.out.println(ans4 + "배 입니다.");
    }
}

class Answer2 {
    // 1번 문제
    int [] solution1 (String [] shirt_size) {
        enum MySize {XS, S, M, L, XL, XXL}

        int [] result = new int [MySize.values().length]; // 배열의 크기는 enum의 크기

        for (int i = 0; i < shirt_size.length; ++i) {
            MySize temp = MySize.valueOf(shirt_size[i]); // valueOf = enum 타입으로 바꾸기
            result[temp.ordinal()]++; // 숫자로 바꾸기 (XS = 0, X = 1,..., XXL = 5)
        }

//        int [] result = new int [6];
//
//        for (int i=0; i < shirt_size.length; ++i) {
//            if (shirt_size[i] == "XS") result[0]++;
//            else if (shirt_size[i] == "S") result[1]++;
//            else if (shirt_size[i] == "M") result[2]++;
//            else if (shirt_size[i] == "L") result[3]++;
//            else if (shirt_size[i] == "XL") result[4]++;
//            else if (shirt_size[i] == "XXL") result[5]++;
//        }

        return  result;
    }

    // 2번 문제
    int [] solution2 (int [] original) {
        int len = original.length;
        int [] result = new int [original.length];

        for (int i =0; i < len; ++i) {
            result[i] = original[len -1 -i];
        }

        return result;
    }

    // 3번 문제
    int solution3 (int n) {
        int sum = 0;

        for (int i = 1; i <= n; ++i) {
            int ai = 4 * i -2;
            sum += ai;
        }

        return sum;
    }

    // 4번 문제
    int solution4 (int [] original) {
        int result = 0;

        int count = countSame(original, original[0]);
        int max = count;
        int min = count;

        for (int i = 1; i < original.length; ++i) {
            count = countSame(original, original[i]);
            if (count > max) {
                max = count;
            }
            else if (count < min) {
                min = count;
            }
        }

        result = max/min;

        return result;
    }
    // int x가 배열 arr에서 몇 번 등장하는지 return
    private int countSame (int[] arr, int x) {
        int count = 0;

        for (int i = 0; i < arr.length; ++i) {
            if (arr[i] == x) {
                ++count;
            }
        }

        return count;
    }
}
