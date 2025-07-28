import java.io.FileWriter;
import java.io.IOException;

// Class that holds Customer2 data — single responsibility
class Customer2 {
    private String name;
    private String custID;

    public Customer2(String name, String custID) {
        this.name = name;
        this.custID = custID;
    }

    public String getName() {
        return name;
    }

    public String getCustID() {
        return custID;
    }
}

// Class that handles file operations — single responsibility
class ManagingFiles {
    public void saveData(Customer2 Customer2) {
        try {
            FileWriter fw = new FileWriter(Customer2.getName() + ".txt");
            fw.write("The Customer2 name is: " + Customer2.getName() + "\n");
            fw.write("The Customer2 ID is: " + Customer2.getCustID() + "\n");
            fw.close();
            System.out.println("Data saved to file with the Customer2's name.");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}

// Public class for execution — only one public class allowed
public class SRP_Imple {
    public static void main(String[] args) {
        Customer2 cobj = new Customer2("Prasunamba", "C001");
        ManagingFiles mobj = new ManagingFiles();
        mobj.saveData(cobj);
    }
}
