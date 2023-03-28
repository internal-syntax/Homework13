package homework13;

public class Book {
    private String bookName;
    private int publicationYear;

    public Book(String bookName, int publicationYear) {
        this.bookName = bookName;
        this.publicationYear = publicationYear;
    }

    public String getBookName() {
        return this.bookName;
    }

    public int getPublicationYear() {
        return this.publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }
}
