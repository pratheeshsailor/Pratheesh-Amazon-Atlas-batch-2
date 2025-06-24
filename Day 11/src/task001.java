import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class task001 {
    public static void main(String[] args) {

        String fileName = "FileName01.txt";

        byte[] textBytes = {'I', ' ', 'L', 'O', 'V', 'E', ' ', 'I', 'N', 'D', 'I', 'A'};

        try (FileOutputStream outfile = new FileOutputStream(fileName)) {
            outfile.write(textBytes);
            System.out.println("Write Byte " + fileName);
        } catch (IOException e) {
            // Print a more descriptive error message along with the stack trace
            System.err.println("An error occurred while writing to the file: " + e.getMessage());
            e.printStackTrace();
        }

        System.out.println("Thank You...!!!");
    }
}
