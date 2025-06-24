import java.io.*;

class task007 {
    public static void main(String args[]) {
        try {
            FileInputStream file1 = new FileInputStream("FileName02.txt");
            FileInputStream file2 = new FileInputStream("NewFile05.txt");
            BufferedOutputStream br2 = new BufferedOutputStream(new FileOutputStream("MergedFile.txt"));


            int ch;

            // Write content of file1
            while ((ch = file1.read()) != -1) {
                br2.write(ch);
            }

            // Write a newline
            br2.write('\n');

            // Write content of file2
            while ((ch = file2.read()) != -1) {
                br2.write(ch);
            }

            file1.close();
            file2.close();
            br2.close();

            System.out.println("Merged two files successfully!");
        } catch (IOException e) {
            System.out.println("Sorry..!! File Not Found or IO Error: " + e.getMessage());
        }
    }
}
