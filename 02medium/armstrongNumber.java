import java.util.Scanner;

public class armstrongNumber {
    public static void main(String[] args) {
        System.out.println();
        
        try( Scanner in = new Scanner(System.in)) {
            int n = in.nextInt();
            System.out.println(isArmstrong(n));
        }
    }

    static boolean isArmstrong(int n) {
        int original = n;
        int sum = 0;

        while (n>0) {
            int rem = n % 10;
            n = n / 10;
            sum = sum + rem*rem*rem;
        }

        return sum == original;
    }
}
