package example01;

import javax.xml.bind.SchemaOutputResolver;
import java.util.Scanner;

public class Question01 {
    public static void main(String[] args) {

        /*
         * Kullaniciya gunde kac saat uyudugunu sorun,
         * ayda yilda ve 40 yilda kac gununun uykuda gectigini yazdirin
         */

        Scanner scanner = new Scanner(System.in);
        System.out.print("günde kaç saat uyuyorsunuz ?: ");
        float saat = scanner.nextFloat();
        float ay = (saat * 30) / 24;
        float yıl = (saat * 365) / 24;
        float kırkyıl = (saat * 365 * 40) / 24;
        System.out.println("ayda: " + ay + " gün uyuyorsunuz");
        System.out.println("yılda: " + yıl + " gün uyuyorsunuz");
        System.out.println("kırk yılda: " + kırkyıl + " gün uyuyorsunuz");
    }
}
