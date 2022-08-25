// 220512 SW활용및코딩(오세진교수님)
public class Project_220512 {
    public int getSum (int i, int j) {
        return i + j;
    }

    public int getSum (int i, int j, int k) {
        return i + j + k;
    }

    public int getSum (float i, float j) {
        return (int)i + (int)j;
    }

    static void replaceSpace(char a[]) {
        for (int i = 0; i <a.length; i++) {
            if (a[i] == ' ') {
                a[i] = ',';
            }
        }
    }
    static void printCharArray (char a[]) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        char c[] = {'T', 'h', 'i', 's', ' ', 'i', 's',  ' ', 'a', ' ', 'p', 'e', 'n', 'c', 'i', 'l', '.'};
        printCharArray(c); // 원래 배열 원소 출력
        replaceSpace(c); // 공백 문자 바꾸기
        printCharArray(c); // 수정된 배열 원소 출력

        Project_220512 a = new Project_220512();

        int i = a.getSum(1, 2);
        int j = a.getSum(1, 2, 3);
        int k = a.getSum(1.1f, 2.2f);
        System.out.println(i);
        System.out.println(j);
        System.out.println(k);
    }
}
