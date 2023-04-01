package homework13;

public class Book {
    private final String bookName;
    private Author author;
    private int publicationYear;

    public Book(String bookName, Author author, int publicationYear) {
        this.bookName = bookName;
        this.publicationYear = publicationYear;
        this.author = author;
    }

    public String getBookName() {
        return this.bookName;
    }

    public Author getAuthor() {
        return this.author;
    }

    public int getPublicationYear() {
        return this.publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    @Override
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Book c2 = (Book) other;
        return bookName.equals(c2.bookName) && author.equals(c2.author);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(bookName, author, publicationYear);
    }

    @Override
    public String toString() {
        return "Название книги - " + bookName + ", " + author + ", год издания - " + publicationYear;
    }
}

