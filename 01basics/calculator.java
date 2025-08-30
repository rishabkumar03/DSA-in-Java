import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        System.out.println();

        Scanner in = new Scanner(System.in);
        int ans = 0;
        while (true) {
            System.out.print("Enter the operator: ");
            char op = in.next().trim().charAt(0);

            switch (op) {
                case '+', '-', '*', '/', '%' -> {
                    System.out.print("Enter first number: ");
                    int num1 = in.nextInt();

                    System.out.print("Enter second number: ");
                    int num2 = in.nextInt();

                    System.out.println();
                    switch (op) {
                        case '+' -> ans = num1 + num2;
                        case '-' -> ans = num1 - num2;
                        case '*' -> ans = num1 * num2;
                        case '/' -> {
                            if (num2 != 0) {
                                ans = num1 / num2;
                            } else {
                                System.out.println("Cannot divide by zero.");
                                ans = 0;
                            }
                        }
                        case '%' -> ans = num1 % num2;
                    }
                }
                case 'x', 'X' -> {
                    in.close();
                    break;
                }
                default -> System.out.println("Invalid Option");
            }

        System.out.println(ans);
        }
    }
}
