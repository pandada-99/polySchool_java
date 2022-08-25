import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main_220314 {
    public static void main(String[] args) throws IOException{
        FileReader fr = new FileReader("./salmon_bass_data.csv");
        BufferedReader br = new BufferedReader(fr);

//        int num_records = 318;
//        int [] length_arr = new int[num_records];
//        int count = 0;
//
//        String line = br.readLine();
//        line = br.readLine();
//
//        while(line != null)
//        {
//            String[]parse = line.split(",");
//
//            length_arr[count] = Integer.parseInt(parse[1]);
//            ++count;
//            line = br.readLine();
//        }
//
//        int min = 999, max = -1;
//
//        for (int i = 0; i<num_records; ++i)
//        {
//            if (length_arr[i] < min)
//            {
//                min = length_arr[i];
//            }
//            if (max < length_arr[i])
//            {
//                max = length_arr[i];
//            }
//        }
//        System.out.printf("min = %d, max = %d\n", min, max);
//
//        int a = 0;
//        int b = 0;
//        int c = 0;
//
//        for (int i = 0; i < num_records; ++i)
//        {
//            if (length_arr[i] < 10)
//            {
//                ++a;
//            }
//            else if (length_arr[i] < 20)
//            {
//                ++b;
//            }
//            else if (length_arr[i] < 30)
//            {
//                ++c;
//            }
//        }
//        System.out.printf("길이 0~9cm는 %d마리, 길이 10~19cm는 %d마리, 길이 20~29cm는 %d마리입니다.\n", a, b, c);
//        System.out.println("총 " + (a+b+c) + "마리입니다.");
//
//        //길이별 히스토그램(과제)
//        for (int i = 0; i < 27; ++i)
//        {
//            System.out.printf("%dcm: ", i);
//            for (int j = 0; j < num_records; ++j)
//            {
//                if (i == length_arr[j])
//                {
//                    System.out.print("*");
//                }
//            }
//            System.out.println();
//        }


//        while(line != null)
//        {
//            String[] parse = line.split(",");
//            System.out.printf("[%s] [%s] [%S]\n", parse[0], parse[1], parse[2]);
//            line = br.readLine();
//        }


//        int count = 0;
//
//        while(line != null)
//        {
//            String[] parse = line.split(",");
//            System.out.printf("[%s] [%s] [%S]\n", parse[0], parse[1], parse[2]);
//            line = br.readLine();
//            if (line != null)
//            {
//                ++count;
//            }
//            System.out.printf("%d번째 줄을 읽었습니다.\n", count);
//        }
//
//        System.out.printf("\n%d개 입니다.", count);


//        String line = br.readLine();
//        System.out.println(line);
//
//        String[] parse = line.split(",");
//        System.out.println(parse[0]);
//        System.out.println(parse[1]);
//        System.out.println(parse[2]);
//
//        line = br.readLine();
//        parse = line.split(",");
//        System.out.println(parse[0]);
//        System.out.println(parse[1]);
//        System.out.println(parse[2]);


//        int i = 0;
//        while(i < 10)
//        {
//            System.out.println("Hello, World" + i);
//            ++i;
//        }

//        int i = 1;
//        int dan = 2;
//
//        while(dan<10)
//        {
//            System.out.println("<" + dan + "단>");
//            //for (int i = 1; i < 10; ++i)
//            while (i<10)
//            {
//                System.out.printf("%d * %d = %d\n", dan, i, dan*i);
//                ++i;
//            }
//            i = 1;
//            ++dan;
//        }


        //class_220316

//        int row = 2, col = 3;
//
//        int [][] arr_2 = new int[row][col];
//
//        arr_2[0][0] = 11;
//        arr_2[0][1] = 12;
//        arr_2[0][2] = 13;
//        arr_2[1][0] = 21;
//        arr_2[1][1] = 22;
//        arr_2[1][2] = 23;
//
//        for (int i = 0; i < row; ++i)
//        {
//            for (int j = 0; j < col; ++j)
//            {
//                System.out.printf("[%d]", arr_2[i][j]);
//            }
//            System.out.printf("\n");
//        }


        // 구구단 계산 결과 저장하기

//        int row = 10, col = 10;
//
//        int[][] gugudan = new int[row][col];
//
//        for(int i =2; i < row; ++i)
//        {
//            for(int j =1; j < row; ++j)
//            {
//                gugudan[i][j] = i*j;
//            }
//        }
//
//        for (int i = 2; i < row; ++i)
//        {
//            System.out.printf("=== %d단 ===\n", i);
//            for (int j = 1; j < col; ++j)
//            {
//                System.out.printf("%d * %d = %d\n", i, j, gugudan[i][j]);
//            }
//            System.out.printf("\n");
//        }


        //Enum 실습

//        enum Week {MON, TUE, WED, THU, FRI, SAT, SUN}

//        Week today = Week.FRI;
//
//        if (today == Week.FRI)
//        {
//            System.out.printf("%s에는 청소를 합니다.\n", today);
//        }
//
//        today = Week.SAT;
//
//        if (today == Week.SAT)
//        {
//            System.out.printf("%s에는 휴식시간을 가집니다.\n", today);
//        }

//        enum FishType {Salmon, Bass}
//
//        FishType myFish = FishType.valueOf("Salmon");
//
//        if (myFish == FishType.Bass)
//        {
//
//        }
//
//        if (myFish == FishType.Salmon)
//        {
//
//        }


        //Switch 문법 실습

//        int today = 99;
//
//        switch (today) {
//            case 0:
//                System.out.println("today는 0입니다.");
//                break;
//            case 1:
//                System.out.println("today는 1입니다.");
//                break;
//            case 2:
//                System.out.println("today는 2입니다.");
//                break;
//            default:
//                System.out.println("case에 없는 숫자입니다.");
//                break;
//        }


        // if에서 쓰이는 'or'과 'and' 실습 (switch에서 break 없으면 'or'과 같은 의미)

//        int today = 0;
//        int gender = 0;
//        int height = 170;
//
//        if (today == 0 || today == 1 || today ==2) // ||는 또는
//        {
//            System.out.println("today가 0 or 1 or 2입니다.");
//        }
//
//        if ((gender == 0 && height >= 170) || (gender == 1 && height < 170)) // &는 그리고
//        {
//            System.out.println("int gender는 남자이고 키가 170cm 이상입니다.");
//        }


        //물고기 타입을 Enum형으로 만들어서 model만들기
        enum FishType {Salmon, Bass}

        String line = br.readLine();

        int index = 0;
        int num_data = 318;
        int [] length_arr = new int[num_data];
        FishType [] label = new FishType[num_data];

        while (line != null)
        {
            line = br.readLine();
            if (line == null) break;

            String [] parse = line.split(",");

            label[index] = FishType.valueOf(parse[0]);
            length_arr[index] = Integer.parseInt(parse[1]);
            ++index;
        }

        //print해서 확인해보기
//        for (int i = 0; i < num_data; ++i)
//        {
//            System.out.printf("%d: [%s %d]\n", i, label[i], length_arr[i]);
//        }


        //길이 모델 만들기
//        int model_length = 10;
//        int n_hit = 0, n_miss = 0; // hit=맞췄다, miss=틀렸다
//
//        for (int i = 0; i < num_data; ++i)
//        {
//            FishType model_decision;
//
//            if(length_arr[i] > model_length)
//            {
//                model_decision = FishType.Bass;
//            }
//            else
//            {
//                model_decision = FishType.Salmon;
//            }
//
//            if (model_decision == label[i])
//            {
//                ++n_hit;
//            }
//            else
//            {
//                ++n_miss;
//            }
//        }

        //과제 하는법 (분류율 구하는 법: 전체 숫자 분의 맞는 숫자 *100 / hit 나누기 318 * 100 = 분류율)
        //model_length를 변수로 두고 분류한뒤 분류율를 저장함
        //두번째 model_length를 변수로 두고 분류한뒤 분류율을 첫번째 model_length와 비교
        //분류율이 높은 애만 변수 model_length로 남겨둠
        //계속 비교해서 가장 높은 model_length 구하기

        //과제 분류율이 가장 높은 x 구하기 (길이가 x일때, n개를 맞추었다)
        int model_length = 0;
        double n_hit = 0, n_miss = 0; // hit=맞췄다, miss=틀렸다
        double j = 0;
        int k = 0;
        double X = 0;

        for (model_length = 2; model_length < 27; ++model_length)
        {
            n_hit = 0;
            n_miss = 0;
            for (int i = 0; i < num_data; ++i)
            {
                FishType model_decision;

                if (length_arr[i] > model_length)
                {
                    model_decision = FishType.Bass;
                }
                else
                {
                    model_decision = FishType.Salmon;
                }

                if (model_decision == label[i])
                {
                    ++n_hit;
                }
                else
                {
                    ++n_miss;
                }
            }
            X = (n_hit/318)*100;
            System.out.printf("길이가 %dcm였을 때, 분류율은 %.2f퍼센트입니다.\n", model_length, X);
//            // 가장 많이 맞췄던 길이 구하기
//            if (n_hit > j)
//            {
//                j = n_hit;
//                k = model_length;
//            }
//            System.out.printf("길이가 %dcm였을 때, 맞는 개수는 %d개입니다.\n", model_length, n_hit);
            if (X > j)
            {
                j = X;
                k = model_length;
            }
        }
        System.out.printf("분류율이 가장 높을 때는 길이가 " + k + "cm일 때이며, 그때 분류율은 %.2f퍼센트입니다.", j);
//        System.out.println("분류율이 가장 높을 때는 길이가 " + k + "cm일 때이며, 그때 맞춘 개수는 " + j + "개입니다.");
    }
}
