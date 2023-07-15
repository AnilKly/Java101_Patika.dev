import java.util.Scanner;

public class SifreSifirlama {
    public static void main(String[] args) {
        String dogruSifre = "12345";
        String unutulanSifre = "67890";

        Scanner scanner = new Scanner(System.in);

        System.out.print("Şifrenizi giriniz: ");
        String girilenSifre = scanner.nextLine();

        if (girilenSifre.equals(dogruSifre)) {
            System.out.print("Şifrenizi sıfırlamak istiyor musunuz? (Evet/Hayır): ");
            String secim = scanner.nextLine();

            if (secim.equalsIgnoreCase("Evet")) {
                System.out.print("Yeni şifrenizi giriniz: ");
                String yeniSifre = scanner.nextLine();

                System.out.print("Yeni şifreyi tekrar giriniz: ");
                String yeniSifreTekrar = scanner.nextLine();

                if (yeniSifre.equals(unutulanSifre)) {
                    System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                } else if (!yeniSifre.equals(yeniSifreTekrar)) {
                    System.out.println("Girilen şifreler uyuşmuyor, lütfen tekrar deneyin.");
                } else {
                    System.out.println("Şifre oluşturuldu.");
                }
            } else {
                System.out.println("Şifre sıfırlama işlemi iptal edildi.");
            }
        } else {
            System.out.println("Hatalı şifre girdiniz.");
        }

        scanner.close();
    }
}
