public class task004 {// swap a number
    public static void main(String[] args) {
    int a = 2;
    int b = 5;
    //Before swapping
    System.out.println("Before swapping: a = " + a + ", b = " + b);

    int temp = a;
    a = b;
    b = temp;
    //After swapping
    System.out.println("After swapping: a = " + a + ", b = " + b);
}

}
