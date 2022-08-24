public class Book {
    private String author;
    private String title;


    private static Book of(String author, String title) {
        Book book = new Book();
        book.title = title;
        book.author = author;
        return book;
    }

    public static void main(String[] args) {
        Book book = Book.of("Andrzej", "Rzeka");
        Book book2 = Book.of("Marcin", "Rzeczka");
        Book book3 = Book.of("Anetaa", "Lassek");
        System.out.println("Autor: " + book.author + " " + "Tytuł: " + book.title);
        System.out.println("Autor: " + book2.author + " " + "Tytuł: " + book2.title);
        System.out.println("Autor: " + book3.author + " " + "Tytuł: " + book3.title);

    }
}