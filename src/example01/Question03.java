package example01;

import java.util.Scanner;

public class Question03 {
    public static void main(String[] args) {
        /*
         * Kullanicinin girdigi 4 basamakli sayinin rakamlari toplamini veren programi yaziniz.
         * baska bir çözüm for döngüsü olmadan tamamen int yardımıy yani temel 4 işlemler
         */

        Scanner scanner = new Scanner(System.in);
        System.out.print("Dört basamaklı bir sayı yazınız: ");
        int sayi = scanner.nextInt();
        int binler_bas = (sayi / 1000);
        int yuzler_bas = (sayi / 100) % 10;
        int onlar_bas = (sayi / 10) % 10;
        int birler_bas = sayi % 10;
        int toplam = binler_bas + yuzler_bas + onlar_bas + birler_bas;
        System.out.println("yazdığınız sayının rakamları toplamı: " + toplam);

    }
}
