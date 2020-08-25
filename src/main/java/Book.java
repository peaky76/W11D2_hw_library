public class Book {

    private String title;
    private String author;
    private String genre;
    private Boolean isOnLoan;

    public Book(String title, String author, String genre) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.isOnLoan = false;
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

    public boolean checkIsOnLoan() {
        return this.isOnLoan;
    }
}
