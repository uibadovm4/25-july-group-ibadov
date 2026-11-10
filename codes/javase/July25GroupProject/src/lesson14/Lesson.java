package lesson14;
import java.util.Scanner;

public class Lesson {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean a = true;
        do{
            // System.out.println("Enter a number:");
            // int n = sc.nextInt();
            
            // if(0 >= n){
            //     System.out.println("The number has to be positive");
            //     a = true;
            // } else {
            //     System.out.println("The number is positive");
            //     a = false;
            // }

            System.out.println("1.Start the game\n2. Profile\n3. Logout:");
            int n = sc.nextInt();
            if(n == 1 || n == 2){
                a = true;
            } else if(n == 3){
                System.out.println("logged out");
                a = false;
            }else if (n > 3){
                System.out.println("Invalid input");
                a = true;
            }


        }
        while(a == true);
    }
}
