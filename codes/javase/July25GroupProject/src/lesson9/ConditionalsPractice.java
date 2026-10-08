package lesson9;

public class ConditionalsPractice {
    public static void main(String[] args) {
        int age = 18;
        boolean hasID = true;

        if (age >= 18 && hasID) {
            System.out.println("You can enter the club.");
        } else {
            System.out.println("You cannot enter the club.");
        }

        int score = 84;
        if (score >= 90) {
            System.out.println("Grade: A");
        } else if (score >= 80) {
            System.out.println("Grade: B");
        } else if (score >= 70) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Grade: F");
        }
    }
}
