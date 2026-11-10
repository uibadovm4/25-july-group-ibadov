package lesson14;

import java.util.Scanner;
public class TaskFour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        n = Math.abs(n);

        int min = 9;

        while (n > 0) {
            int digit = n % 10;

            if (digit < min) {
                min = digit;
            }

            n /= 10;
        }

        System.out.println(min);
    }
}

