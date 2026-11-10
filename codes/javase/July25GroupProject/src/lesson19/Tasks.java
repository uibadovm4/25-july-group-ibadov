package lesson19;

import java.util.Scanner;

public class Tasks {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // // Task 1

        // System.out.print("Mehsulun adi: ");
        // String name = sc.nextLine();

        // System.out.print("Qiymeti: ");
        // double price = sc.nextDouble();

        // System.out.print("Sayi: ");
        // int count = sc.nextInt();

        // double total = price * count;

        // System.out.println("Mehsul: " + name);
        // System.out.printf("Qiymet: %.2f AZN%n", price);
        // System.out.println("Say: " + count);
        // System.out.printf("Umumi mebleg: %.2f AZN%n", total);

        // // Task 2
        // System.out.print("Her hansi bir soz daxil edin: ");
        // String word = sc.next().toLowerCase();

        // if (word.charAt(0) == word.charAt(word.length() - 1)) {

        //     System.out.println("Same characters");

        // } else {
        //     System.out.println("Different characters");
        // }

        // Task 3
        System.out.print("Soz daxil edin: ");
        String word1 = sc.nextLine();

        String reverse = "";

        for (int i = word1.length() - 1; i >= 0; i--) {
            reverse += word1.charAt(i);
        }

        if (word1.equals(reverse)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not palindrome");
        }

        sc.close();

    }
}