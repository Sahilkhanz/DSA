
public class CountPrime {

    public static void main(String[] args) {
        int n = CountPrimeNum(100);
        System.out.println(n);
    }

    public static int CountPrimeNum(int n) {
        int primeArray[] = new int[n];

        if (n < 2) {
            return 0;
        }
        for (int i = 2; i < n; i++) {
            for (int j = 2; j < n; j++) {
                if (i * j < n) {
                    System.out.println("i * j" + (i * j));
                    primeArray[i * j] = 1;
                }
            }
        }

        int count = 0;
        for (int i = 0; i < primeArray.length; i++) {
            if (primeArray[i] == 0) {
                count++;
            }
        }

        return count - 2;

    }
}
