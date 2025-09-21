
public class BinarySearch {

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int key = 11;
        if (binarySearch(arr, key)) {
            System.out.println("Key found");
        } else {
            System.out.println("key not found");
        }
    }

    static boolean binarySearch(int arr[], int key) {
        int n = arr.length - 1;
        if (n == 0) {
            return false;
        }
        int left = arr[0];
        int right = arr[n];
        int mid = 0;
        while (left < right) {
            mid = (left + right) / 2;
            if (key == arr[mid]) {
                return true;
            }
            if (arr[mid] > key) {
                right = arr[mid - 1];
            } else {
                left = mid + 1;
            }
        }

        return false;
    }
}
