package task4srp;

public class Main {
    public static void main(String[] args) {
        Employee emp = new Employee("Alice", "alice@example.com", 50000);

        EmployeeReport report = new EmployeeReport();
        report.generatePdfReport(emp);

        EmployeeMailer mailer = new EmployeeMailer();
        mailer.sendEmail(emp);
    }
}
