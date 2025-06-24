// Write a program which creates file and writes character into that file.
import java.io.*;

public class task004 {
    public static void main(String args[]) {
        File f1 = new File("FileName03.txt");
        FileWriter fw = null;

        try {
            fw = new FileWriter(f1);
            fw.write("ahmedabad \n");
            fw.write("baroda \n");
        } catch (FileNotFoundException e) {
            System.out.println("Sorry..!! File Not Found...!!!");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (fw != null) fw.close();
            } catch (IOException e) {
                System.out.println("Error while closing FileWriter: " + e.getMessage());
            }
        }

        System.out.println("write operation done!!");
    }
}
