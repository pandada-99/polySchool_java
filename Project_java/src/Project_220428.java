// 220421 SW활용및코딩(오세진교수님)
import java.util.Scanner;

class Circle{
    int radius;
    public Circle(int radius) {
        this.radius = radius;
    }
    public void set(int radius) {
        this.radius = radius;
    }
    public double getArea() {
        return 3.14*radius*radius;
    }
}

class Book {
    String title;
    String author;
    void show() { System.out.println(title + " " + author); }

    public Book() {
        this("", "");
        System.out.println("생성자 호출됨");
        System.out.println(1);
    }

    public Book(String title) {
        this(title, "작자미상");
        System.out.println(2);
    }

    public Book(String title, String author) {
        this.title = title;
        this. author = author;
        System.out.println("this.으로 이동");
    }
}

class Book2 {
    String title;
    String author;

    public Book2(String title, String author) {
        this.title = title;
        this.author = author;
    }
}

public class Project_220428 {
    public static void main(String[] args) {
        Circle ob1 = new Circle(1);
        Circle ob2 = new Circle(2);
        Circle ob3 = new Circle(3);

        ob1.set(4);
        ob2.set(5);
        ob3.set(6);

        Book littlePrince = new Book("어린왕자", "생텍쥐페리");
        Book loveStory = new Book("춘향전");
        Book emptyBool = new Book();
        loveStory.show();
        System.out.println("---------------------------------------------");

        Circle [] c;
        c = new Circle[5];

        for(int i = 0; i<c.length; ++i) {
            c[i] = new Circle(i);
        }
        for(int i = 0; i<c.length; ++i) {
            System.out.print((int)(c[i].getArea()) + " ");
        }
        System.out.println();
        System.out.println("---------------------------------------------");

        Book2 [] book = new Book2[2]; // book 배열 선언

        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i< book.length; ++i) {
            System.out.print("제목>>");
            String title = scanner.nextLine();
            System.out.print("저자>>");
            String author = scanner.nextLine();
            book[i] = new Book2(title, author);
        }

        for(int i = 0; i< book.length; ++i) {
            System.out.print("(" + book[i].title + ", " + book[i].author + ")");
        }
        scanner.close();
    }
}