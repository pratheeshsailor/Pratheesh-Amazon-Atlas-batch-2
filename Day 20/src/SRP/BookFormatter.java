package SRP;

public class BookFormatter {
    public String getFormattedTitle(Book book) {
        return "Title: " + book.getTitle().toUpperCase();
    }

    public String getFormattedAuthor(Book book) {
        return "Author: " + book.getAuthor();
    }
}
