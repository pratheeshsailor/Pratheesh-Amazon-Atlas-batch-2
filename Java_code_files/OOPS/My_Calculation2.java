class Calculation{
    int z;

    public void addition(int x, int y) {
        z = x + y;
        System.out.println("The sum of the given numbers:"+z);
    }

    public void Subtraction(int x, int y) {
        z = x - y;
        System.out.println("The difference between the given numbers:"+z);
    }
}

public class My_Calculation2 extends Calculation {
    public void multiplication(int x, int y) {
        z = x * y;
        System.out.println("The product of the given numbers:"+z);
    }

    public static void main(String[] args) {
        int a = 20, b = 10;
        My_Calculation2 obj = new My_Calculation2();
        obj.addition(a, b);
        obj.Subtraction(a, b);
        obj.multiplication(a, b);
    }
}
