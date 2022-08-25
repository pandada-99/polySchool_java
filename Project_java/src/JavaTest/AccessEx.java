package JavaTest;

public class AccessEx {
    public static void main(String[] args) {
        Sample aClass = new Sample();
        aClass.a = 10; // public
//        aClass.b = 10; // private
        aClass.c = 10; // 디폴트(default)
        aClass.d = 10; // protected

        // Math class의 abs 메소드는 static이여서 객체를 생성할 필요가 없다.
        int num = Math.abs(-82);
        System.out.println(num);
    }
}
