package lesson16;

public class Lesson {
    public static void main(String[] args) {
        for (int i = 1; i <= 30; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                continue;
            }

            System.out.println(i);
        }

        //

        int[] prices = {10, 25, 30, 15, 3, 66, 78, 9, 11, 23};

        int evenSum = 0;
        int oddSum = 0;

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] % 2 == 0) {
                evenSum += prices[i];
            } else {
                oddSum += prices[i];
            }
        }

        System.out.println(evenSum);
        System.out.println(oddSum);
        
        //
        
        int number = 17;
        boolean isPrime = true;

        if (number < 2) {
            isPrime = false;
        } else {
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println(number + " sade ededdir");
        } else {
            System.out.println(number + " sade deyil");
        }
    }
}
