class Employee2 {
    private String name;
    private String email;
    private double salary;

    public Employee2(String name, String email, double salary) {
        this.name = name;
        this.email = email;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public double getSalary() {
        return salary;
    }

    public String getDetails() {
        return "Name: " + name + ", Email: " + email + ", Salary: ₹" + salary;
    }
}

// Single Responsibility: Generating reports
class ReportGenerator {
    public void generatePdfReport(Employee2 Employee2) {
        System.out.println("Generating PDF report for " + Employee2.getName());
        // Simulated report generation
    }
}

// Single Responsibility: Sending emails
class EmailSender {
    public void sendEmail(String recipient, String message) {
        System.out.println("Sending email to " + recipient);
        System.out.println("Message: " + message);
        // Simulated email send
    }
}

// Main class for testing
public class SRPExample {
    public static void main(String[] args) {
        Employee2 emp = new Employee2("John Doe", "john@example.com", 75000);

        ReportGenerator reportGen = new ReportGenerator();
        EmailSender emailSender = new EmailSender();

        System.out.println(emp.getDetails());

        reportGen.generatePdfReport(emp);
        emailSender.sendEmail(emp.getEmail(), "Your PDF report is ready.");
    }
}
