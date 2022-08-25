import java.util.Arrays;

public class Project_220520 {
    public static void main(String[] args) {
        MySort_220520 sort = new MySort_220520();

        int[] data = {69, 10, 30, 2, 16, 8, 31, 22};

        for(int i = 0; i < data.length; ++i) {
            int minIdx = sort.argMax(data, i);
            sort.swap(data, i, minIdx);
            System.out.println(Arrays.toString(data));
        }
        System.out.println();

        sort.selectionSort(data, false);
        System.out.println(Arrays.toString(data));

        sort.bubbleSort(data, true);
        System.out.println(Arrays.toString(data));
    }
}
