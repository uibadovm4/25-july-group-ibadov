package lesson16;

public class Book {
    String title;
    String author;
    int pageCount;
    public static void main(String[] args) {
        Book book1 = new Book();
        book1.title = "Java Programming";
        book1.author = "John Doe";
        book1.pageCount = 350;

        System.out.println("Title: " + book1.title);
        System.out.println("Author: " + book1.author);
        System.out.println("Page Count: " + book1.pageCount);

        System.out.println(book1.toString());
    }
}
