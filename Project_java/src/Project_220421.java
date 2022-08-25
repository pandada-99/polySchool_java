// 220421 SW활용및코딩(오세진교수님)
import java.util.Scanner;

class Rectangle{
    int width;
    int height;
    public int getArea2() {
        return width*height;
    }
}

public class Project_220421 {
    int radius; // 원의 반지름 필드
    String name; // 원의 이름 필드

    public  Project_220421() {} // 생성자

    public double getArea() { // 원의 면적 계산 메소드
        return 3.14*radius*radius;
    }

    public static void main(String[] args) {
        Project_220421 pizza= new Project_220421();
        pizza.radius = 10;
        pizza.name = "자바피자";
        double area = pizza.getArea();
        System.out.println(pizza.name + "의 면적은 " + area + "입니다.");

        Project_220421 donut = new Project_220421();
        donut.radius = 2;
        donut.name = "자바도넛";
        area = donut.getArea();
        System.out.println(donut.name + "의 면적은 " + area + "입니다.");

        Rectangle rect = new Rectangle(); // 객체 생성
        Scanner scanner = new Scanner(System.in);
        System.out.println(">> ");
        rect.width = scanner.nextInt();
        rect.height = scanner.nextInt();
        System.out.println("사각형의 면적은 " + rect.getArea2());
        scanner.close();
    }
}