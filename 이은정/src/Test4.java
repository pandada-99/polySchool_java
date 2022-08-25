public class Test4 {
    public static void main(String[] args) {
        int list[] = new int[6];

        for (int i = 0; i < 6; ++i) {
            int num = (int)(Math.random()*45+1);

//          중복 값 제거
            for(int j=0; j < i; j++){
                if(list[i] == list[j]) {
                    i--;
                    break;
                }
            }

            list[i] = num;

            System.out.println(list[i]);
        }
    }
}
