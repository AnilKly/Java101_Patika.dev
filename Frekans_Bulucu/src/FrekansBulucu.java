import java.util.HashMap;
import java.util.Scanner;

public class FrekansBulucu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Dizi boyutunu girin: ");
        int boyut = scanner.nextInt();
        int[] dizi = new int[boyut];

        System.out.println("Dizi elemanlarını girin:");
        for (int i = 0; i < boyut; i++) {
            dizi[i] = scanner.nextInt();
        }

        HashMap<Integer, Integer> frekanslar = new HashMap<>();

        for (int eleman : dizi) {
            if (frekanslar.containsKey(eleman)) {
                frekanslar.put(eleman, frekanslar.get(eleman) + 1);
            } else {
                frekanslar.put(eleman, 1);
            }
        }

        for (int eleman : frekanslar.keySet()) {
            int tekrarSayisi = frekanslar.get(eleman);
            System.out.println(eleman + " sayısı " + tekrarSayisi + " kere tekrar edildi.");
        }

        scanner.close();
    }
}
