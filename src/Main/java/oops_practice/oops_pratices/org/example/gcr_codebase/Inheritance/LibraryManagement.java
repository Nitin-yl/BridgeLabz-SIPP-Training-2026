package Main.java.oops_practice.oops_pratices.org.example.gcr_codebase.Inheritance;

class Book {

    protected String title;
    protected int publicationYear;

    public Book(String title, int publicationYear) {
        this.title = title;
        this.publicationYear = publicationYear;
    }
}

class Author extends Book {

    private String name;
    private String bio;

    public Author(String title, int publicationYear, String name, String bio) {
        super(title, publicationYear);
        this.name = name;
        this.bio = bio;
    }

    public void displayInfo() {
        System.out.println("Book Title: " + title);
        System.out.println("Publication Year: " + publicationYear);
        System.out.println("Author Name: " + name);
        System.out.println("Author Bio: " + bio);
    }
}

public class LibraryManagement {

    public static void main(String[] args) {

        Author author = new Author(
                "Java Programming",
                2025,
                "Nitin Goyal",
                "Software Developer and Java Enthusiast"
        );

        author.displayInfo();
    }
}