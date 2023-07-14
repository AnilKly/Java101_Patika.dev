import java.util.Scanner;

public class TaksimetreProgrami {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Gidilen Mesafeyi (KM) Girin: ");
        double mesafe = scanner.nextDouble();

        // Taksimetre açılış ücreti
        double acilisUcreti = 10.0;

        // KM başına ücret
        double kmBasinaUcret = 2.20;

        // Minimum ödenecek tutar
        double minimumTutar = 20.0;

        // Taksimetre tutarını hesapla
        double taksimetreTutari = acilisUcreti + (mesafe * kmBasinaUcret);

        // Minimum tutarı kontrol et
        if (taksimetreTutari < minimumTutar) {
            taksimetreTutari = minimumTutar;
        }

        System.out.println("Taksimetre Tutarı: " + taksimetreTutari + " TL");
    }
}
