
public class Sample {

    public static void main(String[] args) {
        int n = 10;
        int result = n;
        System.out.println(result);
        int i = 1;
        while (i <= 4) {
            result = result << 1;
            System.out.println(result);
            i++;
        }

    }
}
