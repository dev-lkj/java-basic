package object;

public class ObjectPolyTest {
    public static void main(String[] args) {
        A a = new A();
        display(a);
        B b = new B();
        display(b);
    }

    private static void display(Object object) { // 다형성인수 활용
        if (object instanceof A) {
            ((A)object).display();
        } else {
            ((B)object).display();
        }
    }

}
