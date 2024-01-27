package apis.manual;

public class MinMaxFinderTest {

    public static void main(String[] args) {
        int[] arr = {5, 3, 9, 1, 7};

        int min = MinMaxFinder.findMin(arr);
        int max = MinMaxFinder.findMax(arr);

        System.out.println("Minimum value: " + min); // 1
        System.out.println("Maximum value: " + max); // 9
    }

}
