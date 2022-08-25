import java.util.Scanner;

public class Project_220414 {
    public static void main(String[] args) {
        // 220414 SW활용및코딩(오세진교수님)
//        // 배열 원소의 평균 구하기
//        int intArray[] = new int[5];
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.println(intArray.length + "개의 정수를 입력하세요. : ");
//
//        int sum = 0;
//        for (int i=0; i<intArray.length; ++i)
//            intArray[i] = scanner.nextInt();
//        for (int i=0; i<intArray.length; ++i)
//            sum = sum + intArray[i];
//
//        System.out.println("평균은" + (double)sum/intArray.length + "입니다.");
//        scanner.close();

        // 2차원 배열 만들기
        int arr[][];
        arr = new int[3][3];
        int num = 1;
        for(int i = 0; i < arr.length; ++i) {
            for(int j = 0; j < arr[i].length; ++j) {
                arr[i][j] = num;
                num++;
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
        System.out.println();

        // 2차원 비정방형 배열 만들기
        int arr2[][];
        arr2 = new int[3][];
        arr2[0] = new int[2];
        arr2[1] = new int[1];
        arr2[2] = new int[3];
        int num2 = 1;
        for(int i = 0; i < arr2.length; ++i) {
            for (int j = 0; j < arr2[i].length; ++j) {
                arr2[i][j] = num2;
                num2++;
                System.out.print(arr2[i][j]);
            }
            System.out.println();
        }
    }
}