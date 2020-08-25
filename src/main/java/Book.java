public class Book {

//    Write a method to count the number of books in the library.
//    Write a method to add a book to the library stock.
//    Add a capacity to the library and write a method to check if stock is full before adding a book.

    private String title;
    private String author;
    private String genre;

    public Book(String title, String author, String genre) {
        this.title = title;
        this.author = author;
        this.genre = genre;
    }

    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

    public String getGenre() {
        return this.genre;
    }
}
