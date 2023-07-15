import java.util.Scanner;

public class FibonacciSerisi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Fibonacci serisi için eleman sayısını girin: ");
        int elemanSayisi = scanner.nextInt();

        int ilkSayi = 0;
        int ikinciSayi = 1;

        System.out.print(elemanSayisi + " Elemanlı Fibonacci Serisi: ");

        if (elemanSayisi >= 1) {
            System.out.print(ilkSayi + " ");
        }

        if (elemanSayisi >= 2) {
            System.out.print(ikinciSayi + " ");
        }

        for (int i = 3; i <= elemanSayisi; i++) {
            int sonrakiSayi = ilkSayi + ikinciSayi;
            System.out.print(sonrakiSayi + " ");

            ilkSayi = ikinciSayi;
            ikinciSayi = sonrakiSayi;
        }
    }
}
