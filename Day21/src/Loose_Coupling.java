class Student2 {
    private int roll_no = 0;

    public int getRoll() {
        System.out.println("getRoll method");
        return roll_no;
    }

    public void setRoll(int roll) {
        if (!(roll > 100)) {
            roll_no = roll;
        } else {
            System.out.println("Invalid roll number: " + roll);
        }
    }
}

public class Loose_Coupling {
    public static void main(String[] args) {
        Student2 sobj = new Student2();  // Could also be: Person pobj = new Student2(); (with an interface)

        sobj.setRoll(10);  // Valid roll number
        System.out.println("The roll no of Student2 is " + sobj.getRoll());
    }
}

