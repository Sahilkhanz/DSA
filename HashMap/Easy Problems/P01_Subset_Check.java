// check if an array is subset of another array
// Given two arrays a[] and b[] of size m and n respectively, the task is to determine whether b[] is a subset of a[]. Both arrays are not sorted, 
// and elements are distinct.

// Examples: 
// Input: a[] = [11, 1, 13, 21, 3, 7], b[] = [11, 3, 7, 1] 
// Output: true
// Input: a[]= [1, 2, 3, 4, 5, 6], b = [1, 2, 4] 
// Output: true
// Input: a[] = [10, 5, 2, 23, 19], b = [19, 5, 3] 
// Output: false
import java.util.HashSet;

public class P01_Subset_Check {

    public static void main(String[] args) {
        int a[] = {11, 1, 13, 21, 3, 7}, b[] = {11, 3, 7, 1};

        System.out.println(naviveApproach(a, b));
        System.out.println(expectedApproach(a, b));
    }

    // T(n) = O(n*m) & Auxilary Space = O(1)
    public static boolean naviveApproach(int a[], int b[]) {
        int n = a.length;
        int m = b.length;
        for (int i = 0; i < m; i++) {
            boolean checkPresense = false;
            for (int j = 0; j < n; j++) {
                if (a[j] == b[i]) {
                    System.out.println(a[j] + " == " + b[i]);
                    checkPresense = true;
                    break;
                }
            }
            if (!checkPresense) {
                return false;
            }
        }
        return true;
    }

    // T(n) = O(n + m) and Auxilary Space = O(n)
    public static boolean expectedApproach(int a[], int b[]) {
        int n = a.length;
        int m = b.length;
        HashSet<Integer> hs = new HashSet<>();
        for (int i = 0; i < n; i++) {
            hs.add(a[i]);
        }

        for (int i = 0; i < m; i++) {
            if (!hs.contains(b[i])) {
                return false;
            }
        }
        return true;
    }
}
// b is a subset of a
