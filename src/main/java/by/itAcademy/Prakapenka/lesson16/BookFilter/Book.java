package main.java.by.itAcademy.Prakapenka.lesson16.BookFilter;

public class Book
{
    private String name;
    private String author;
    private int editionYear;

    public Book(String name, String author, int editionYear) {
        this.name = name;
        this.author = author;
        this.editionYear = editionYear;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getEditionYear() {
        return editionYear;
    }

    public void setEditionYear(int editionYear) {
        this.editionYear = editionYear;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", editionYear=" + editionYear +
                '}';
    }
}
