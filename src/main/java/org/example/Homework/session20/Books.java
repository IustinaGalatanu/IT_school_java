package org.example.Homework.session20;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//Given a list of books with attributes: title, author, and year of publication; use streams to find all the books published before the year 2000 and group them by author in a map where the key is the author and the value is a list of titles of their books.
public class Books {
    public static void main(String[] args) {

        List<Book> books= Arrays.asList( new Book("The Lord of the Rings", "J.R.R. Tolkien", 1954), new Book("Harry Potter and the Philosopher's Stone", "J.K. Rowling", 1997),new Book("The Da Vinci Code", "Dan Brown", 2003),new Book("The Hobbit","J.R.R. Tolkien",1937));
        Map<String, List<String>> before2000=books.stream()
                .filter(b -> b.getYear() < 2000)
                .collect(Collectors.groupingBy(
                        Book::getAuthor,
                        Collectors.mapping(Book::getTitle, Collectors.toList())));
        System.out.println(before2000);


    }
}
class Book{
    private String title;
    private String author;
    private int year;

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }
}