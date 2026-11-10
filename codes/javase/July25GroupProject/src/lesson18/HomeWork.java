package lesson18;

public class HomeWork {
    public static void main(String[] args) {
        String name = "Meherrem";
        String message = "Java oyrenmek Maraqlidir ve Faydalidir";
        char character = 'a';

        System.out.println(name);
        System.out.println(message);

        System.out.println(message.length());
        System.out.println(message.charAt(7));
        System.out.println(message.indexOf("n"));
        System.out.println(message.toLowerCase());
        System.out.println(message.toUpperCase()); 
        System.out.println(message.contains(character + ""));
        System.out.println(message.startsWith("Java"));
        System.out.println(message.endsWith("ir"));

        String name1 = "  Ayxan  ";
        System.out.println(name1.trim());

        String name2 = "Kamil";
        System.out.println(name2.charAt(4));

        String[] fullName = "Ibadov Ugur".split(" ");
        for (String name3 : fullName) {
            System.out.println(name3);
        }
 
    }
}
