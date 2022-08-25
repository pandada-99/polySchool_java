// 220422 자료구조(강교수님)
class Human {
    String name;
    int age;

    Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void intro() {
        System.out.println(name + " " + age);
    }
}

public class Project_220422 {

    public static void main(String[] args) {

        Human h1 = new Human("이은정", 26);
        Human h2 = new Human("이은주", 29);
        Human h3 = new Human("전원우", 27);
        Human h4 = new Human("최승철", 28);

        MyLinkedlist_220422<Human> humanlist = new MyLinkedlist_220422();
        humanlist.add(h1);
        humanlist.add(h2);
        humanlist.add(0, h3);
        humanlist.add(1, h4);
        humanlist.remove(1);

        for (int i =0; i < humanlist.length(); ++i) {
            humanlist.get(i).intro();
        }
        System.out.println("size is " + humanlist.length());
    }
}
