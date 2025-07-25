class Employee {
    private int pwd;
    protected int salary;
    public int empid;

    // Constructor
    Employee() {
        System.out.println("Employee constructor called");
    }
}

class task037 extends Employee {

    task037() {
        super(); // Call parent constructor
//        pwd = 123;
        salary = 50000;      // ✅ protected: accessible in child class
        empid = 10001;       // ✅ public: accessible everywhere
    }

    public static void main(String[] args) {
        task037 obj = new task037();
        System.out.println("Salary: " + obj.salary);
        System.out.println("Emp ID: " + obj.empid);
    }
}

