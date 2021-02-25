package example01;

import java.util.Scanner;

public class Question04 {
    public static void main(String[] args) {

        /*
         * Kullanicidan boyunu cm olarak, kilosunu kilogram olarak alin
         * ve vucut kutle endeksini bulun.
         * Sonucu tamsayi ve ondalikli sayi olarak yazdirin
         *
         * VKE= kilo/(boy*boy) …….. Kilo : kilogram , Boy : metre olmalidir
         *
         * Ornek : Input : boy :180 kilo : 80
         *         Output : Vucut kutle endeksiniz : 24
         *                  Vucut kutle endeksiniz : 24.691…
         */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Boyunuzu ekrana m olarak giriniz: ");
        double boy = scanner.nextDouble();
        System.out.print("Kilonuzu ekrana kg olarak giriniz: ");
        double kilo = scanner.nextDouble();
        double VKE = kilo/(boy*boy);
        System.out.println("VKE SAYINIZ: " + VKE);

    }
}

