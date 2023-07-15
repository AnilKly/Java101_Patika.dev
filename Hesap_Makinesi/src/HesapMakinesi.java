import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("İlk sayıyı giriniz: ");
        double sayi1 = scanner.nextDouble();

        System.out.print("İkinci sayıyı giriniz: ");
        double sayi2 = scanner.nextDouble();

        System.out.println("İşlem seçin: ");
        System.out.println("1. Toplama");
        System.out.println("2. Çıkarma");
        System.out.println("3. Çarpma");
        System.out.println("4. Bölme");

        System.out.print("Seçiminizi yapın (1-4): ");
        int secim = scanner.nextInt();

        double sonuc = 0;

        switch (secim) {
            case 1:
                sonuc = sayi1 + sayi2;
                break;
            case 2:
                sonuc = sayi1 - sayi2;
                break;
            case 3:
                sonuc = sayi1 * sayi2;
                break;
            case 4:
                sonuc = sayi1 / sayi2;
                break;
            default:
                System.out.println("Geçersiz bir seçim yaptınız.");
                break;
        }

        System.out.println("Sonuç: " + sonuc);

        scanner.close();
    }
}
