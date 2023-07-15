import java.util.Scanner;

public class GroceryProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double applePrice = 2.14;
        double pearPrice = 3.67;
        double tomatoPrice = 1.11;
        double bananaPrice = 0.95;
        double eggplantPrice = 5.00;

        System.out.print("Elma kaç kilo: ");
        int appleWeight = scanner.nextInt();

        System.out.print("armut kaç kilo: ");
        int pearWeight = scanner.nextInt();

        System.out.print("Domates kaç kilo: ");
        int tomatoWeight = scanner.nextInt();

        System.out.print("Muz kaç kilo: ");
        int bananaWeight = scanner.nextInt();

        System.out.print("Patlıcan Kaç kilo: ");
        int eggplantWeight = scanner.nextInt();

        double totalAmount = (applePrice * appleWeight) + (pearPrice * pearWeight) +
                (tomatoPrice * tomatoWeight) + (bananaPrice * bananaWeight) + (eggplantPrice * eggplantWeight);

        System.out.println("toplam fiyat: " + totalAmount + " TL");
    }
}
