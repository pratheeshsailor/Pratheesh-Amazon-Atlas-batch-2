import java.io.*;

public class task006 {
    public static void main(String args[]) {
        FileInputStream infile = null;
        FileOutputStream outfile = null;

        try {
            infile = new FileInputStream("FileName01.txt");
            outfile = new FileOutputStream("NewFile05.txt");

            int byteread; // Declare and initialize read variable
            while ((byteread = infile.read()) != -1) {
                outfile.write(byteread); // Write the read byte
            }

            System.out.println("Byte Copied From FileName01.txt to NewFile05.txt");
        } catch (FileNotFoundException e) {
            System.out.println("Sorry..!! File Not Found...!!!");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (infile != null) infile.close();
                if (outfile != null) outfile.close();
            } catch (IOException e) {
                System.out.println("Error while closing streams: " + e.getMessage());
            }
        }
    }
}

