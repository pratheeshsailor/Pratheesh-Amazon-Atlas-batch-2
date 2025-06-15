import java.util.*;
class task010 {
    public static void main(String args[]){
        ArrayList<String> al = new ArrayList<>();
        al.add("Pratheesh");
        al.add("Bala");
        System.out.println("Orignal List : "+al);

        al.add(1, "Allwin");
        System.out.println("After Adding element at index 1 : "+ al);

        al.remove(0);
        System.out.println("Element removed from index 0 : "+ al);

        al.remove("Bala");
        System.out.println("Element Bala removed : "+ al);

        al.set(0, "K");
        System.out.println("List after updation of value : "+al);
    }
}

