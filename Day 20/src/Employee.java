public class Employee {
    private String name;
    private String email;
    private double salary;

    public Employee(String name, String email, double salary) {
        this.name = name;
        this.email = email;
        this.salary = salary;
    }

    // Core responsibility: Employee data
    public String getDetails() {
        return "Name: " + name + ", Email: " + email + ", Salary: ₹" + salary;
    }

    // Additional responsibility: Report generation — violates SRP
    public void generatePdfReport() {
        System.out.println("Generating PDF report for " + name);
        // Imagine actual PDF code here
    }

    // Additional responsibility: Sending email — violates SRP
    public void sendEmail() {
        System.out.println("Sending email to " + email);
        // Imagine actual email code here
    }

    public static void main(String[] args) {
        Employee emp = new Employee("Alice", "alice@example.com", 60000);
        System.out.println(emp.getDetails());
        emp.generatePdfReport();  // Not Employee's responsibility
        emp.sendEmail();          // Not Employee's responsibility
    }
}
