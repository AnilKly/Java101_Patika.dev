import java.util.Scanner;

public class PowerOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayı girin: ");
        int number = scanner.nextInt();

        System.out.println("Girdiğiniz sayıya kadar olan 4 ve 5'in katları:");
        for (int i = 1; i <= number; i++) {
            if (i % 4 == 0 || i % 5 == 0) {
                System.out.println(i);
            }
        }
    }
}

