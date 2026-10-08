package lesson8;

public class ArraysPractice {
    public static void main(String[] args) {
        int[] scores = {88, 91, 76, 95, 82};
        int sum = 0;

        for (int score : scores) {
            sum += score;
        }

        double average = sum / (double) scores.length;
        System.out.println("Average score: " + average);
        System.out.println("Highest score: " + findMax(scores));
    }

    public static int findMax(int[] numbers) {
        int max = numbers[0];

        for (int number : numbers) {
            if (number > max) {
                max = number;
            }
        }

        return max;
    }
}
