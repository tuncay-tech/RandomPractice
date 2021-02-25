package example01;

import java.util.Scanner;

public class Question02 {
    public static void main(String[] args) {
        /*
         * Kullanicinin girdigi 4 basamakli sayinin rakamlari toplamini veren programi yaziniz.
         */
        int toplam = 0;
        int son_bas;
        Scanner girdi = new Scanner(System.in);
        System.out.print("4 basamaklı bir sayı giriniz: ");
        int sayi = girdi.nextInt();

        for (int i = 0; i <= 4; i++) {
            son_bas = sayi % 10;
            toplam = toplam + son_bas;
            sayi = (sayi - son_bas) / 10;
        }

        System.out.println("yazılan sayının rakamları toplamı: " + toplam);
    }
}
