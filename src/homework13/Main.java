package homework13;

public class Main {

    public static void main(String[] args) {
        Author dostoevsky = new Author("Федор", "Достоевский");
        Book besy = new Book("Бесы", "Ф.М. Достоевский", 1872);
        System.out.println("Автор книги - " + besy.getAuthor());
        System.out.println("Автор книги - " + dostoevsky.getFirstName() + " " + dostoevsky.getLastName());
        System.out.println("Книга - " + besy.getBookName() + "," + " год публикации " + besy.getPublicationYear());
        Author pushkin = new Author("Александр", "Пушкин");
        System.out.println("Автор книги - " + pushkin.getFirstName() + " " + pushkin.getLastName());
        Book onegin = new Book("Евгений Онегин", "А.С. Пушкин", 1833);
        System.out.println("Автор книги - " + onegin.getAuthor());
        System.out.println("Книга - " + onegin.getBookName() + "," + " год публикации " + onegin.getPublicationYear());
        System.out.println();
        besy.setPublicationYear(1871);
        System.out.println("Книга - " + besy.getBookName() + "," + " год публикации " + besy.getPublicationYear());
    }
}