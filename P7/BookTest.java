package P7;

public class BookTest {
    public static void main(String[] args) {
        Author[] authors = new Author[3];
        authors[0] = new Author("Tan Ah Teck", "AhTeck@somewhere.com", 'm');
        authors[1] = new Author("Paul Tan", "Paul@nowhere.com", 'm');
        authors[2] = new Author("Dastan Akatov", "DastanAkatov@nowhere.com", 'm');

        Book javaDummy = new Book("Java for Dummy", authors, 19.99, 99);
        System.out.println(javaDummy);
        System.out.println(javaDummy.getAuthorNames());
        for(Author author: javaDummy.getAuthors()) {
            System.out.println(author);
        }

    }
}