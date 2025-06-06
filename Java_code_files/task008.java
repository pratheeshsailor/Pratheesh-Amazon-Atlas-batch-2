public class task008 {
    class Customer {
        void accept() {
            System.out.println("accept customer called");
        }
        void display() {
            System.out.println("display customer called");
        }
    }

    public static void main(String[] args) {
        task008 outer = new task008();
        Customer cobj = outer.new Customer();  // Create inner class object
        cobj.accept();
        cobj.display();
    }

}
