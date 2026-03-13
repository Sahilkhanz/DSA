
public class Q1_Selection_Sort {

    public static void main(String[] args) {

        int arr[] = {13, 46, 24, 52, 20, 9};

        selctionSort(arr);
        for (int cell : arr) {
            System.out.print(cell + " ");
        }
    }

    public static void selctionSort(int[] arr) {
        for (int i = 0; i <= arr.length - 2; i++) {
            int min = i;
            for (int j = i; j <= arr.length - 1; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }
}
