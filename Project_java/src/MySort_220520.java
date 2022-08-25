import java.util.Arrays;

public class MySort_220520 {
    private int partition(int[] a, int begin, int end, boolean ascending) {
        int pivot = (begin + end) / 2;
        int L = begin;
        int R = end;

        while (L < R) {
            pivot = (L + R) / 2;
            System.out.println("pivot= " + pivot);

            if (ascending) {
                while((a[L] < a[pivot]) && (L < R)) L++;
                while((a[R] >= a[pivot]) && (L < R)) R--;
            }

            else {
                System.out.println("내림차순입니다");
                System.out.println("L= "+ L + ", R= "+ R);
                while((a[L] > a[pivot]) && (L < R)) L++;
                while((a[R] <= a[pivot]) && (L < R)) R--;
            }

            if (L < R) {
                System.out.printf("%d과 %d 자리 바꿀꺼얌 %n", L, R);
                int temp = a[L];
                a[L] = a[R];
                a[R] = temp;
            }

            System.out.println(Arrays.toString(a));
        } // end while

        // pivot과 R의 위치를 바꾼다.
        System.out.printf("pivot=" + pivot + "과 %d 자리 바꿀꺼얌 %n", R);
        int temp = a[pivot];
        a[pivot] = a[R];
        a[R] = temp;

        System.out.println(Arrays.toString(a));

        return R;
    }

    void quickSort(int[] a, int begin, int end, boolean ascending) {
        if(begin >= end) {
            return;
        }
        int pivot = 0;
        pivot = partition(a, begin, end, ascending);
        quickSort(a, begin, pivot-1, ascending);
        quickSort(a, pivot+1, end, ascending);
    }
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    // 버블 정렬 구현
    // ascend가 true면 오름차순 아니면 내림차순 정렬
    void bubbleSort(int[]a, boolean ascend) {
        for(int i = a.length-1; i >= 0; --i) {
            for(int j = 0; j < i; ++j) {
                if(ascend == true) {
                    if(a[j] > a[j+1]) swap(a, j, j+1);
                }
                else {
                    if(a[j] < a[j+1]) swap(a, j, j+1);
                }
            }
        }
    }
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    // 선택 정렬 구현
    // ascend가 true면 오름차순 아니면 내림차순 정렬
    void selectionSort(int[] a, boolean ascend) {
        // int key = a[0];
        int targetIdx = 0;

        for(int i = 0; i < a.length; ++i) {
            if(ascend == true) {
                targetIdx = argMin(a, i);
            }
            else{
                targetIdx = argMax(a, i);
            }
            swap(a, i, targetIdx);
            // System.out.println(Arrays.toString(a));
        }
    }

    // start index 부터 끝까지 중에서
    // 가장 작은 원소가 들어있는 index를 리턴
    int argMin(int[] a, int startIdx) {
        // 예외처리
        if(startIdx < 0 || startIdx >= a.length) {
            throw new ArrayIndexOutOfBoundsException();
        }

        int minValue = a[startIdx];
        int minIndex = startIdx;

        for(int i = startIdx; i < a.length; ++i) {
            if(minValue > a[i]) {
                minValue = a[i];
                minIndex = i;
            }
        }
        return minIndex;
    }

    // start index 부터 끝까지 중에서
    // 가장 큰 원소가 들어있는 index를 리턴
    int argMax(int[] a, int startIdx) {
        // 예외처리
        if(startIdx < 0 || startIdx >= a.length) {
            throw new ArrayIndexOutOfBoundsException();
        }

        int maxValue = a[startIdx];
        int maxIndex = startIdx;

        for(int i = startIdx; i < a.length; ++i) {
            if(maxValue < a[i]) {
                maxValue = a[i];
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    // 배열에서 i번 index와 j번 index의 원소를 바꿈
    void swap(int[] a, int i, int j){
        if (i < 0 || i >= a.length || j < 0 || j >= a.length) {
            throw new ArrayIndexOutOfBoundsException();
        }

        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
