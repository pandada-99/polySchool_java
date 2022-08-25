import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Project_220318 {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("./people_data.csv");
        BufferedReader br = new BufferedReader(fr);

        String line = br.readLine();

        int index = 0;
        int people_num = 101;
        int [] men = new int[people_num];
        int [] women = new int[people_num];

        while (line != null)
        {
            line = br.readLine();
            if (line == null) break;

            String [] parse = line.split(",");

            men[index] = Integer.parseInt(parse[1]);
            women[index] = Integer.parseInt(parse[2]);
            ++index;
        }

//        //확인하기 print
//        int i = 0;
//        for (i = 0; i < people_num; ++i)
//        {
//            System.out.printf(100-i + "세의 남자 인구수는 %d, 여자 인구수는 %d입니다.\n", men[i], women[i]);
//        }

        int i = 0;
        int men_all = 0;
        int women_all = 0;
        for (i = 0; i < people_num; ++i)
        {
            men_all = men_all + men[i];
        }
        for (i = 0; i < people_num; ++i)
        {
            women_all = women_all + women[i];
        }

        int people_all = women_all + men_all;
        System.out.printf("총 인구수는 %d명 입니다.\n",people_all);

        int middle_people = people_all/2;
        System.out.printf("총 인구수는 절반은 %d명 입니다.\n",middle_people);
        people_all = 0; //초기화시키기

        int j = 0;
        for (j = 0; j < people_num; ++j) //중위 연령 구하기 정답
        {
            people_all = people_all + men[j] + women[j];
            if (people_all >= middle_people)
            {
                System.out.println(men[j]);
                System.out.println(women[j]);
                System.out.println("최종 중위 연령은 " + (100-j) + "세 입니다.");
                break;
            }
        }


//        //220318 java복습
//        int samsung = 50000;
//        int market_cap = 298;
//        double per = 15.79;
//
//        String n_bass = "180";
//        String n_salmon = "170";
//
//        System.out.println(n_bass + n_salmon);
//
//        String s = "hello";
//        String t = "Java";
//
//        System.out.println(s+"! "+t);
//        System.out.printf("%s! %s\n", s, t);
//
//        String num_str = "720";
//        String num_one_str = "1";
//
//        int num_int = Integer.parseInt(num_str);
//        int num_one_int = Integer.parseInt(num_one_str);
//
//        System.out.println(num_str + num_one_str);
//        System.out.println(num_int + num_one_int);
//
//        String float_str = "123.3";
//        float f_val = Float.parseFloat(float_str);
//
//        System.out.println(float_str); //String
//        System.out.println(f_val); //float
//
//        int air = 48584;
//        System.out.println("총금액은 " + air*36 + "원 입니다");


//        //중위 연령 구하기
//        double [] people = new double[21];
//
//        people[0] = 97.4 + 92.3;
//        people[1] = 115.9 + 109.8;
//        people[2] = 117.5 + 110.2;
//        people[3] = 128.9 + 118.7;
//        people[4] = 168.3 + 153.3;
//        people[5] = 187.1 + 162.9;
//        people[6] = 173.3 + 154.9;
//        people[7] = 197.5 + 182.3;
//        people[8] = 201.6 + 190.9;
//        people[9] = 218.6 + 210.7;
//        people[10] = 216.8 + 214.7;
//        people[11] = 208.3 + 207.9;
//        people[12] = 185.6 + 191.9;
//        people[13] = 128.8 + 139.1;
//        people[14] = 93.0 + 106.8;
//        people[15] = 66.5 + 89.8;
//        people[16] = 40.4 + 68.0;
//        people[17] = 16.1 + 37.9;
//        people[18] = 4.2 + 14.3;
//        people[19] = 0.8 + 3.5;
//        people[20] = 0.1 + 0.4;
//
//        int i = 0;
//        double sum = 0;
//        for (i = 0; i <= 20; ++i)
//        {
//            sum = sum + people[i];
//        }
//        System.out.printf("총인구수는 %f입니다.\n", sum);

    }
}