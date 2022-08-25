import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

// 220609 SW활용및코딩(오세진교수님)
class OBJ<H>{ //꼭 <T>가 아니여도 된다. 다른문자도 사용가능!
    H val;
    void set(H t) {val = t;}
    H get() {return val;}
}

public class Project_220609 {
    public static void main(String[] args) {
        //Boxing
        int a = 5;
        Integer b = Integer.valueOf(a);

        //UnBoxing
        Integer c = Integer.valueOf(10);
        int d = c.intValue();

        //제네릭///////////////////////////////////////////////////////////////////////
        OBJ<String> obj1 = new OBJ<String>();
        obj1.set("Hello, World");
        System.out.println(obj1.get());

        OBJ<Integer> obj2 = new OBJ<Integer>();
        obj2.set(20);
        System.out.println(obj2.get());

        OBJ<Float> obj3 = new OBJ<>();
        obj3.set(5.6f);
        System.out.println(obj3.get());

        //입출력 스트림///////////////////////////////////////////////////////////////////////
//        FileWriter fout = null;
//
//        try{
//            fout = new FileWriter("result.txt");
//
//            for (int i = 1; i < 101; i++) {
//                fout.write(i+"Line\n");
//            }
//            fout.close();
//        }catch (IOException e) {
//            System.out.println("파일 입출력 오류");
//        }

        //////////////////////////////////////////////////////////
        FileWriter fout = null;

        try{
            fout = new FileWriter("result.txt", true);

            for (int i = 101; i < 201; ++i) {
                fout.append(i + "line\n");
            }
            fout.close();
        }catch (IOException e) {
            System.out.println("파일 입출력 오류");
        }

        //////////////////////////////////////////////////////////
        FileReader fin = null;

        try {
            fin = new FileReader("result.txt");

            int e;
            while ((e = fin.read()) != -1) { //read가 읽어온게 없으면 -1이 들어옴(뭐라도 읽으면 그게 들어옴)
                System.out.print((char) e);
            }
            fin.close();
        }catch (IOException e) {
            System.out.println("파일 입력 오류");
        }
    }
}
