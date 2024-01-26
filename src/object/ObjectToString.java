package object;

public class ObjectToString {
    public static void main(String[] args) {
        Board b = new Board();
        b.setTitle("게시글 입니다.");
        System.out.println(b.getTitle());
        System.out.println(b.toString()); // Board@asdfsaf
        System.out.println(b);
    }
}
