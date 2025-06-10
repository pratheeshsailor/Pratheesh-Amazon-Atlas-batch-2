interface testInterface {

    final int tax = 10; // The constant is named 'tax'


    void display();
}


class TestClass implements testInterface {


    @Override
    public void display(){
        System.out.println("Myclass");
    }
}

class Myclass
{
    public static void main(String[] args)
    {
        TestClass t = new TestClass();
        t.display();

        System.out.println(t.tax); // ✅ This will work.

    }
}