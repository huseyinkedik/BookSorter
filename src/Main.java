import java.util.*;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Kürk Mantolu Madonna", 176, "Sabahattin Ali", "1943");
        Book book2 = new Book("Sineklerin Tanrısı", 272, "William Golding", "1954");
        Book book3 = new Book("Yabancı", 160, "Albert Camus", "1942");
        Book book4 = new Book("Istanbul Hatırası: Beyoğlu'nda Geçen Bir Zaman", 488, "Ahmet Ümit", "2000");
        Book book5 = new Book("Kuyucaklı Yusuf", 132, "Sabahattin Ali", "1937");

        Set<Book> bookSetByTitle = new TreeSet<>();
        bookSetByTitle.add(book1);
        bookSetByTitle.add(book2);
        bookSetByTitle.add(book3);
        bookSetByTitle.add(book4);
        bookSetByTitle.add(book5);

        System.out.println("İsme göre sıralama: ");
        for (Book book : bookSetByTitle) {
            System.out.println(book);
        }

        Comparator<Book> pageCountComparator = Comparator.comparingInt(Book::getPageCount);

        Set<Book> bookSetByPageCount = new TreeSet<>(pageCountComparator);
        bookSetByPageCount.add(book1);
        bookSetByPageCount.add(book2);
        bookSetByPageCount.add(book3);
        bookSetByPageCount.add(book4);
        bookSetByPageCount.add(book5);

        System.out.println("\nSayfa sayısına göre sıralama: ");
        for (Book book : bookSetByPageCount) {
            System.out.println(book);
        }
    }
}
