package apis.made;

public class MyIntArrayTest {
    public static void main(String[] args) {
        IntArray list = new IntArray();
        list.add(1);
        list.add(2);
        list.add(3);


        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));

        System.out.println(list.size());
    }

}
