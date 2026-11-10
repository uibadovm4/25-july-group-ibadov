package lesson19;

public class Lesson {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("I love Java and I love Python");
        

        sb.delete(7, 12); 
        
        System.out.println(sb.toString()); 

    }
}
