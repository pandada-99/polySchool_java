// 220519 SW활용및코딩(오세진교수님)
class Point {
    private int x, y;

    public void set(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public void showPoint() {
        System.out.println("("+x+", "+y+")");
    }
}

class ColorPoint extends Point {
    private String color;

    public void setColor(String color) {
        this.color = color;
    }
    public void showColorPoint() {
        System.out.print(color);
        showPoint();
    }
}

class Person3 {
    private int weight;
    int age;
    protected int height;
    public String name;

    public void setWeight(int weight) {
        this.weight = weight;
    }
    public int getWeight() {
        return weight;
    }
}

class Student3 extends Person3 {
    public void set() {
        age = 30;
        name = "홍길동";
        height = 175;
        setWeight(65);
    }
}

public class Project_220519 {
    public static void main(String [] args) {
        Point P = new Point();
        P.set(1, 2);
        P.showPoint();

        ColorPoint cp = new ColorPoint();
        cp.set(3,4);
        cp.setColor("red");
        cp.showColorPoint();

        Student3 s = new Student3();
        s.set();
    }
}
