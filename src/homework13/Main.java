package homework13;

public class Main {

    public static void main(String[] args) {
        Author dostoevsky = new Author("Иван", "Достоевский");
        Author dost = new Author("Федор", "Достоевский");
        Book besy = new Book("Бесы", dostoevsky, 1872);
        Book besi = new Book("Бесы", dost, 1872);
        System.out.println("Книга - " + besy.getBookName() + "," + " " + "автор - " + dostoevsky.getFirstName() + " " + dostoevsky.getLastName() + "," + " год публикации " + besy.getPublicationYear());
        Author pushkin = new Author("Александр", "Пушкин");
        Book onegin = new Book("Евгений Онегин", new Author("Александр", "Пушкин"), 1833);
        System.out.println("Книга - " + onegin.getBookName() + "," + " " + "автор - " + pushkin.getFirstName() + " " + pushkin.getLastName() + "," + " год публикации " + onegin.getPublicationYear());
        System.out.println();
        besy.setPublicationYear(1871);
        System.out.println("Книга - " + besy.getBookName() + "," + " год публикации " + besy.getPublicationYear());
        System.out.println();
        System.out.println(dostoevsky);
        System.out.println(besy);
        System.out.println();
        System.out.println(pushkin);
        System.out.println(onegin);
        System.out.println();
        System.out.println(dostoevsky.equals(dost));
        System.out.println();
        System.out.println(besy.equals(besi));
    }
}