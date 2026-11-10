package lesson12;

import java.util.Scanner;

public class SwitchTasks {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir eded daxil edin: ");
        int hefteGunleri = scanner.nextInt();

        String result = switch (hefteGunleri) {
            case 1 -> "Bazar ertesi";
            case 2 -> "Bazar";
            case 3 -> "Cume axşamı";
            case 4 -> "Cume";
            case 5 -> "Şenbe";
            case 6 -> "Bazar ertesi";
            case 7 -> "Bazar";
            default -> "1-7 arasi eded daxil edin";
        };

        System.out.println("Netice: " + result);

        System.out.println(" ");
        System.out.println("|-----------------------------|");
        System.out.println(" ");

        System.out.print("Bir eded daxil edin: ");
        int month = scanner.nextInt();

        String fesil = switch (month) {
            case 1, 2, 3 -> "Yaz";
            case 4, 5, 6 -> "Yay";
            case 7, 8, 9 -> "Payiz";
            case 10, 11, 12 -> "Qis";
            default -> "1-12 arasi eded daxil edin";
        };

        System.out.println("Fesil: " + fesil);

        System.out.println(" ");
        System.out.println("|-----------------------------|"); 
        System.out.println(" ");

        System.out.print("Bir eded daxil edin: ");
        int monthName = scanner.nextInt();

        String monthResult = switch (monthName) {
            case 1 -> "Yanvar";
            case 2 -> "Fevral";
            case 3 -> "Mart";
            case 4 -> "Aprel";
            case 5 -> "May";
            case 6 -> "Iyun";
            case 7 -> "Iyul";
            case 8 -> "Avqust";
            case 9 -> "Sentyabr";
            case 10 -> "Oktyabr";
            case 11 -> "Noyabr";
            case 12 -> "Dekabr";
            default -> "1-12 arasi eded daxil edin";
        };

        System.out.println("Ay: " + monthResult);

        System.out.println(" ");
        System.out.println("|-----------------------------|");
        System.out.println(" ");

        System.out.println("1. Alma - 1.5 AZN");
        System.out.println("2. Portagal - 2.0 AZN");
        System.out.println("3. Banan - 1.8 AZN");
        System.out.println("4. Uzum - 3.0 AZN");

        System.out.print("Mehsul secin: ");
        int product = scanner.nextInt();

        switch (product) {
            case 1:
                System.out.println("Alma - 1.5 AZN");
                break;
            case 2:
                System.out.println("Portagal - 2.0 AZN");
                break;
            case 3:
                System.out.println("Banan - 1.8 AZN");
                break;
            case 4:
                System.out.println("Uzum - 3.0 AZN");
                break;
            default:
                System.out.println("1-4 arasi eded daxil edin");
        }

        scanner.close();
    }
}