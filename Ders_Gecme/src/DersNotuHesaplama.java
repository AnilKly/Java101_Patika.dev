import java.util.Scanner;

public class DersNotuHesaplama {
    public static void main(String[] args) {
        String[] dersler = {"Matematik", "Fizik", "Türkçe", "Kimya", "Müzik"};
        int gecmeNotu = 55;

        Scanner scanner = new Scanner(System.in);

        int toplamNot = 0;
        int dersSayisi = dersler.length;

        for (int i = 0; i < dersSayisi; i++) {
            System.out.print(dersler[i] + " ders notunu giriniz: ");
            int not = scanner.nextInt();

            if (not >= 0 && not <= 100) {
                toplamNot += not;
            }
        }

        double ortalama = (double) toplamNot / dersSayisi;

        if (ortalama >= gecmeNotu) {
            System.out.println("Tebrikler, dersleri geçtiniz! Ortalama: " + ortalama);
        } else {
            System.out.println("Maalesef, dersleri geçemediniz. Ortalama: " + ortalama);
        }

        scanner.close();
    }
}
