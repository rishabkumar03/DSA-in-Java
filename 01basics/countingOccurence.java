public class countingOccurence {
    public static void main(String[] args) {
        System.out.println();

        int n = 434892;
        int count = 0;

        while (n > 0) {
            int rem = n % 10;
            if (rem == 4) {
                count++;
            }
            n = n/10;
        }

        System.out.println(count);
    }
}
