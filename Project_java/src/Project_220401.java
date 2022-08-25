class Person {
    String name;
    int height;
    int weight;

    Person() // 생성자: class와 같은이름이고 리턴이 없다. (class의 특별한 method)
    {
        name = "Hong Gildong";
        height = 180;
        weight = 75;
        // this("Hong Gildong", 180, 75);
        // this() 메소드: 생성자 호출
    }

    Person(String name, int height, int weight)
    {
        this.name = name; // this.: 자기자신을 참조함
        this.height = height;
        this.weight= weight;
    }

    void sayHello ()
    {
        System.out.println("안녕하세요. 저는 " + this.name + "입니다.");
    }

}

public class Project_220401 {
    public static void main(String[] args) {
        // 'class이름' '변수이름' = new '생성자이름'
        // Person라는 class에 있는 Person라는 생성자를 가져와서 'p' 라는 변수에 넣어서 쓰겠다.
        Person p = new Person();
        System.out.println(p.name + "의 키는 " + p.height + "cm 입니다.");
        p.sayHello();

        Person p2 = new Person("김서방", 175, 80);
        System.out.println(p2.name + "의 키는 " + p2.height + "cm 입니다.");
        p2.sayHello();

    }
}