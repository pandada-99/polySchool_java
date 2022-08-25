// 220526 SW활용및코딩(오세진교수님)
class Shape {
    public Shape next;
    public Shape() {next = null;}

    public void draw() {
        System.out.println("Shape");
    }
}

class Line extends Shape {
    public void draw() { // 메소드 오버라이딩
        System.out.println("Line");
    }
}

class Rect extends Shape {
    public void draw() { // 메소드 오버라이딩
        System.out.println("Rect");
    }
}

class Circle2 extends Shape {
    public void draw() { // 메소드 오버라이딩
        System.out.println("Circle");
    }
}

public class MethodOverridingEx_220526 {
    static void paint(Shape p) {
        p.draw();
    }

    public static void main(String[] args) {
        Line line = new Line();
        paint(line);
        paint(new Shape());
        paint(new Line());
        paint(new Rect());
        paint(new Circle2());
    }
}
