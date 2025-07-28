import java.util.LinkedList;
import java.util.Spliterator;

public class task015 {
    public static void main(String[] args) {
        LinkedList<String> llobj = new LinkedList<>();
        llobj.add("Pratheesh");
        llobj.add("K");
        llobj.add("BE");
        llobj.add("MBA");


        Spliterator<String> itobj1 = llobj.spliterator();
        Spliterator<String> itobj2 = itobj1.trySplit();

        System.out.println("Spliterator 1:");
        while (itobj1 != null && itobj1.tryAdvance(n -> System.out.println(n)));

        System.out.println("Spliterator 2:");
        while (itobj2 != null && itobj2.tryAdvance(n -> System.out.println(n)));
    }
}
