package ClassExamples;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorEx2 {

    public static void main(String[] args) {
        ArrayList <Book> b = new ArrayList();
        ListIterator books = b.listIterator();
        books.add(new Book("It", "Stephen King"));
        books.add(new Book("Davinci Code", "Dan Brown"));
        books.add(new Book("Air Force 1", "Tom Clancey"));
        
        System.out.println("Rewind to beginning");
        while(books.hasPrevious()){
            System.out.println(books.previous());
        }
        
        Book temp = new Book("Losing Weight", "Jenny Craig");
        System.out.println("\nInserting " + temp + " at 3rd spot");
        books.next();
        books.next();
        books.add(temp);
        
        System.out.println("\nDeleting Davinci Code");
        books.previous();
        books.previous();
        books.remove();
        
        System.out.println("\nFinal list");
        while(books.hasPrevious()){
            books.previous();
        }
        while(books.hasNext()){
            System.out.println(books.next());
        }
    }
    
}
