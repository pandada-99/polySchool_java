enum FoodType {한식, 일식, 중식, 양식, 베트남식, 분식, 디저트}

public class Matzip_220421 {
    String name;
    String addr;
    double score;
    FoodType type;
    Matzip_220421 (String name, String addr, double score, FoodType fy) {
        this.name = name;
        this.addr = addr;
        this.score = score;
        this.type = fy;
    }

    public static void main(String[] args) {
        Matzip_220421 matzip1 = new Matzip_220421("평리당", "평리동", 4.0, FoodType.양식);
        Matzip_220421 matzip2 = new Matzip_220421("전주비빔밥", "두류동", 3.0, FoodType.한식);
        Matzip_220421 matzip3 = new Matzip_220421("낭만사시미", "시지동", 5.0, FoodType.일식);
        Matzip_220421 matzip4 = new Matzip_220421("황금쟁반짜장", "우정동", 2.5, FoodType.중식);
        Matzip_220421 matzip5 = new Matzip_220421("젤라또", "삼산동", 4.5, FoodType.디저트);
        Matzip_220421 matzip6 = new Matzip_220421("분보남보", "옥산동", 3.5, FoodType.베트남식);

        MyArraylist_220421<Matzip_220421> matziplist = new MyArraylist_220421();

        matziplist.add(matzip1);
        matziplist.add(matzip2);
        matziplist.add(0, matzip3);
        matziplist.add(1, matzip4);
        matziplist.add(2, matzip5);
        matziplist.add(3, matzip6);
        matziplist.remove(1);

        for (int i = 0; i < matziplist.length(); ++i) {
            System.out.print(matziplist.get(i).name+ " ");
            System.out.println(matziplist.get(i).type);
        }

        System.out.println("matziplist의 길이는 " + matziplist.length());
    }
}
