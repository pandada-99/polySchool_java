package JavaTest;

public class Sample {
    public int a;
    private int b;
    int c;
    protected int d;

    public static void main(String[] args) {
        int num = 5;

        for (int i = 1; i <= num; ++i) {
            System.out.println("*".repeat(i));
        }
    }
}
