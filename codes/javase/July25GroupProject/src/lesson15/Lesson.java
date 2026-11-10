package lesson15;

public class Lesson {
    public static void main(String[] args) {
        int[] prices = {10, 25, 30, 15};
        int total = 0;

        for (int price : prices) {
            total += price;
        }

        System.out.println(total);
    }
}