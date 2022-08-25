import java.util.ArrayList;
import java.util.LinkedList;

// Class의 상속과 다형성 (자료구조_220406_강현우교수님)
// 다형성: 같은 코드인데 다르게 구현된다.
enum Gender {Male, Female}
enum Etype {Prof, Student, Manager}

class Person2 {
    String name;
    int age;
    Gender gender;

    Person2 () {} // Boss class를 받아주기 위해 빈 Person2 생성자가 필요함.

    // 생성자는 리턴 타입이 없다. class이름과 같아야 한다.
    Person2 (String name, int age, Gender gender) {
        this.name = name; // this.name은 class의 name이고 뒤에 흰색 name은 생성자{}에서만 사용하는 변수.
        this.age = age;
        this.gender = gender;
    }

    void showInfo() {
        System.out.println("저의 이름은 " + name + "이고, " + "성별은 " + gender + "이고, 나이는 " + age + "세 입니다.");
    }
}

class Employee extends Person2 {
    int salary;

    Employee (String name, int age, Gender gender, int salary) {
        super(name, age, gender); // 아빠함수에 접근하는법: super
        this.salary = salary;
    }

    void showInfo() {
        System.out.printf("[%s] %d세, %s : %d\n", // 메소드 오버라이딩: 아빠함수에서 받은걸 재정의한것
                          name, age, gender, salary);
    }

    void doWork() {
        System.out.println(name + "은/는 열심히 일합니다.");
    }
}

class Porf extends Employee {
    Etype type;

    Porf (String name, int age, Gender gender, int salary) {
        super(name, age, gender, salary);
        type = Etype.Prof;
    }

    void doWork() {
        System.out.println("학생을 가르칩니다.");
    }
}

class Student extends Employee {
    Etype type;

    Student (String name, int age, Gender gender, int salary) {
        super(name, age, gender, salary);
        type = Etype.Student;
    }

    void doWork() {
        System.out.println("열심히 공부합니다.");
    }
}

class Manager extends Employee {
    Etype type;

    Manager (String name, int age, Gender gender, int salary) {
        super(name, age, gender, salary);
        type = Etype.Manager;
    }

    void doWork() {
        System.out.println("학생과 교수를 관리합니다."); // 메소드 오버라이딩: 아빠함수에서 받은걸 재정의한것
    }
}

class Boss extends Person2 {
    Employee[] employees;
    int MAX_EMPLOY = 100;
    int n_curEmploy = 0;

    Boss() {
        name = "I'm the Boss!";
        age = 99;
        gender = Gender.Male;
        employees = new Employee[MAX_EMPLOY]; // 동적 바인딩
    }

    void hire(Employee e) {
        if (n_curEmploy < MAX_EMPLOY) {
                employees[n_curEmploy] = e;
                ++n_curEmploy;
                System.out.printf("%s를 고용했고, 현재 고용인원은 %d명 입니다.\n", e.name, n_curEmploy);
        }
        else {
            System.out.println("더 이상 고용할 수 없습니다.");
        }
    }

    void makeEmplyWork() {
        for (int i = 0; i < n_curEmploy; ++i){
             employees[i].showInfo();
             employees[i].doWork();
        }
    }
}

public class Project_220406 {
    public static void main(String[] args) {
        Person2 p = new Person2("강현우", 44, Gender.Male);
        p.showInfo();

        Employee e = new Employee("강현우", 44, Gender.Male, 1000);
        e.showInfo();
        e.doWork();

        Porf f = new Porf("강현우", 44, Gender.Male, 1000);
        f.doWork();

        Student s = new Student("안원영", 27, Gender.Male, 2000);
        s.showInfo();
        s.doWork();

        Manager m = new Manager("신주석", 42, Gender.Male, 3000);
        m.showInfo();
        m.doWork();

        Boss b = new Boss();
        b.showInfo();

        b.hire(f);
        b.hire(s);
        b.hire(m);

        b.makeEmplyWork();

        // 리스트(List)-선형/링크 리스트 (자료구조_220408_강현우교수님)
        // 오버로딩: 인자에 따라 다른 기능을 하는 함수 (Method Overloading, Operator Overloading)
        // 오버라이딩: 자식함수가 부모함수에게 받을걸 재정의하는 것
        ArrayList aList = new ArrayList();
        aList.add(1);
        aList.add(f);
        aList.add(s);
        aList.add(m);
        aList.add(0, b);

        System.out.println(aList.size());
        // alist[i]
        for (int i = 0; i < aList.size(); ++i) {
            System.out.println(aList.get(i).getClass());
        }
        for (Object o : aList) {
            System.out.println(o.getClass());
        }

        LinkedList<Employee> employees = new LinkedList<>();

        employees.add(f);
        employees.add(s);
        employees.add(m);

        for (Employee ee : employees) {
            ee.showInfo();
        }

        for (int i = 0; i < employees.size(); ++i) {
            employees.get(i).showInfo();
        }

        System.out.println();


        // 220413 자료구조(강교수님)
        MyArraylist_220413<Employee> mylist = new MyArraylist_220413();

        mylist.add(f);
        mylist.add(s);
        mylist.add(m);
        // [f] [s] [m] size = 3

        mylist.add(0, m);
        mylist.remove(1);

        for (int i = 0; i < mylist.size(); ++i) {
            mylist.get(i).showInfo();
        }
        System.out.println();

        Employee listTest = mylist.get(0);
        listTest.showInfo();
        System.out.println();
    }
}