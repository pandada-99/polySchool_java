// 220420 자료구조(강교수님)
public class Matzip_220420 {
    String name;
    String addr;

    Matzip_220420(String name, String addr) {
        this.name = name;
        this.addr = addr;
    }

    void showInfo() {
        System.out.printf("%s 식당의 주소는 %s 입니다.\n", name, addr);
    }

    public static void main(String[] args) {
        Matzip_220420 m1 = new Matzip_220420("아지트", "대구");
        Matzip_220420 m2 = new Matzip_220420("평리당", "평리동");
        Matzip_220420 m3 = new Matzip_220420("영화식당", "영천");

        MyLinkedlist_220420<Matzip_220420> matziplist = new MyLinkedlist_220420();
        // <Matzip_220420> 는 Matzip_220420라는 class를 받을거라는 뜻.
        // int Myarray[] = new int[5]; ==> 여기서 int 역할을 하는게 <Matzip_220420>
        matziplist.add(0, m1);
        matziplist.add(0, m2);
        matziplist.add(2, m3);

//        matziplist.remove(1);

        System.out.println(matziplist.length());

        matziplist.get(0).showInfo();
        matziplist.get(1).showInfo();
        matziplist.get(2).showInfo();
    }
}