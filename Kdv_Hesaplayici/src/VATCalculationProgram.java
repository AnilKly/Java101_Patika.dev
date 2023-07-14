import java.util.Scanner;

public class VATCalculationProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the amount: ");
        double amount = scanner.nextDouble();

        double vatRate;
        if (amount > 0 && amount <= 1000) {
            vatRate = 0.18;
        } else {
            vatRate = 0.08;
        }

        double vatAmount = amount * vatRate;
        double totalAmount = amount + vatAmount;

        System.out.println("Net Price: " + amount);
        System.out.println("VAT Rate: %" + (vatRate * 100));
        System.out.println("VAT Amount: " + vatAmount);
        System.out.println("Gross Price: " + totalAmount);
    }
}
