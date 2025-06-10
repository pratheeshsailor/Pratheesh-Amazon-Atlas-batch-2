class Student {
    public int roll_no;
    public String name;

    // Parameterized constructor
    Student(int roll_no, String name) {
        this.roll_no = roll_no;
        this.name = name;
    }

    // Optional: Define default constructor if needed
    Student() {
        this.roll_no = 0;
        this.name = "unknown";
    }
}

public class task023 {
    public static void main(String[] args) {

        // Optional: Create some Student objects
        Student sobj1 = new Student();
        Student sobj2 = new Student();
        Student sobj3 = new Student();

        // Declare and allocate memory for 5 Student objects
        Student[] arr = new Student[5];

        // Initialize each element with values
        arr[0] = new Student(1, "aman");
        arr[1] = new Student(2, "vaibhav");
        arr[2] = new Student(3, "shikar");
        arr[3] = new Student(4, "dharmesh");
        arr[4] = new Student(5, "mohit");

        // Access and print each element
        for (int i = 0; i < arr.length; i++)
            System.out.println("Element at " + i + " : { " +
                    arr[i].roll_no + " " + arr[i].name + " }");
    }
}
