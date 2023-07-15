import java.util.Scanner;

public class DaireAlanCevre {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Dairenin yarıçapını giriniz: ");
        double yariCap = scanner.nextDouble();

        double alan = Math.PI * yariCap * yariCap;
        double cevre = 2 * Math.PI * yariCap;

        System.out.println("Dairenin Alanı: " + alan);
        System.out.println("Dairenin Çevresi: " + cevre);

        scanner.close();
    }
}
