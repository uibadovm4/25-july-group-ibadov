package lesson18;

import java.util.Scanner;

public class University {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Adinizi daxil edin: ");
            String ad = scanner.nextLine();
            System.out.print("Programlasdirma dili daxil edin: ");
            String programlasdirmaDili = scanner.nextLine();

            System.out.printf(ad + " Deyir: \nMen " + programlasdirmaDili + " proqramlasdirma dilini oyrenmek ucun yaziram:\n \"C:\\Users\\%s\\Desktop\\%s\\code.extension\"" , ad, programlasdirmaDili);
        }

        // String ad = "Aysel";
        // int yas = 15;
        // String mekteb = "Xəzər Liseyi";
        // double qiymet = 95.5;

        // String cumle1 = String.format("Adim: %s, Yaşim: %d,  %snde Oxuyuram, qiymetim %.1f", ad, yas, mekteb, qiymet);
        // System.out.println(cumle1);


    }
}
