package homework13;

public class Main {

    public static void main(String[] args) {
        Author dostoevsky = new Author("Федор", "Достоевский");
        Book besy = new Book("Бесы", 1872);
        System.out.println("Автор книги - " + dostoevsky.getFirstName() + " " + dostoevsky.getLastName());
        System.out.println("Книга - " + besy.getBookName() + "," + " год публикации " + besy.getPublicationYear());
        Author pushkin = new Author("Александр", "Пушкин");
        Book onegin = new Book("Евгений Онегин", 1833);
        System.out.println("Автор книги - " + pushkin.getFirstName() + " " + pushkin.getLastName());
        System.out.println("Книга - " + onegin.getBookName() + "," + " год публикации " + onegin.getPublicationYear());
        System.out.println();
        besy.setPublicationYear(1871);
        System.out.println("Книга - " + besy.getBookName() + "," + " год публикации " + besy.getPublicationYear());
    }
}