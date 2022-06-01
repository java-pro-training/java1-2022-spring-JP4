package lv.lu.training.lessson9.bookstore;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BookStore {

    public static void main(String[] args) {
        List<Book> books = createBookList();
        print(books, "Unsorted list");

        books.sort(new AuthorComparator());
        print(books, "Sorted list by author:");

        Collections.sort(books);
        print(books, "Sorted list by title:");


        Book book1= new Book(
                "She Felt Like Feeling Nothing",
                "r.h. Sin", Genre.DRAMA);

        Book book2 = new Book(
                "Ready Player One",
                "Ernest Cline", Genre.NOVEL);

        System.out.println(book1==book2);

        System.out.println("///////////////");
        System.out.println(book1.hashCode());
        System.out.println(book2.hashCode());

    }


    private static void print(List<Book> books, String message) {
        System.out.println("====" + message + "====");
        books.forEach(System.out::println);
        System.out.println("==========================");
    }


    private static List<Book> createBookList() {
        List<Book> books = new ArrayList<>();
        books.add(new Book(
                "She Felt Like Feeling Nothing",
                "r.h. Sin", Genre.DRAMA));
        books.add(new Book(
                "True Roots",
                "Kristin Cavallari", Genre.DETECTIVE));
        books.add(new Book(
                "The Female Persuasion",
                "Meg Wolitzer", Genre.NOVEL));
        books.add(new Book(
                "Ready Player One",
                "Ernest Cline", Genre.NOVEL));
        return books;
    }


}
