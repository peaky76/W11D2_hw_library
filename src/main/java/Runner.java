public class Runner {

    public static void main(String[] args) {

        Library library = new Library(100);
        Book book1 = new Book("Mr Happy", "Roger Hargreaves", "Horror");
        Book book2 = new Book("Little Miss Sunshine", "Roger Hargreaves", "Philosophy");
        Book book3 = new Book("The Gruffalo", "Julia Donaldson", "Philosophy");
        library.add(book1);
        library.add(book2);
        library.add(book3);

        System.out.println(library.getBooksByGenre());
    }
}
