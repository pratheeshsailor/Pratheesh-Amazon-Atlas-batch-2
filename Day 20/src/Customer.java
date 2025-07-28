import java.io.FileWriter;
import java.io.IOException;

public class Customer {
    String name;
    String custID;

    public Customer(String name, String custID) {
        this.name = name;
        this.custID = custID;
    }

    public String getName() {
        return name;
    }

    public String getCustID() {
        return custID;
    }

    // ❌ This method violates SRP - Customer class should not handle file saving logic
    public void saveData() {
        try {
            FileWriter fw = new FileWriter(name + ".txt");
            fw.write("Customer Name: " + name + "\n");
            fw.write("Customer ID: " + custID + "\n");
            fw.close();
            System.out.println("Data saved in file named after the customer.");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Customer cobj = new Customer("Pratheesh", "C001");
        cobj.saveData();
    }
}

