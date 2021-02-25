package example01;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class Question05 {
    public static void main(String[] args) {

        /*
         * Kullanicidan  boyunu cm olarak, kilosunu kilogram olarak alin
         * ve vucut kutle endeksini bulun.
         * ondalikli sayi olarak yazdirin
         * ve index e göre zayıf kilolu ve hakkında yorum yaptır
         */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Boyunuzu ekrana m olarak giriniz: ");
        double boy = scanner.nextDouble();
        System.out.print("Kilonuzu ekrana kg olarak giriniz: ");
        double kilo = scanner.nextDouble();
        double VKE = kilo / (boy * boy);
        System.out.println("VKE SAYINIZ: " + VKE);
        if (VKE > 0 && VKE < 18.4) {
            System.out.println("ZAYIFSINIZ AZCIK YEMEK YİYİNİZ");
        } else if (VKE >= 18.4 && VKE <= 24.9) {
            System.out.println("KİLONUZ NORMAL YEMEĞE DEVAM");
        } else if (VKE >= 25 && VKE <= 29.9) {
            System.out.println("KİLONUZ NORMAL DEĞİL DİKKAT EDİNİZ");
        } else if (VKE > 30) {
            System.out.println("DOKTORUNUZA BAŞVURUNUZ OBEZİTE");
        }


    }
}
