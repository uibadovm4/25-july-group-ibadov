package lesson15;
import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = 10;
        int n;
        
        do{
            n = sc.nextInt();
            if(n < x){
                System.out.println("balacadir boyutmelisen ");
            } else if(n > x){
                System.out.println("boyukdur azaltmalisan ");
            } else {
                System.out.println("beraberdir " + x);
            }
        } 
        while(n != x);
    }
}
