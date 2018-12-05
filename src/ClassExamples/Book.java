package ClassExamples;

public class Book {
    private String title, author;
    private int id;
    static int nextid = 0;
    
    public Book(String t, String a){
        title = t;
        author = a;
        nextid++;
        id = nextid;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Book{" + "title=" + title + ", author=" + author + ", id=" + id + '}';
    }
    
    
}
