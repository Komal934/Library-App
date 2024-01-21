public class BookController {

    private Book model;
    private BookView view;

    public BookController(Book model, BookView view) {
        this.model = model;
        this.view = view;
    }

    
    public void setBookTitle(String title) {
        model.setTitle(title);
    }

    public void setBookAuthor(String author) {
        model.setAuthor(author);
    }

    public void setBookIsbn(String isbn) {
        model.setIsbn(isbn);
    }

    public void setBookGenre(String genre) {
        model.setGenre(genre);
    }

    
    public void updateView() {
        view.displayBookDetails(model);
    }

}
