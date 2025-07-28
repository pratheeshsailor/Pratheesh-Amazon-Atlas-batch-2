import java.util.LinkedList;
import java.util.Spliterator;

import java.util.*;
public class task014 {
    public static void main(String[] args)     {


        LinkedList<String> l = new LinkedList<>();


        l.add("Pratheesh");
        l.add(".K");
        l.add("BE");
        l.add("MBA");

        System.out.println(l);

        Spliterator<String> it = l.spliterator();


        System.out.println("Splitting the list:");
        it.forEachRemaining(System.out::println);
    }
}
