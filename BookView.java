public class BookView {


    public void displayBookDetails(Book book) {
        System.out.println("Book Details:");
        System.out.println("Title: " + book.getTitle());
        System.out.println("Author: " + book.getAuthor());
        System.out.println("ISBN: " + book.getIsbn());
        System.out.println("Genre: " + book.getGenre());
        System.out.println();
    }

    
    public void displayDetailedBookInfo(Book book) {
        System.out.println("Detailed Book Information:");
        System.out.println("Title: " + book.getTitle());
        System.out.println("Author: " + book.getAuthor());
        System.out.println("ISBN: " + book.getIsbn());
        System.out.println("Genre: " + book.getGenre());
        
        System.out.println();
    }
}
