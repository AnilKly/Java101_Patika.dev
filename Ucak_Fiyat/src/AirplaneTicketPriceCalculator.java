import java.util.Scanner;

public class AirplaneTicketPriceCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Mesafeyi (KM) girin: ");
        int mesafe = scanner.nextInt();

        System.out.print("Yaşı girin: ");
        int yas = scanner.nextInt();

        System.out.print("Yolculuk tipini girin (1: Tek Yön, 2: Gidiş-Dönüş): ");
        int yolculukTipi = scanner.nextInt();

        double birimFiyat = 0.10;
        double toplamFiyat = birimFiyat * mesafe;

        if (mesafe <= 0 || yas <= 0 || (yolculukTipi != 1 && yolculukTipi != 2)) {
            System.out.println("Geçersiz Giriş!");
        } else {
            if (yas < 12) {
                toplamFiyat *= 0.5; // %50 indirim
            } else if (yas >= 12 && yas <= 24) {
                toplamFiyat *= 0.9; // %10 indirim
            } else if (yas >= 65) {
                toplamFiyat *= 0.7; // %30 indirim
            }

            if (yolculukTipi == 2) {
                toplamFiyat *= 0.8; // %20 indirim
            }

            System.out.println("Toplam Tutar: " + toplamFiyat + " TL");
        }
    }
}

