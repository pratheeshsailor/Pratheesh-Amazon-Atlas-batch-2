import java.io.*;
import java.util.*;

public class task003 {
    public static void main(String args[]) {
        FileOutputStream outfile = null;

        // Initialize Scanner
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string to write into the file:");
        String s = sc.nextLine();

        byte b1[] = s.getBytes();

        try {
            outfile = new FileOutputStream("FileName02.txt");
            outfile.write(b1);
        } catch(IOException e) {
            System.out.println(e);
            System.exit(-1);
        }

        System.out.println("Write Byte");
        System.out.println("Thank You...!!!");

        // Close the output stream and scanner
        try {
            if (outfile != null) outfile.close();
            sc.close();
        } catch (IOException e) {
            System.out.println("Error closing resources: " + e);
        }
    }
}
