package interfaces;

public class Library {
    public static void main(String[] args) {
        Book book = new Book();
        book.setName("Sonic");

        book.print();
        System.out.println(book.getPrice());
    }
}
