import java.util.Scanner;

public class HypotenuseCalculationProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of the first leg: ");
        double leg1 = scanner.nextDouble();

        System.out.print("Enter the length of the second leg: ");
        double leg2 = scanner.nextDouble();

        double hypotenuse = Math.sqrt(Math.pow(leg1, 2) + Math.pow(leg2, 2));

        System.out.println("Hypotenuse: " + hypotenuse);
    }
}
