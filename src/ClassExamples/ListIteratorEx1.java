package ClassExamples;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorEx1 {

    static ArrayList<String> al = new ArrayList();
    static ListIterator li;
    static int pos = 0; //just used to show position of the iterator

    public static void main(String[] args) {
        al.add("a");
        al.add("b");
        al.add("c");
        //make iterator
        li = al.listIterator();
        showList();
        //move 1
        System.out.println("1 - Moving over " + li.next());
        pos++;
        showList();
        //move 2
        System.out.println("2 - Moving over " + li.next());
        pos++;
        showList();
        //move 3
        System.out.println("3 - Removing last thing travelled over");
        li.remove();
        pos--;
        showList();
        //move 4
        System.out.println("4 - Adding b back in");
        li.add("b");
        pos++;
        showList();
        //move 5
        System.out.println("5 - Moving over " + li.next());
        pos++;
        showList();
        //move 6
        System.out.println("6 - Moving over " + li.previous());
        pos--;
        showList();
        //move 7
        System.out.println("7 - Removing last thing travelled over");
        li.remove();
        showList();
        //move 8
        System.out.println("8 - Moving over " + li.previous());
        pos--;
        showList();
        //move 9
        System.out.println("9 - Replace last thing travelled over with e");
        li.set("e");
        showList();
        //move 10
        System.out.println("10 - Adding b back in");
        li.add("b");
        pos++;
        showList();
        //move 11
        System.out.println("11 - Adding c back in");
        li.add("c");
        pos++;
        showList();
        //move 12
        System.out.println("12 - Try to remove");
        try {
            li.remove(); //throw an error
        } catch (Exception e) {
            System.out.println("Move 12 failed");
        }
        //move 13
        System.out.println("13 - Moving over " + li.next());
        pos++;
        showList();
        //move 14
        System.out.println("14 - Try to call next at end of list");
        try {
            li.next(); //throw an error
        } catch (Exception e) {
            System.out.println("Move 14 failed");
        }
    }

    public static void showList() {
        for (int i = 0; i < al.size(); i++) {
            if (i == pos) {
                System.out.print("*");
            }
            System.out.print(al.get(i));
        }
        if (pos == al.size()) {
            System.out.print("*");
        }
        System.out.println("");
    }

}
