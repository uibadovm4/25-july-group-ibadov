package lesson17;

public class Student {
    String name;
    String surname;
    int age;
    String group;



    public static void main(String[] args) {

        String password1 = "Java123";
        String password2 = "java123";
        String password3 = "JAVA123";

        System.out.println(password1.equals(password2));
        System.out.println(password1.equalsIgnoreCase(password2));

        System.out.println(password1.equals(password3));
        System.out.println(password1.equalsIgnoreCase(password3));

        String text = "Azerbaijan";

        System.out.println("Uzunluq: " + text.length());
        System.out.println("İlk simvol: " + text.charAt(0));
        System.out.println("Son simvol: " + text.charAt(text.length() - 1));
        System.out.println("a simvolunun ilk indeksi: " + text.indexOf('a'));
        System.out.println("Beraberdir: " + text.equalsIgnoreCase("AZERBAIJAN"));

        Student student1 = new Student();
        student1.name = "Murad";
        student1.surname = "Eliyev";
        student1.age = 19;
        student1.group = "Java01";

        System.out.println("Ad: " + student1.name);
        System.out.println("Soyad: " + student1.surname);
        System.out.println("Yas: " + student1.age);
        System.out.println("Qrup: " + student1.group);

    }
}
