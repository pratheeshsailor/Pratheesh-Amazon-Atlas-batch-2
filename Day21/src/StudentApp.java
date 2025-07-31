class Student {
    private int roll_no = 10; // Encapsulated field

    // Getter method
    public int getRoll() {
        System.out.println("getRoll method called");
        return roll_no;
    }

    // Setter method with validation
    public void setRoll(int roll) {
        if (roll <= 100) {
            this.roll_no = roll;
        } else {
            System.out.println("Invalid roll number: " + roll);
        }
    }
}

public class StudentApp {
    public static void main(String[] args) {
        Student sobj = new Student();

        // Using setter method (respects validation)
        sobj.setRoll(110); // Invalid, will not set
        sobj.setRoll(99);  // Valid

        // Using getter method
        System.out.println("The roll no of student is: " + sobj.getRoll());
    }
}
