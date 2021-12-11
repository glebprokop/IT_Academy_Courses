package main.java.by.itAcademy.Prakapenka.lesson16.BookFilter;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class BookFilter
{
    public static void main(String[] args) {
        List<Book> myLibrary = new ArrayList<>();
        myLibrary.add(new Book("Filosophy of Java", "Bruss Ekkel", 2010));
        myLibrary.add(new Book("Three musketers", "Aleksander Duma", 1844));
        myLibrary.add(new Book("Obitaemii ostrov", "A.&B. Strugatskie", 1969));

        List<Book> myLibrarySorted =  myLibrary.stream()
                .sorted(Comparator.comparing(book -> book.getEditionYear()))
                .collect(Collectors.toList());

        myLibrarySorted.stream()
                .forEach(book -> System.out.println(book));
    }
}
