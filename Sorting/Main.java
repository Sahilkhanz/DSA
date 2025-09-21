
public class Main {

    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11, 90, 34, 67, 2, 45};

        // Calling bubbleSort from BubbleSort.java
        BubbleSort.bubbleSort(arr);

        // Printing sorted array
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
