// 220415 자료구조(강교수님)
enum FoodType {korea, Japan, China, SE_Asia, EU, US}

class Menu {
    String name;
    int price;

    Menu (String name, int price) {
        this.name = name;
        this.price = price;
    }
}

public class JMT_220415 {
    String name;
    String addr;
    double score;
    FoodType type;
    //Todo: menu를 추가하겠다. List를 구현한 다음에
    MyArraylist_220415<Menu> menuPan = new MyArraylist_220415<>(); // Todo: List를 구현

    JMT_220415(String name, String addr, double score, FoodType ft) {
        this.name = name;
        this.addr = addr;
        this.score = score;
        this.type = ft;
    }

    public static void main(String[] args) {
        JMT_220415 matzip0 = new JMT_220415("kopo", "deagu", 5.0, FoodType.korea);
        JMT_220415 matzip1 = new JMT_220415("azit", "deagu", 3.0, FoodType.US);
        JMT_220415 matzip2 = new JMT_220415("tiger", "prdong", 4.0, FoodType.EU);
        JMT_220415 matzip3 = new JMT_220415("haksik", "busan", 2.5, FoodType.China);
        JMT_220415 matzip4 = new JMT_220415("pasta", "ulsan", 3.5, FoodType.Japan);
        JMT_220415 matzip5 = new JMT_220415("pizza", "seoul", 4.5, FoodType.SE_Asia);

        // 'class이름' '변수이름' = new '생성자이름'
        // MyArraylist_220415라는 class에 있는 MyArraylist_220415라는 생성자를 가져와서 'jmtList' 라는 변수에 넣어서 쓰겠다.
        MyArraylist_220415<JMT_220415> jmtList = new MyArraylist_220415();
        jmtList.add(matzip0);
        jmtList.add(matzip1);
        jmtList.add(matzip2);
        jmtList.add(matzip3);
        jmtList.add(matzip4);
        jmtList.add(2, matzip5);

        //Todo: menu를 추가
        Menu m1 = new Menu("김밥", 3500);
        matzip0.menuPan.add(m1);
        Menu m2 = new Menu("곱창전골", 10000);
        matzip1.menuPan.add(m2);
        Menu m3 = new Menu("계란말이", 7000);
        matzip1.menuPan.add(m3);

        jmtList.remove(3);

        for (int i = 0; i < jmtList.length(); ++i)
        {
            System.out.println(jmtList.get(i).name);
        }

        System.out.println(matzip1.menuPan.get(0).name);
        System.out.println(matzip1.menuPan.get(1).name);
    }
}