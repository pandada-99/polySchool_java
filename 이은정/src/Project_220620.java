public class Project_220620 {
    enum Week { MON, TUE, WED, THU, FRI, SAT, SUN}

    int sum (int a, int b) {
        return a+b;
    }

    double average (int[] a) {
        double sum = 0;
        for (int i = 0; i < a.length; ++i) {
            sum+= a[i];
        }
        double avr = sum / a.length;
        return avr;
    }

    int max (int[] a) {
        int max_val = a[0];
//        int max_val = Integer.MIN_VALUE;
        for (int i = 0; i < a.length; ++i) {
            if (a[i] > max_val) {
                max_val = a[i];
            }
        }
        return max_val;
    }

    int min (int[] a) {
        int min_val = a[0];
        for (int i = 0; i < a.length; ++i) {
            if (a[i] < min_val) {
                min_val = a[i];
            }
        }
        return min_val;
    }

    public static void main(String[] args) {
        Week today = Week.valueOf("TUE");
        System.out.println(today);

        Project_220620 p1 = new Project_220620();

        System.out.println(p1.sum(3, 5));

        int [] a = {1, 2, 3, 4, 5, 6, 7};
        System.out.println(p1.average(a));

        int [] b = {0, -5, -12, 84, 5, 13};
        int [] c = {-5, -8, -96, -1, -58};
        System.out.println(p1.max(c));
        System.out.println(p1.min(c));

    }
}
