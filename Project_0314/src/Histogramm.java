import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Histogramm {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("./salmon_bass_data.csv");
        BufferedReader br = new BufferedReader(fr);

        int num_records = 318;
        int [] length_arr = new int[num_records];
        int count = 0;

        String line = br.readLine();
        line = br.readLine();

        while(line != null)
        {
            String[]parse = line.split(",");

            length_arr[count] = Integer.parseInt(parse[1]);
            ++count;
            line = br.readLine();
        }

        //길이별 히스토그램(과제)
        for (int i = 0; i < 27; ++i)
        {
            System.out.printf("%dcm: ", i);
            for (int j = 0; j < num_records; ++j)
            {
                if (i == length_arr[j])
                {
                    System.out.print("*");
                }
            }
            System.out.println();
        }

    }
}
