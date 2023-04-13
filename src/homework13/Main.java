package homework13;

public class Main {

    public static void main(String[] args) {
        Author dostoevsky = new Author("Федор", "Достоевский");
        Book besy = new Book("Бесы", new Author("Федор", "Достоевский"), 1872);
        System.out.println("Книга - " + besy.getBookName() + "," + " " + "автор - " + dostoevsky.getFirstName() + " " + dostoevsky.getLastName() + "," + " год публикации " + besy.getPublicationYear());
        Author pushkin = new Author("Александр", "Пушкин");
        Book onegin = new Book("Евгений Онегин", new Author("Александр", "Пушкин"), 1833);
        System.out.println("Книга - " + onegin.getBookName() + "," + " " + "автор - " + pushkin.getFirstName() + " " + pushkin.getLastName() + "," + " год публикации " + onegin.getPublicationYear());
        System.out.println();
        besy.setPublicationYear(1871);
        System.out.println("Книга - " + besy.getBookName() + "," + " год публикации " + besy.getPublicationYear());
    }
}