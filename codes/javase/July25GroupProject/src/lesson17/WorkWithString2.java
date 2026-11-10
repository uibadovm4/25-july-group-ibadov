package lesson17;

public class WorkWithString2 {
    public static void main(String[] args) {
        String text = " ";
        System.out.println(text.isBlank());
        System.out.println(text.isEmpty());
        System.out.println(text.startsWith("Java"));
        System.out.println(text.endsWith("ing"));
        System.out.println(text.indexOf("Pro"));
        System.out.println(text.matches("[a-z]+"));

        String sentence = "Mən Java öyrənirəm və Java ilə layihələr hazırlayıram. Java öyərnmək mənim xoşuma gəlir";

        int index = 0 ;
    }
}
