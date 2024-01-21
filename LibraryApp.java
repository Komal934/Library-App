public class LibraryApp {

    public static void main(String[] args) {
        
        Book myBook = new Book("The Great Gatsby", "F. Scott Fitzgerald", "978-3-16-148410-0", "Fiction");
        BookView bookView = new BookView();
        BookController bookController = new BookController(myBook, bookView);

        
        System.out.println("Initial Book Details:");
        bookController.updateView();
        System.out.println();

    
        Book newBook = new Book("To Kill a Mockingbird", "Harper Lee", "978-0-06-112008-4", "Classic");

        
        bookController.setBookTitle(newBook.getTitle());
        bookController.setBookAuthor(newBook.getAuthor());
        bookController.setBookIsbn(newBook.getIsbn());
        bookController.setBookGenre(newBook.getGenre());

        
        System.out.println("Book Added. Updated Book Details:");
        bookController.updateView();
        System.out.println();

        
        bookController.setBookGenre("Historical Fiction");

        
        System.out.println("Book Information Updated. Updated Book Details:");
        bookController.updateView();
    }
}
