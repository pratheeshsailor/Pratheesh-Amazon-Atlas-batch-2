import java.io.*;
public class task006_1{
    public static void main(String args[])
    {
        try
        {
            byte b=0;
            FileInputStream infile = new FileInputStream("FileName02.txt");
            FileOutputStream outfile = new FileOutputStream("NewFile05new.txt");

            // Initialize byteread here….
            int byteread = infile.read();
            while(byteread != -1)
            {
                b=(byte) byteread;
                outfile.write(b);
                byteread = infile.read();
            }
            System.out.println("Byte Copied From in.txt to out.txt FIle ");
        }
        catch(FileNotFoundException e)
        {
            System.out.println("Sorry..!! File Not Found...!!!");
        }
        catch(IOException e)
        {
            System.out.println(e.getMessage());
        }
    }
}