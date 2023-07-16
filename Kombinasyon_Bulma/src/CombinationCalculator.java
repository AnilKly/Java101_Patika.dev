import java.util.Scanner;

public class CombinationCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("N'i girin: ");
        int n = sc.nextInt();

        System.out.print("R'yi girin: ");
        int r = sc.nextInt();

        int result = calculateCombination(n, r);

        System.out.println("C(" + n + ", " + r + ") = " + result);
    }

    public static int calculateCombination(int n, int r) {
        int numerator = factorial(n);
        int denominator = factorial(r) * factorial(n - r);
        int result = numerator / denominator;
        return result;
    }

    public static int factorial(int number) {
        if (number == 0) {
            return 1;
        }
        int result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        return result;
    }
}
