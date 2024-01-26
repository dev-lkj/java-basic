package object;

public class ObjectTest {
    public static void main(String[] args) {

        // A 객체를 Upcating으로 생성하세요.
//        A a = new A();
//        a.display();
        Object obj = new A();// Upcasting
        ((A)obj).display(); // DownCasting


    }

    
}
