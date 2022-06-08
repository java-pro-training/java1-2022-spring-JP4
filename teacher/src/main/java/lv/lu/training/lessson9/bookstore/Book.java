package lv.lu.training.lessson9.bookstore;

import java.util.Objects;

public class Book implements Comparable<Book> {

    private String title;
    private String author;
    private Genre genre;

    public Book(String title, String author, Genre genre) {
        this.title = title;
        this.author = author;
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return genre.getValue() + " - " + title + " - " + author;
    }

    @Override
    public int compareTo(Book book) {
        return title.compareTo(book.getTitle());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(title, book.title) && Objects.equals(author, book.author) && genre == book.genre;
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, genre);
    }
}
