public class reverseNumber {
    public static void main(String[] args) {
        System.out.println();

        int n = 2343342;
        int ans = 0;

        while (n > 0) {
            int rem = n%10;
            n /= 10;

            ans = ans*10 + rem;
        }

        System.out.println(ans);
    }
}