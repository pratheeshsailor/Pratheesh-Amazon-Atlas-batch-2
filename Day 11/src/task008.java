/*this task. The first command line argument is the old filename and the second is  the newfilename.
 */
import java.io.*;
public class task008 {
    public static void main(String args[]) {
        File f1 = new File(args[0]);
        File f2 = new File(args[1]);
        f1.renameTo(f2);
        System.out.println("Rename File " + f1 + " To " + f2 + " Sucessfully ");
    }
}
